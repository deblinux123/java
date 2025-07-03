import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SimpleChatClient implements ChatClinet {
    private Socket socket;
    private BufferedReader reader;
    private BufferedWriter writer;
    private String username;

    public SimpleChatClient(String serverAddress, int port, String username) {
        try {
            this.socket = new Socket(serverAddress, port);
            this.writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.username = username;
        } catch (IOException e) {
            System.out.println("خطا در اتصال به سرور.");
            e.printStackTrace();
        }
    }

    @Override
    public void start() {
        // نخ خواندن پیام‌ها از سرور
        new Thread(() -> {
            String msgFromServer;
            try {
                while ((msgFromServer = reader.readLine()) != null) {
                    System.out.println(msgFromServer);
                }
            } catch (IOException e) {
                System.out.println("ارتباط با سرور قطع شد.");
            }
        }).start();

        // ارسال پیام به سرور
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String message = scanner.nextLine();
                if (message.equalsIgnoreCase("/exit")) {
                    socket.close();
                    break;
                }
                writer.write(username + ": " + message);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("خطا در ارسال پیام.");
        }
    }
}
