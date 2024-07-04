package polymorphism;
/*
 * Create an interface called "Playable" with a method called "play".
 * Create classes such as "Guitar" and "Piano" that implement the "Playable" interface
 */
/**
 * Play
 */
interface Playable {
void play();
}
/**
 * Guitar 
 */
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Guitar playing");
    }
}
/**
 * Piano
 */
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
    
}
public class Exercise3 {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play();

        Guitar guitar = new Guitar();
        guitar.play();

        Piano piano2 = new Piano(){
            
            public void play() {
                System.out.println("Playing");
            }
        };
        piano2.play();
    }
}
