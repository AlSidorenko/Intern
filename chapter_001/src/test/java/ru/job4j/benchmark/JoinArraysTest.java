package ru.job4j.benchmark;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created on 04.08.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class JoinArraysTest {
    /**
     * Test check for join array.
     */
    @Test
    public void joinTwoArrays() {
        JoinArrays joinArrays = new JoinArrays();
        int[] a = {1, 3, 10, 13};
        int[] b = {2, 5, 8, 14};
        int[] result = joinArrays.newArray(a, b);
        int[] expected = {1, 2, 3, 5, 8, 10, 13, 14};
        assertThat(result, is(expected));
    }
}