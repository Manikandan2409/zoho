package MediumLevel;

import java.util.LinkedHashMap;

/**
 * Node
 */


class Node {
    Node left;
    int value;
    Node right;
    Node(int value){
        this.left = null;
        this.value =value;
        this.right = null;
    }
    Node(){
        this.left= this.right = null;  
        this.value=Integer.MIN_VALUE;
    }
}


class Process {
  static  final LinkedHashMap<String,Node> indexNodes = new LinkedHashMap<>();
    Process(String name,Node header){
        indexNodes.put(name,header);
    }

    Process(){

    }
    public void insertElements(String name, int[] values){
       
        if (!indexNodes.containsKey(name)) {
            indexNodes.put(name, new Node(values[0])); 
        }

        Node head = indexNodes.get(name);
        if (head.value == Integer.MIN_VALUE) {
            head.value = values[0]; 
            System.out.println("Updated Root Header Node Value to " + values[0]);
        }

            for (int i : values) {
                insert(head,i);
            }
        
    }
    protected void insert(Node header, int value) {
        if (header == null) {
            System.out.println("Value " + value + " inserted Successfully");
            return;
        }
        if (value < header.value) {
            if (header.left == null) {
                header.left = new Node(value);
                System.out.println("Value " + value + " inserted Successfully");
            } else {
                insert(header.left, value);
            }
        } else if (value > header.value) {
            if (header.right == null) {
                header.right = new Node(value);
                System.out.println("Value " + value + " inserted Successfully");
            } else {
                insert(header.right, value);
            }
        }
    }
    
    public void preOrderTraversal(String head){
       Node headNode = indexNodes.getOrDefault(head, null);
        if (headNode == null) {
           System.out.println("Node Header Node Found in the name "+ head);
        }
        preOrder(headNode);
    }

    private void preOrder(Node head) {
        if (head != null) {
            System.out.print(head.value + " ");
            preOrder(head.left);
            preOrder(head.right);
        }
    }
    
    protected void deleteElements(String head, int value){
        if (!indexNodes.containsKey(head)) {
            System.out.println("No Tree found with name "+head);
        }
   
    }
    protected void inorderTraversal(String head){
        Node headNode = indexNodes.getOrDefault(head, null);
        if (headNode == null) {
            System.out.println("Node HeaderNt found in the name "+ head);
        }
        inOrder(headNode);
    }
    private void inOrder(Node headNode){
        if (headNode!=null) {
            inOrder(headNode.left);
            System.out.print(headNode.value+" ");
            inOrder(headNode.right);
        }
    }
}
public class Exercise7 {
    public static void main(String[] args) {
   
        Process index = new Process("First", new Node());
            index.insertElements("First", new int[]{34,12,36,10,15,35,37});
        index.preOrderTraversal("First");  
        index.deleteElements("First",12);      
    }
}
