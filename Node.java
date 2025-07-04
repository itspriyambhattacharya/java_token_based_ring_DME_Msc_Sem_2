import java.util.ArrayDeque;
import java.util.Queue;

public class Node {
    // Attributes
    private static Queue<Integer> q;
    private int pid; // process id
    private Node next; // pointer to next node

    // Constructor
    public Node(int pid) {
        this.pid = pid;
        q = new ArrayDeque<>();
    }

    // Methods
}
