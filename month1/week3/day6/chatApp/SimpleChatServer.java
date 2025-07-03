import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleChatServer implements ChatServer {
    private final int port;
    private final Set<ClientHandler> clients = Collections.synchronizedSet(new HashSet<>());

    public SimpleChatServer(int port) {
        this.port = port;
    }

    @Override
    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("💬 Server started on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler client = new ClientHandler(socket, this);
                clients.add(client);
                new Thread(client).start();
            }

        } catch (IOException e) {
            System.out.println("⚠️ Server error: " + e.getMessage());
        }
    }

    @Override
    public void broadcast(String message, ClientHandler sender) {
        synchronized (clients) {
            for (ClientHandler client : clients) {
                if (client != sender) {
                    client.sendMessage(message);
                }
            }
        }
    }

    @Override
    public void removeClient(ClientHandler client) {
        clients.remove(client);
    }
}
