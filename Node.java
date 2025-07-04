import java.util.ArrayDeque;
import java.util.Queue;

public class Node implements Runnable {
    // Attributes
    public static Queue<Integer> q = new ArrayDeque<>();
    private int pid; // process id
    private Node next; // pointer to next node
    private boolean hasToken;
    private boolean wantToEnter;
    private boolean inCS;
    private boolean reqCS;

    // Constructor
    public Node(int pid) {
        this.pid = pid;
        this.hasToken = false;
        this.wantToEnter = false;
        this.inCS = false;
        this.reqCS = false;
    }

    // Methods
    public void setNext(Node x) {
        this.next = x;
    }

    public void setToken(boolean b) {
        this.hasToken = b;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 40 + 1));
            requestCS();
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

    public void requestCS() {
        if (this.hasToken == false) {
            Message reqToken = new Message("TR", this.pid);
        }
    }
}
