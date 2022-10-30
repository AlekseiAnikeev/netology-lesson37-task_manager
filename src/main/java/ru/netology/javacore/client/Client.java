package ru.netology.javacore.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 30.10.2022
 */
public class Client {
    private static final int PORT = 8989;
    private static final String SERVER_IP = "localhost";

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket(SERVER_IP, PORT);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
//            out.println("{\"type\": \"ADD\", \"task\": \"Первая\"}");
//            out.println("{\"type\": \"ADD\", \"task\": \"Вторая\"}");
//            out.println("{\"type\": \"REMOVE\", \"task\": \"Первая\"}");
//            out.println("{\"type\": \"ADD\", \"task\": \"Третья\"}");
            out.println("{\"type\": \"RESTORE\", \"task\": \"\"}");
            System.out.println(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
