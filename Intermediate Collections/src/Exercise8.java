import java.util.LinkedList;
/*
 * 8) Implement a graph data structure in Java using either an adjacency matrix or an adjacency list.
 * The graph should have methods for adding and removing vertices and edges, and for traversing the graph.

 */
import java.util.List;
import java.util.Stack;
        

class Graph<T>{
     int size;
    LinkedList<List<T>> nodes;
    
    Graph(int vertex){
        size = vertex;
        nodes = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            List<T> node = new LinkedList<>();
            nodes.add(node);
        }
    }
    public void printGraph(){
        if (size<=0) {
            System.out.println("Graph empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print("Vertex "+ i +" ");
            List<T> node = nodes.get(i);
            if (node.size()<=0) {
               System.out.print("none");
            } else {
                for (T value : node) {
                    System.out.print(" -> "+value+" ");
                }
    
            }            
            System.out.println();
        }


    }


    public void addEdge(int v, T destination){
        List<T> vertex = nodes.get(v);
        
        if (vertex == null) {
            System.out.println("Cannot find the vertex");
            return;
        }

        vertex.add(destination);

        
    }

    public void addVertex(int count){
        int n = size+count;
        for(int i= size;i< n;i++){
            nodes.add(new LinkedList<>());
        }
        size=n;
    }

    public void removeVertex(int v) {
        if (v >= size) {
            System.out.println("Graph doesn't have the component");
            return;
        }
        for (int i = 0; i < size; i++) {
            nodes.get(i).removeIf(destination -> destination.equals(v));
        }

        nodes.remove(v);

        size--;

        for (List<T> node : nodes) {
            for (int i = 0; i < node.size(); i++) {
                int value = (Integer) node.get(i);
                if (value > v) {
                    node.set(i, (T) Integer.valueOf(value - 1));
                }
            }
        }
    }

    public void removeEdge(int v,T edge){
       List<T> vertex = nodes.get(v);
       if (vertex == null) {
        System.out.println("Cannot find vertex");
        return;
       }
       vertex.remove(edge);
    }

    public boolean search(int start,int  end){
        if (start>= size || end >= size) {
            System.out.println("Invalid Vertex");
            return false;
        }
    

    boolean[] visited = new boolean[size];
    Stack<Integer> stack = new Stack<>();
    stack.push(start);

    while (!stack.isEmpty()) {
        int current = stack.pop();

        if (current == end) {
            return true;
        }

        if (!visited[current]) {
            visited[current] = true;

            for (T neighbor : nodes.get(current)) {
                stack.push((Integer) neighbor);
            }
        }
    }
    return false;
}
}



public class Exercise8 {
     @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {


        Graph<Integer> graph = new Graph(5);
        graph.printGraph();
    System.out.println();
        graph.addEdge(1, 4);
        graph.addEdge(4, 1);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.printGraph();
    System.out.println();
        graph.addVertex(2);
        graph.printGraph();

    System.out.println();
        graph.removeVertex(5);
        graph.printGraph();

    System.out.println();
        graph.removeEdge(1, 3);
        graph.printGraph();
    System.out.println();

        System.out.println("Searching for path between 1 and 4: " + graph.search(1, 4));
        System.out.println("Searching for path between 1 and 3: " + graph.search(1, 3));
    }

    


     
}
