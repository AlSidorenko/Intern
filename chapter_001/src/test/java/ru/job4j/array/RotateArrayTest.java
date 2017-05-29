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
  public class RotateArrayTest {
	/**
     * Test Rotate Array 3 x 3.
     */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		RotateArray ra = new RotateArray();
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] resultArray = ra.rotate(a);
		int[][] expectedArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(resultArray, is(expectedArray));
    }
	/**
     * Test Rotate Array 2 x 2.
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray ra = new RotateArray();
		int[][] a = {{1, 2}, {3, 4}};
		int[][] resultArray = ra.rotate(a);
		int[][] expectedArray = {{3, 1}, {4, 2}};
		assertThat(resultArray, is(expectedArray));
    }
}