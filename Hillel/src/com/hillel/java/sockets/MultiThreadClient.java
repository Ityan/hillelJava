package com.hillel.java.sockets;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by ITyan on 15.06.2015.
 */
public class MultiThreadClient {

    Socket socket;
    PrintWriter writer;

    public static void main(String[] args) throws IOException {
        new MultiThreadClient().start();
    }

    public void start() throws IOException {
        socket = new Socket("192.168.0.112", 3111);
        writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            send(line);
        }
    }

    public void send(String line) throws IOException {
        writer.println(line);
        writer.flush();
    }

}
