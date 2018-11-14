package ru.job4j.streamapi.task001.sorting.comparator;

import java.util.Comparator;
import java.util.List;

/**
 * Created on 05.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SortUser {

    /**
     * Method sorting by name length.
     *
     * @param users - list.
     * @return - sorting list.
     */
    public List<User> sortNameLength(List<User> users) {
        users.sort(Comparator.comparing(User::getNameLength));
        return users;
    }

    /**
     * Method sorting by all fields.
     *
     * @param users - list.
     * @return - sorting list.
     */
    public List<User> sortByAllFields(List<User> users) {
        users.sort(Comparator.comparing(User::getName).thenComparing(User::getAge));
        return users;
    }
}