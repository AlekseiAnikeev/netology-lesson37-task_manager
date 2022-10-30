package ru.netology.javacore;

import java.util.*;

public class Todos {
    private final int MAX_TASKS = 7;
    private final List<String> taskList = new ArrayList<>();
    private final Stack<Task> taskStack = new Stack<>();

    public void addTask(String task) {
        if (taskList.size() < MAX_TASKS) {
            taskList.add(task);
            taskStack.push(new Task(OperationType.ADD, task));
        }
    }

    public void removeTask(String task) {
        taskList.remove(task);
        taskStack.push(new Task(OperationType.REMOVE, task));
    }

    public void restoreTask() {
        if (!taskStack.isEmpty()) {
            Task restoreTask = taskStack.pop();
            switch (restoreTask.getType()) {
                case ADD: {
                    taskList.remove(restoreTask.getTask());
                    break;
                }
                case REMOVE: {
                    taskList.add(restoreTask.getTask());
                    break;
                }
            }
        }
    }

    public String getAllTasks() {
        Collections.sort(taskList);
        return String.join(" ", taskList);
    }
}
