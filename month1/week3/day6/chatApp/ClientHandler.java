// ClientHandler.java
import java.io.*;
import java.net.*;


class ClientHandler implements Runnable {
    private final Socket socket;
    private final ChatServer server;
    private BufferedReader reader;
    private BufferedWriter writer;
    private String username;

    public ClientHandler(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            writer.write("Enter your name: ");
            writer.flush();
            username = reader.readLine();

            server.broadcast("🔔 " + username + " joined the chat.", this);
            sendMessage("✅ You joined the chat!");

        } catch (IOException e) {
            closeConnection();
        }
    }

    @Override
    public void run() {
        String msg;
        try {
            while ((msg = reader.readLine()) != null) {
                server.broadcast(username + ": " + msg, this);
            }
        } catch (IOException e) {
            System.out.println(username + " disconnected.");
        } finally {
            closeConnection();
            server.removeClient(this);
            server.broadcast("❌ " + username + " left the chat.", this);
        }
    }

    public void sendMessage(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            closeConnection();
        }
    }

    private void closeConnection() {
        try {
            if (reader != null) reader.close();
            if (writer != null) writer.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            // Ignore
        }
    }
}
