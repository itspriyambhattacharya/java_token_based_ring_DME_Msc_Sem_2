import java.util.Queue;

public class Message {

    private String msgType;
    private int processId;

    public Message(String msgType, int pid) {
        this.msgType = msgType;
        this.processId = pid;
    }

    public Message(String msgType, int pid, Queue<Integer> q) {
        this.msgType = msgType;
    }
}