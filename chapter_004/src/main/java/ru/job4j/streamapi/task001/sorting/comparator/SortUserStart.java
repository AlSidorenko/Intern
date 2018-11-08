package ru.job4j.streamapi.task001.sorting.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 05.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SortUserStart {

    /**
     * Main method.
     *
     * @param args - array.
     */
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(
                new User("Sergey", 25),
                new User("Ivan", 30),
                new User("Sergey", 20),
                new User("Ivan", 25)
        ));

        System.out.println(new SortUser().sortNameLength(users));
        System.out.println(new SortUser().sortByAllFields(users));
    }
}
