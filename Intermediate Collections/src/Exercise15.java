import java.util.Comparator;
import java.util.PriorityQueue;

public class Exercise15 {
    public static void main(String[] args) {
        TaskPriorityQueue taskQueue = new TaskPriorityQueue();

        taskQueue.add(new Task("Task 1", 5));
        taskQueue.add(new Task("Task 2", 1));
        taskQueue.add(new Task("Task 3", 3));
        taskQueue.add(new Task("Task 4", 4));
        taskQueue.add(new Task("Task 5", 2));

        System.out.println("Tasks in the priority queue:");
        taskQueue.printTasks();

        System.out.println("\n Peeking at the highest priority task:");
        System.out.println(taskQueue.peek());

        System.out.println("\n Removing tasks from the priority queue:");
        while (taskQueue.peek() != null) {
            System.out.println(taskQueue.remove());
        }

        System.out.println("\n Printing queue");
        taskQueue.printTasks();
    }
}


class Task {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}



class TaskPriorityQueue {
    private PriorityQueue<Task> priorityQueue;

    public TaskPriorityQueue() {
        priorityQueue = new PriorityQueue<>(new TaskComparator());
    }

    public void add(Task task) {
        priorityQueue.add(task);
    }

    public Task remove() {
        return priorityQueue.poll();
    }

    public Task peek() {
        return priorityQueue.peek();
    }

    public void printTasks() {
        for (Task task : priorityQueue) {
            System.out.println(task);
        }
    }
}


class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        return Integer.compare(t2.getPriority(), t1.getPriority());
    }
}
