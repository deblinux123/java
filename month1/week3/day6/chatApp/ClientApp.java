public class ClientApp {
    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient("localhost", 5000, "Farid");
        client.start();
    }
}
