package advanced;

public class Exercise3 {
    static int fibonicc(int n){
        if (n<=1) {
            return n;
        }
        
        return fibonicc(n-1)+ fibonicc(n- 2);

    }
    public static void main(String[] args) {
        int n =10;

        for (int i = 0; i < n; i++) {
            System.out.print(fibonicc(i) + " ");
        }
    }
    
}
