package ru.job4j.conversion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 24.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConversionListArrTest {

    /**
     * Conversion test.
     */
    @Test
    public void whenListArrToList() {
        ConversionListArr conversionListArr = new ConversionListArr();
        List<Integer> expected = conversionListArr.convert(asList(new int[]{1, 2}, new int[]{3, 4, 5, 6}));
        List<Integer> result = new ArrayList<>(asList(1, 2, 3, 4, 5, 6));
        assertThat(expected, is(result));
    }
}