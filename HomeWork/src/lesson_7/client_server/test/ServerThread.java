package lesson_7.client_server.test;

import lesson_7.client_server.game.GameBuilder;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author ITyan on 09.07.2015.
 */
public class ServerThread extends Thread {

    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    private GameBuilder game;

    public ServerThread(Socket socket, GameBuilder game) throws IOException {
        this.game = game;

        outputStream = new ObjectOutputStream(socket.getOutputStream());
        inputStream = new ObjectInputStream(socket.getInputStream());

        outputStream.writeObject(game);
    }

    @Override
    public void run() {
        while (true) {
            try {
                game = (GameBuilder) inputStream.readObject();
                outputStream.writeObject(game);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
