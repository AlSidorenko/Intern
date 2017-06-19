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
     * Test check for substring.
     */
    @Test
    public void checkForSubstringTrue() {
        CheckSubstr chs = new CheckSubstr();
		String origin = "Java";
        String sub = "ava";
		boolean result = chs.contains(origin, sub);
		boolean expected = true;
		assertThat(result, is(expected));
    }
	/**
     * Test check for substring.
     */
    @Test
    public void checkForSubstringFalse() {
        CheckSubstr chs = new CheckSubstr();
		String origin = "Java";
        String sub = "avo";
		boolean result = chs.contains(origin, sub);
		boolean expected = false;
		assertThat(result, is(expected));
    }
}