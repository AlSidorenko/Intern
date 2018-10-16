package ru.job4j.task001;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 15.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CountingFunctionInRangeTest {

    /**
     * Ad reference to the CountingFunctionInRange.
     */
    private CountingFunctionInRange function = new CountingFunctionInRange();

    /**
     * The first element of the range.
     */
    private int start = 1;

    /**
     * The last element of the range.
     */
    private int end = 5;

    /**
     * Linear function test.
     */
    @Test
    public void whenReturnLinearFunction() {
        List<Double> result = function.diapason(start, end, x -> 5 * x + 1);
        List<Double> expected = Arrays.asList(6D, 11D, 16D, 21D);
        assertThat(result, is(expected));
    }

    /**
     * Quadratic test.
     */
    @Test
    public void whenReturnQuadraticFunction() {
        List<Double> result = function.diapason(start, end, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D);
        assertThat(result, is(expected));
    }

    /**
     * Test logarithmic function.
     */
    @Test
    public void whenReturnLogarithmicFunction() {
        List<Double> result = function.diapason(start, end, Math::log);
        List<Double> expected = Arrays.asList(0D, 0.6931471805599453, 1.0986122886681098, 1.3862943611198906);
        assertThat(result, is(expected));
    }
}
