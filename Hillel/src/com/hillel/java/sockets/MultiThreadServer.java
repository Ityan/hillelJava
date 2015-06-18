package com.hillel.java.sockets;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ITyan on 15.06.2015.
 */
public class MultiThreadServer {

    private Map<InetAddress, String> ipToName = new HashMap<>();

    public static void main(String[] args) throws IOException {
        new MultiThreadServer().start();
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(3111);

        while (true) {
            Socket socket = serverSocket.accept();

            Thread thread = new Thread(new SockedThread(socket, ipToName));
            thread.start();
        }
    }
}
