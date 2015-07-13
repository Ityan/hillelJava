package com.hillel.java.sockets;

import com.hillel.java.pattern.strategy.Main;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author ITyan on 15.06.2015.
 */
public class Client {

    public static void main(String[] args) throws IOException {
        new Client().start();
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            send(line);
        }
    }

    public void send(String line) throws IOException {
        Socket socket = new Socket("192.168.0.104", 3111);
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.println(line);

        writer.close();
        socket.close();
    }
}
