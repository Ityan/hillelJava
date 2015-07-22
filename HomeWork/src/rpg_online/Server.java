package rpg_online;


import lesson_7.RPG_Swing.GameBuilder;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author ITyan on 22.07.2015.
 */
public class Server {

    private static final int PORT = 7777;

    private ServerSocket serverSocket;

    private GameBuilder g;

    // queue, where are stored all SockedThread for sending
    BlockingQueue<SocketProcessor> queue = new LinkedBlockingQueue<>();

    public Server() throws IOException {
        serverSocket = new ServerSocket(PORT);
        g = new GameBuilder();
    }

    /**
     * Main method
     *
     * @param args
     * @throws IOException IOException
     */
    public static void main(String[] args) throws IOException {
        new Server().startServer();
    }

    /**
     * Main loop listening/waiting of a connection
     */
    public void startServer() {
        while (true) {
            Socket socket = getNewConnection();
            if (socket != null) {
                try {
                    final SocketProcessor processor = new SocketProcessor(socket);
                    final Thread thread = new Thread(processor);
                    thread.setDaemon(true);
                    thread.start();
                    queue.offer(processor);
                } catch (IOException ignored) {
                }
            }
        }
    }

    /**
     * Awaiting a new connection
     *
     * @return Socket new connection
     */
    public Socket getNewConnection() {
        Socket socket = null;
        try {
            socket = serverSocket.accept();
        } catch (IOException e) {
            // if the error at the time of receive - shutdown the server
            shutdownServer();
        }
        return socket;
    }

    /**
     * Method for a shutting down rpg_online.Server
     */
    private synchronized void shutdownServer() {
        for (SocketProcessor s : queue) {
            s.close();
        }
        if (!serverSocket.isClosed()) {
            try {
                serverSocket.close();
            } catch (IOException ignored) {
            }
        }
    }

    /**
     * Inner class for asynchronous processing of a connection
     */
    private class SocketProcessor implements Runnable {

        Socket socket;

        BufferedReader input;
        ObjectOutputStream output;

        /**
         * Save the socket, try to create a reader and writer
         *
         * @param s socket
         * @throws IOException Error in the creation of input or output
         */
        SocketProcessor(Socket s) throws IOException {
            socket = s;
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new ObjectOutputStream(socket.getOutputStream());

            for (SocketProcessor sp : queue) {
                sp.send(g);
            }
        }

        @Override
        public void run() {
            while (!socket.isClosed()) {
                try {
                    String line = input.readLine();
                        switch (line) {
                            case "btn1":
                                g.getPlayer2().takeHealth(g.getPlayer1().getPersonageDamage());
                                break;
                            case "btn2":
                                g.getPlayer1().takeHealth(g.getPlayer2().getPersonageDamage());
                                break;
                        }
                        for (SocketProcessor sp : queue) {
                            sp.send(g);
                        }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * Method sends the resulting object to the socket
         *
         * @param g object for a sending
         */
        public synchronized void send(GameBuilder g) {
            try {
                output.writeObject(g);
                output.flush();
            } catch (IOException e) {
                close();
            }
        }

        /**
         * method closes the socket and remove it from the list of active sockets
         */
        public synchronized void close() {
            queue.remove(this); //delete from a list
            if (!socket.isClosed()) {
                try {
                    socket.close();
                } catch (IOException ignored) {
                }
            }
        }
    }
}
