public class ServerApp {
    public static void main(String[] args) {
        ChatServer server = new SimpleChatServer(5000);
        server.start();
    }
}
