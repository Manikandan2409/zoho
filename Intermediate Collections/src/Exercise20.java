import java.util.HashMap;
import java.util.Map;

public class Exercise20 {
    private Map<String, Integer> wordFrequencyMap;

    public Exercise20() {
        wordFrequencyMap = new HashMap<>();
    }

    public void updateWordFrequencies(String input) {
        String[] words = input.split("\\s+"); 
        for (String word : words) {
            word = word.toLowerCase();
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1); 
        }
    }

    public Map<String, Integer> getWordFrequencyMap() {
        return wordFrequencyMap;
    }

    public static void main(String[] args) {
        Exercise20 counter = new Exercise20();
        counter.updateWordFrequencies("No Fighting");
        counter.updateWordFrequencies("No Fucking Fighting!!!");
        counter.updateWordFrequencies("My Name is Thomas Shelbhy");
        
        Map<String, Integer> wordFrequencyMap = counter.getWordFrequencyMap();
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
