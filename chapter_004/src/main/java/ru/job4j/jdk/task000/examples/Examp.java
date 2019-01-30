package ru.job4j.jdk.task000.examples;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created on 30.01.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Examp {

    /**
     * Main class.
     * @param args - array.
     */
    public static void main(String[] args) {

        List.of(2, 4, 3, 4).stream()
                .takeWhile(v -> v % 2 == 0)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);

        System.out.println();

        List.of(2, 4, 3, 4).stream()
                .dropWhile(v -> v % 2 == 0)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);

        System.out.println();

        Stream.of(1, null, 2, null, 3)
                .flatMap(Stream::ofNullable)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);

        System.out.println();

        Stream.iterate(0, i -> i < 10, i -> i + 1)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);
    }
}
