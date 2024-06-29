package advanced;

/**
 * TestFive
 */
class TestFive extends Thread {
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
public class Exercise5 {
    public static void main(String[] args) {
        TestFive t = new TestFive();
        t.start();
    }
}
