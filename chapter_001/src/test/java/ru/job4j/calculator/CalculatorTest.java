package ru.job4j.calculator;

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
public class CalculatorTest {
	/**
     * Test mult.
     */
    @Test
    public void whenAddOneMultOneThenTwo() {
        Calculator calc = new Calculator();
		calc.multiple(2D, 2D);
		double result = calc.getResultMult();
		double expected = 4D;
		assertThat(result, is(expected));
    }
	/**
     * Test div.
     */
    @Test
    public void whenAddOneDivOneThenTwo() {
        Calculator calc = new Calculator();
		calc.div(6D, 2D);
		double result = calc.getResultDiv();
		double expected = 3D;
		assertThat(result, is(expected));
    }
	/**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
		calc.add(2D, 1D);
        double result = calc.getResultAdd();
        double expected = 3D;
        assertThat(result, is(expected));
    }
	/**
     * Test substruct.
     */
    @Test
    public void whenAddOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
		calc.substruct(2D, 1D);
		double result = calc.getResultSubst();
		double expected = 1D;
		assertThat(result, is(expected));
    }
}