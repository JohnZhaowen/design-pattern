package com.john.distribution.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientSocketDemo1 {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("127.0.0.1", 8080);
        PrintWriter out = new PrintWriter(socket.getOutputStream());

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        while (!line.equals("bye")) {
            out.println(line);
            out.flush();
            System.out.println("Client: " + in.readLine());
            line = reader.readLine();
        }
    }
}
