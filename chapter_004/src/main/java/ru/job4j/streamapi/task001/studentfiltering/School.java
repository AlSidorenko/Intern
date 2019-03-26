package ru.job4j.streamapi.task001.studentfiltering;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created on 31.01.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class School {

    /**
     * The method counts the number of items in the list.
     * @param students - list.
     * @param predicate - boolean variable.
     * @return - map.
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
