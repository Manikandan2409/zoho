/*
 * Exercise 6
 *6) Implement a binary tree data structure in Java using either an array or a linked list.
 The tree should have methods for inserting, deleting, and searching for nodes.
 */


@SuppressWarnings({ "rawtypes", "unchecked","hiding" })
class BinaryTree<T extends Comparable<T>>{

    class Node<T>{
            T key;
            
            Node left, right;

            Node(T key){
                this.key = key;
                left = right = null;
            }
    }

    Node<T> root;

    public void insert(T key){
        root =insertKey(root,key);
    }
    private Node<T> insertKey(Node<T> root,T key){
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            root.left = insertKey(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertKey(root.right, key);
        }

        return root;
    }


    public void delete(T key){
        root = deleteKey(root,key);
    }
    private Node<T> deleteKey(Node<T> root, T key){
        if (root == null) {
            return root;
        }

        if (key.compareTo(root.key) < 0) {
            root.left = deleteKey(root.left, key);
        
        } else if (key.compareTo(root.key) > 0) {
            root.right = deleteKey(root.right, key);
        
        } else {
            if (root.left == null) {
                return root.right;
        
            } else if (root.right == null) {
                return root.left;
            }

            root.key = (T) minValue(root.right);
            root.right = deleteKey(root.right, root.key);
        }

        return root;
    }

    private T minValue(Node<T> root) {
        Node<T> current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.key;
    }
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void preOrder(){
        preOrderRec(root);
    }

    private void preOrderRec(Node<T> root) {
        if (root != null) {
            
            System.out.print(root.key + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){
        postOrderRec(root);
    }
    private void postOrderRec(Node<T> root) {
        if (root != null) {
            
            postOrderRec(root.left);
            
            postOrderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public boolean search(T key) {
        return searchKey(root, key);
    }

    private boolean searchKey(Node<T> root, T key) {
        if (root == null) {
            return false;
        }
        if (key.compareTo(root.key) == 0) {
            return true;
        } else if (key.compareTo(root.key) < 0) {
            return searchKey(root.left, key);
        } else {
            return searchKey(root.right, key);
        }
    }
}


 public class Exercise6 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
    
        System.out.println("Inorder: ");
        tree.inorder();
        System.out.println();
        System.out.println("PreOrder");
        tree.preOrder();
        System.out.println();

        System.out.println("Post Order");
        tree.postOrder();
        System.out.println();
        
        System.out.println("Search value 20"+ tree.search(20));
        System.out.println("Search value 80"+ tree.search(80));

        tree.delete(100);
        System.out.println("Traversing");
        tree.inorder();

        System.out.println("Search 100 :"+ tree.search(100));

    }
}
