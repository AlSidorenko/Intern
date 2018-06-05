package ru.job4j.sorting.comparable;

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
     * Main Class.
     *
     * @param args - array of String.
     */
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(
                new User("Alec", 39),
                new User("David", 3),
                new User("Anna", 31),
                new User("Peter", 30)
                )
        );

        System.out.println(new SortUser().sort(users));
    }
}
