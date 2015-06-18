package com.hillel.java.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ITyan on 15.06.2015.
 */
public class SockedThread implements Runnable{

    private Socket socket;
    private Map<InetAddress, String> ipToName;

    public SockedThread(Socket socket, Map<InetAddress, String> ipToName) {
        this.socket = socket;
        this.ipToName = ipToName;
    }

    @Override
    public void run() {
        try {
            InetAddress address = socket.getInetAddress();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
                String line = reader.readLine();

                if (line == null) {
                    break;
                }

                if (line.contains("intro ")) {
                    String name = line.replace("intro ", "");
                    ipToName.put(address, name);
                }

                System.out.println(getName(address) + ": " + line);
            }

            reader.close();
            socket.close();
        }catch (IOException e) {
            System.out.println(e);
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
