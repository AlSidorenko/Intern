/**
 * Created on 05.11.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.streamapi.task000;

/*
В JDK 1.8 ввели интерфейс Stream https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
Этот интерфейс позволяет гибко работать над коллекциями.
Stream API работает совместно с лямбда.
Самый простой способ начать использовать этот АПИ.
Начнем с базовой схемы работы потоков.
Каждый элемент коллекции проходить 3 стадии.

1. Фильтрация.

2. Преобразование.

3. Упрощении или Хранение.

Каждая стадия может использоваться отдельно или совместно.
Давайте начнем с примера.

1. Фильтрация.

Отфильтруем все задачи, где в имени есть слово BUG и сохраним ее в коллекцию List.

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", spent=" + spent +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}

Рассмотрим деталей.

List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());

tasks.stream() - получаем объект типа Stream

filter(
                task -> task.name.contains("Bug")
        )
Для этого объекта выполняем метод filter, который принимает лямбда выражение Predicate<Task>
task -> task.name.contains("Bug")  - задаем условие. что пропускать только те задачи, которые содержат слово Bug.

.collect(Collectors.toList()); - полученные результат сохранить в коллекции типа List.

2. Преобразование.
Допустим, что бы сходим получить только имена задач. Для этого нужно применить метод map.

List<String> names = tasks.stream().map(
        task -> task.name
).collect(Collectors.toList());

3. Упрощение.
Давайте теперь посчитаем общую сумму потраченную на все задачи.

long total = tasks.stream().map(
        task -> task.spent
).reduce(0L, Long::sum);
.reduce(0L, Long::sum); - каждое значение task.spent - нужно сложить с начальным значение 0L.
В результате мы получим общее время потраченное на все задачи.

 */