package ru.job4j.streamapi.task001.sorting.comparator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 05.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SortUserTest {

    /**
     * Test sorting by name length.
     */
    @Test
    public void whenSortNameLength() {
        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(
                new User("Sergey", 25),
                new User("Ivan", 30),
                new User("Sergey", 20),
                new User("Ivan", 25)
        ));
        List<User> result = new SortUser().sortNameLength(users);

        List<User> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(
                new User("Ivan", 30),
                new User("Ivan", 25),
                new User("Sergey", 25),
                new User("Sergey", 20)
        ));

        assertThat(result, is(expected));
    }

    /**
     * Test sorting by all fields.
     */
    @Test
    public void whenSortByAllFields() {
        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(
                new User("Sergey", 25),
                new User("Ivan", 30),
                new User("Sergey", 20),
                new User("Ivan", 25)
        ));
        List<User> result = new SortUser().sortByAllFields(users);

        List<User> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(
                new User("Ivan", 25),
                new User("Ivan", 30),
                new User("Sergey", 20),
                new User("Sergey", 25)
        ));

        assertThat(result, is(expected));
    }
}