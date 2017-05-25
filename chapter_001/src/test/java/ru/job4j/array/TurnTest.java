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
public class TurnTest {
	 /**
     * Test Turn Array.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] a = {1, 2, 3, 4, 5};
		int[] resultArray = turn.back(a);
		int[] expectedArray = {5, 4, 3, 2, 1};
		assertThat(resultArray, is(expectedArray));
    }
	/**
     * Test Turn Array.
     */
	  @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] a = {2, 6, 1, 4};
		int[] resultArray = turn.back(a);
		int[] expectedArray = {4, 1, 6, 2};
		assertThat(resultArray, is(expectedArray));
    }
}