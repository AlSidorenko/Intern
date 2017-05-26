package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
 public class BubbleSortTest {
	/**
     * Test Turn Array.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort bs = new BubbleSort();
		int[] a = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] resultArray = bs.sort(a);
		int[] expectedArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(resultArray, is(expectedArray));
    }
}