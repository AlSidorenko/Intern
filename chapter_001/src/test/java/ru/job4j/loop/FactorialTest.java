package ru.job4j.loop;

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
public class FactorialTest {
	/**
     * Test factorial - 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
		int result = factorial.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
    }
	/**
     * Test factorial - 1.
     */
	@Test
    public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(0);
		int expected = 1;
		assertThat(result, is(expected));
	}
}