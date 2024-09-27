// Corridor.java
import java.util.LinkedList;
import java.util.Queue;

public class Corridor {
    private Queue<Pod> queue;

    public Corridor() {
        queue = new LinkedList<>();
    }

    // Add a pod to the queue (FIFO)
    public void addToCorridor(Pod pod) {
        if (pod == null) {
            throw new IllegalArgumentException("Pod cannot be null");
        }
        queue.add(pod);  // Pod added to the end of the queue
    }

    // Remove a pod from the queue (FIFO)
    public Pod removeFromCorridor() {
        if (queue.isEmpty()) {
            System.out.println("Corridor is empty. No pod to remove.");
            return null;
        }
        return queue.poll();  // Remove the front pod
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get current contents of the corridor
    public Queue<Pod> getQueue() {
        return queue;
    }

    // Print the contents of the corridor
    public void printContents() {
        System.out.println("Corridor contents (Front to Rear): " + queue);
    }
}

