package ru.job4j.test;

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
public class CheckSubstrTest {
	/**
     * Test Check for substring.
     */
    @Test
    public void CheckForSubstring() {
        Test t = new Test();
		boolean result = t.contains("Java", "ava");
		boolean expected = true;
		assertThat(result, is(expected));
    }
	/**
     * Test Check for substring.
     */
    @Test
    public void CheckForSubstring() {
        Test t = new Test();
		boolean result = t.contains("Java", "avo");
		boolean expected = false;
		assertThat(result, is(expected));
    }
}