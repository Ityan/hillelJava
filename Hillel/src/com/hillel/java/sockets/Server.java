package com.hillel.java.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ITyan on 15.06.2015.
 */
public class Server {

    private Map<InetAddress, String> ipToName = new HashMap<>();

    public static void main(String[] args) throws IOException {
        new Server().start();
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(3111);

        while (true) {
            Socket socket = serverSocket.accept();
            InetAddress address = socket.getInetAddress();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = reader.readLine();

            if (line.contains("intro ")) {
                String name = line.replace("intro ", "");
                ipToName.put(address, name);
            }

            System.out.println(getName(address) + ": " + line);

            reader.close();
            socket.close();
        }
    }

    private String getName(InetAddress address) {
        String name = ipToName.get(address);
        if (name == null) {
            name = address.toString();
        }
        return name;
    }

}
