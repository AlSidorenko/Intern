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
  public class ArrayDuplicateTest {
	/**
     * Test Array Duplicate.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate ad = new ArrayDuplicate();
		String[] values = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] resultArray = ad.remove(values);
		String[] expectedArray = {"Привет", "Мир", "Супер"};
		assertThat(resultArray, is(expectedArray));
    }
}