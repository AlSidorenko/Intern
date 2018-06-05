package ru.job4j.sorting.comparable;

import org.junit.Test;

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
     * Test sorting.
     */
    @Test
    public void whenSortingComparable() {
        assertThat(new User("Anna", 31).compareTo(
                new User("Alec", 39)), is(-1));

        assertThat(new User("Anna", 31).compareTo(
                new User("David", 3)), is(1));
    }
}
