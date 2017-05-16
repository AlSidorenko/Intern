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
public class CounterTest {
	/**
     * Test sum element.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
		int result = counter.add(1, 10);
		int expected = 30;
		assertThat(result, is(expected));
    }
}