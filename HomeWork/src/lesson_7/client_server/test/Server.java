package lesson_7.client_server.test;

import lesson_7.RPG_Swing.GameBuilder;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ITyan on 08.07.2015.
 */
public class Server {

    private static final int PORT = 5678;

    private ServerSocket serverSocket;
    private Socket socket;

    private static GameBuilder gameBuilder = new GameBuilder();

    public static void main(String[] args) {
        new Server().start();
    }

    public void start() {
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("server started....");

            while (true) {
                socket = serverSocket.accept();
                System.out.println("player connected...");

                ServerThread serverThread = new ServerThread(socket, gameBuilder);
                serverThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
