public class ScreenChat {
    private int size;
    private float dpi;
    private Message[] messages;
    private String chatName;
    private int unreadCount;
    private boolean isOnline;

    public ScreenChat(int size, float dpi, Message[] messages, String chatName, 
                     int unreadCount, boolean isOnline) {
        this.size = size;
        this.dpi = dpi;
        this.messages = messages;
        this.chatName = chatName;
        this.unreadCount = unreadCount;
        this.isOnline = isOnline;
    }

    public static class Builder {
        private int size;
        private float dpi;
        private Message[] messages;
        private String chatName;
        private int unreadCount;
        private boolean isOnline;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setDpi(float dpi) {
            this.dpi = dpi;
            return this;
        }

        public Builder setMessages(Message[] messages) {
            this.messages = messages;
            return this;
        }

        public Builder setChatName(String chatName) {
            this.chatName = chatName;
            return this;
        }

        public Builder setUnreadCount(int unreadCount) {
            this.unreadCount = unreadCount;
            return this;
        }

        public Builder setOnline(boolean isOnline) {
            this.isOnline = isOnline;
            return this;
        }

        public ScreenChat build() {
            return new ScreenChat(size, dpi, messages, chatName, unreadCount, isOnline);
        }
    }

    public View onCreateView() {
        System.out.println("ScreenChat.onCreateView() called for chat: " + chatName);
        return new View();
    }

    public void onViewCreated(View v) {
        System.out.println("ScreenChat.onViewCreated() called");
        if (v != null) {
            v.onDraw();
            System.out.println("Setting up chat view: " + chatName);
        }
    }

    public void onCreateOptionsMenu() {
        System.out.println("ScreenChat.onCreateOptionsMenu() called");
        System.out.println("Chat: " + chatName + ", Online: " + isOnline);
    }

    public void sendMessage(String text) {
        System.out.println("Sending message: " + text);
    }

    public void markAsRead() {
        unreadCount = 0;
        System.out.println("All messages marked as read");
    }

    public void showAllMessages() {
        System.out.println("\n=== Messages in " + chatName + " ===");
        if (messages != null) {
            for (Message message : messages) {
                System.out.println(message);
                message.onDraw();
            }
        } else {
            System.out.println("No messages available");
        }
    }

    public void onDestroy() {
        messages = null;
        unreadCount = 0;
        isOnline = false;
        System.out.println("ScreenChat destroyed");
    }

    public void toggleOnlineStatus() {
        isOnline = !isOnline;
        System.out.println("Online status: " + isOnline);
    }
}
