import basics.Help;

public class PatternPrinting {
    public static void main(String[] args) {
        new PatternPrinting().pyrammidNumberPattern();
        
    }
  //5.1 Square pattern of stars
    void square(){
         Help.begin();
        System.out.println("Progarm to print Square pattern of stars");
        Help.printLine();
        System.out.println("Enter  base value of a square");
        int a= Help.in.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        Help.end();

    }
    // 5.2 Right triangle pattern of stars
     void rightTriangle(){
        Help.begin();
        System.out.println("Program to print Right Triangle");
        Help.printLine();
       System.out.println("Enter height of the right triangle");
        int n = Help.in.nextInt();
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        Help.end();

     }
     // 5.3 Left triangle pattern of stars
     void leftTriangle(){
        Help.begin();
        System.out.println("Program to print the left triangle  ");
        Help.printLine();
        System.out.println("Enter  height of the left side triangle ");
        int n=Help.in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j< n-i-1) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            
        }
        Help.end();
 
     }

     // 5.4 Diamond pattern  of stars
     void diamondPattern(){
        int n =4;
        for (int i = 0; i < 2*n; i++) {
            int tcol =i>n ?2*n-i: i;
            int nSpace = n - tcol;
            for (int j = 0; j < nSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < tcol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     }
     // 5.5 Pyramid pattern of numbers
      void pyrammidNumberPattern(){
        int n =5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print increasing sequence
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing sequence
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }


      }
      // 5.6 Staircase pattern of stars:
      void stairCasepattern(){
        int n = 5;
        Help.begin();
        System.out.println("Program for stair calss pattern in stars");
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Help.end();
      }
      // 5.7 Hollow square pattern of stars
        void hollowSquare(){
            Help.begin();
            System.out.println("program to printh the hollow Square");
            Help.printLine();
            System.out.println("Enter base value of the square ");
            int n=Help.in.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i==0||i==n-1||j==0||j==n-1) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            Help.printLine();
    
        }
     // 5.8 hollow  Diamond pattern of stars
     void hollowDiamondPattern(){
        Help.begin();
        System.out.print("Enter the number of rows (should be an odd number): ");
        int numRows = Help.in.nextInt();

        if (numRows % 2 == 0) {
            System.out.println("Please enter an odd number for a symmetric pattern.");
            return;
        } 
            int midRow = numRows / 2 + 1;

            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= numRows; j++) {
                    if (i <= midRow) {
                        if (j == midRow - i + 1 || j == midRow + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    } else {
                        if (j == i - midRow + 1 || j == numRows - (i - midRow)) {
                            System.out.print("*");
                        } else {
                        System.out.print(" ");
                        }
                    }
                }
            System.out.println();
            
        }
        Help.end();

     }
}
