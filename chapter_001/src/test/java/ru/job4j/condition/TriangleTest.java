package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Triangle Test.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
	/**
     * Test Point coordinates.
	 * a(-2; 17).
	 * a(5; -5).
	 * a(-8; 4).
     */
    @Test
    public void isTriangle() {
		Point a = new Point(1, 3);
        Point b = new Point(2, -5);
        Point c = new Point(-8, 4);
        Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = 35.5;
		assertThat(result, is(expected));
    }
}