package ru.job4j.streamapi.task001.sorting.comparable;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created on 05.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SortUser {

    /**
     * Sorting method.
     *
     * @param users - Array List users.
     * @return - TreeSet.
     */
    Set<User> sort(List<User> users) {
        Set<User> sorting = new TreeSet<>();
        sorting.addAll(users);
        return sorting;
    }
}
