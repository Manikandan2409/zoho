
class StackArray<T>{
    int max;
    int top;
    T[] val;

    @SuppressWarnings("unchecked")
    StackArray(int max){
        this.max =max;
        val=(T[])new Object[max];
        top = -1;
    }
    boolean isFull(){
        return (top == max-1);
    }
    
    boolean isEmpty(){
        return top==-1;
    }

    void push(T data){
        if (isFull()) {
            System.out.println("Stack Full!");
            return;
        }
        val[++top] = data;
        System.out.println(data+" inserted at "+ top +" position");
    }

    void pop(){
        if (isEmpty()) {
            System.out.println("Stack already Empty");
            return;
        }
        T data=val[top--];
        System.out.println("Poped value: "+ data+" top value:"+top);
    }
    void peek(){
        if (isEmpty()) {
            System.out.println("Stack Empty");
        }
        T data = val[top];
        System.out.println("Stack peek Element : "+ data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
           // System.out.println(val[i]);
            sb.append(val[i]+" ");
        }
        return sb.toString();
    }

}
public class Exercise3 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        StackArray<Integer> sa = new StackArray(10);
        for (int i = 1; i <= 10; i++) {
            sa.push(i*10);
        }
        sa.pop();
        
        sa.peek();
        
        System.out.println("Top :"+sa.top);
        System.out.println("Stack Elements: "+sa);
    }    
}
