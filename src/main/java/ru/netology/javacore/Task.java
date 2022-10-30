package ru.netology.javacore;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 30.10.2022
 */
public class Task {
    private final OperationType type;
    private final String task;

    public Task(OperationType type, String task) {
        this.type = type;
        this.task = task;
    }

    public OperationType getType() {
        return type;
    }

    public String getTask() {
        return task;
    }
}
