import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

public class Node implements Runnable {
    // Attributes
    public static Queue<Integer> q;
    private int pid; // process id
    private Node next; // pointer to next node
    private boolean hasToken;
    private boolean wantToEnter;

    // Constructor
    public Node(int pid) {
        this.pid = pid;
        q = new ArrayDeque<>();
        this.hasToken = false;
        this.wantToEnter = false;
    }

    // Methods
    public void setNext(Node x) {
        this.next = x;
    }

    public void setToken(boolean b) {
        this.hasToken = true;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 20 + 1));
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
