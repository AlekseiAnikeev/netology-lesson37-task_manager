package ru.netology.javacore;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Todos todos = new Todos(); // тут нужно было-бы передать максимальное количество задач, но по условию менять main нельзя
        TodoServer server = new TodoServer(8989, todos);
        server.start();
    }
}
