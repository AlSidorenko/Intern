package ru.job4j.max;

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
public class MaxTest {
	/**
     * Test max element.
     */
    @Test
    public void whenMaxElem() {
        Max maxElem = new Max();
		int result = maxElem.max(1, 3);
		int expected = 3;
		assertThat(result, is(expected));
    }
	/**
     * Test max element of third numbers.
     */
    @Test
    public void whenMaxElemOfThirdNumb() {
        Max maxElem = new Max();
		int result = maxElem.maxOfThreeNumbers(4, 2, 3);
		int expected = 4;
		assertThat(result, is(expected));
    }
}