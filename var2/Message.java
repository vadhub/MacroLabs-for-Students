
class Message {
    private String id;
    private String text;
    private String sender;
    private long timestamp;

    public Message(String text, String sender) {
        this.id = "msg_" + System.currentTimeMillis();
        this.text = text;
        this.sender = sender;
        this.timestamp = System.currentTimeMillis();
    }

    public void onDraw() {
        System.out.println("Drawing message from " + sender + ": " + text);
    }

    @Override
    public String toString() {
        return "Message{from='" + sender + "', text='" + text + "'}";
    }
}
