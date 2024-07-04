import java.util.LinkedList;
import java.util.Scanner;

/*•	Implement a stack data structure in Java using an array or a linked list.
    The stack should have push, pop, and peek methods. */
class StackList{
     private  final LinkedList<Integer> stack = new LinkedList<>();
    private  String name;
     public StackList(){

    }
    public StackList(String name){setName(name);}
    public StackList(String name,Integer[] nums){
       setName(name);
        for (Integer integer : nums) {
            stack.add(integer);
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void push(Integer num){
        stack.add(num);
    }
    public Integer pop(){
        return stack.removeLast();
    }
    public Integer peek(){
        return stack.getLast();
    }
    public int size(){
        return stack.size();
    }
    public int getIndex(int Integer){
        for (int i = stack.size()-1; i >0; i--) {
            if (Integer == stack.get(i)) {
                return i;
            }
        }
        return -1;
    }

}
    public class Exercise10 {
    public static void main(String[] args) {
        StackList stack = new StackList();
       Scanner in = new Scanner(System.in);
       for (int i = 0; i < 3; i++) {
            System.out.println("Enter "+(i+1)+ " th element in the stack");
            stack.push(in.nextInt()); 
       }
     
    System.out.println("Stack Size :"+stack.size());
    System.out.println("GEtting the peek element :"+stack.peek());
    System.out.println("Taking stack last Element :"+ stack.pop());
    System.out.println("New Stack last Element :"+ stack.peek());
    System.out.println("Enter a number to get the Stack index :");
    System.out.println("Status :"+stack.getIndex(in.nextInt()));  
    in.close();
    }
}
