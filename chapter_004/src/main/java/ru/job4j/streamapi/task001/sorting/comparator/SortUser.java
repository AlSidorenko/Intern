package ru.job4j.streamapi.task001.sorting.comparator;

import java.util.ArrayList;
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
        List<User> sorting = new ArrayList<>();
        sorting.addAll(users);
        sorting.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        });
        return sorting;
    }

    /**
     * Method sorting by all fields.
     *
     * @param users - list.
     * @return - sorting list.
     */
    public List<User> sortByAllFields(List<User> users) {
        List<User> sorting = new ArrayList<>();
        sorting.addAll(users);
        sorting.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result = o1.getName().compareTo(o2.getName());
                return result != 0 ? result : Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return sorting;
    }
}