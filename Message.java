public class Message {

    private String msgType;
    private int processId;

    public Message(String msgType, int pid) {
        this.msgType = msgType;
        this.processId = pid;
    }
}