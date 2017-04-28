package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Point Test.
 * Function y = a * x + b.
 * y = 10*x - 3.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
	/**
     * Test Point coordinates.
	 * a(-2; 17).
     */
    @Test
    public void isFalse() {
        Point point = new Point(-2, 17);
		boolean result = point.is(10, -3);
		boolean expected = false;
		assertThat(result, is(expected));
    }
	/**
     Test Point coordinates.
	 * b(1; 7).
     */
    @Test
    public void isTrue() {
        Point point = new Point(1, 7);
		boolean result = point.is(10, -3);
		boolean expected = true;
		assertThat(result, is(expected));
    }
}