import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Exercise11 {
     public static void main(String[] args) {
        Path sourceDir = Paths.get("src\\excist");
        Path targetDir = Paths.get("src\\target"); 

        try {
            if (!Files.exists(targetDir)) {
                Files.createDirectory(targetDir);
            }

            Files.walk(sourceDir)
                .forEach(sourcePath -> {
                    try {
                        Path targetPath = targetDir.resolve(sourceDir.relativize(sourcePath));
                        if (Files.isDirectory(sourcePath)) {
                            if (!Files.exists(targetPath)) {
                                Files.createDirectory(targetPath);
                            }
                        } else {
                            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

            System.out.println("Files copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
