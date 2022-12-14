package ru.netology.javacore;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodosTests {

    @Test
    @DisplayName("Проверка возможности добавить задачу (не более 7 задач!)")
    void shouldBeAddTaskInList() {
        String expectation = "Завтрак Залив Заправка Магазин Обед Подъем Работа";
        Todos todos = new Todos();
        todos.addTask("Подъем");
        todos.addTask("Завтрак");
        todos.addTask("Магазин");
        todos.addTask("Работа");
        todos.addTask("Обед");
        todos.addTask("Заправка");
        todos.addTask("Залив");
        todos.addTask("Ужин");
        todos.addTask("Сон");

        assertEquals(expectation, todos.getAllTasks());
    }

    @Test
    @DisplayName("Удаление")

    public void testTodosRemoveTask() {
        String expectation = "Завтрак Магазин Подъем";
        Todos todos = new Todos();
        todos.addTask("Подъем");
        todos.addTask("Работа");
        todos.addTask("Завтрак");
        todos.addTask("Магазин");

        todos.removeTask("Работа");

        assertEquals(expectation, todos.getAllTasks());
    }

    @Test
    @DisplayName("сортировка по алфавиту")
    void shouldBeSorted() {
        String expectation = "Завтрак Магазин Подъем Работа";
        Todos todos = new Todos();
        todos.addTask("Подъем");
        todos.addTask("Работа");
        todos.addTask("Завтрак");
        todos.addTask("Магазин");

        assertEquals(expectation, todos.getAllTasks());
    }

    @Test
    @DisplayName("Восстановление последних операций")
    void shouldBeRestored() {
        String expectation = "Вторая Первая";
        Todos todos = new Todos();
        todos.addTask("Первая");
        todos.addTask("Вторая");
        todos.removeTask("Первая");
        todos.addTask("Третья");

        todos.restoreTask();
        todos.restoreTask();

        assertEquals(expectation, todos.getAllTasks());
    }
}
