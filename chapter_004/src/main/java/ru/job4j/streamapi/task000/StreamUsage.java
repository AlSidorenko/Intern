package ru.job4j.streamapi.task000;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created on 05.11.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StreamUsage {

    /**
     * Inner class.
     */
    public static class Task {

        /**
         * Name.
         */
        private final String name;

        /**
         * Spent time.
         */
        private final long spent;

        /**
         * Constructor.
         * @param name - name.
         * @param spent - spent time.
         */
        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" + "name='" + name + '\''
                    + ", spent=" + spent + '}';
        }
    }

    /**
     * Starting method.
     * @param args - String array.
     */
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>(
                asList(
                        new Task("Bug #1", 100),
                        new Task("Task #2", 100),
                        new Task("Bug #3", 100)
                )
        );

        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);

        List<String> names = tasks.stream().map(
                task -> task.name
        ).collect(Collectors.toList());
        names.forEach(System.out::println);

        long total = tasks.stream().map(
                task -> task.spent
        ).reduce(0L, Long::sum);
        System.out.printf("%s ms.", total);
    }
}
