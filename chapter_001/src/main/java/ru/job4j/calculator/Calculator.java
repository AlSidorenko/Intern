package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Aleks Sidorenko (alek.siadorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
	/**
	 *Simple Calculator.
	 */
    private double result;
	/**
	 *
	 *@param first - munbet first.
	 *@param second - number second.
	 */
	public void multiple(double first, double second) {
        this.result = first * second;
    }
	/**
	 *
	 *@return - result Mult.
	 */
    public double getResultMult() {
        return this.result;
    }
	/**
	 *
	 *@param first - munbet first.
	 *@param second - number second.
	 */
	public void div(double first, double second) {
        this.result = first / second;
    }
	/**
	 *
	 *@return - result Div.
	 */
    public double getResultDiv() {
        return this.result;
    }
	/**
	 *
	 *@param first - munbet first.
	 *@param second - number second.
	 */
	public void substruct(double first, double second) {
        this.result = first - second;
    }
	/**
	 *
	 *@return - result substruct.
	 */
    public double getResultSubst() {
        return this.result;
    }
	/**
	 *
	 *@param first - munbet first.
	 *@param second - number second.
	 */
	public void add(double first, double second) {
        this.result = first + second;
    }
	/**
	 *
	 *@return - result add.
	 */
    public double getResultAdd() {
        return this.result;
    }
}