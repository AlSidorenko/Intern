package ru.job4j.condition;

/**
 * Function y = a * x + b.
 *
 * @author Aleks Sidorenko (alek.siadorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
	/**
	 *Coordinate Point x.
	 */
    private int x;
	/**
	 *Coordinate Point y.
	 */
    private int y;
	/**
	 *Constructor.
	 *@param x - Point coordinate.
	 *@param y - Point coordinate.
	 */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
	/**
	 *Method getX.
	 *@return x - Point coordinate.
	 */
    public int getX() {
        return this.x;
    }
	/**
	 *Method getY.
	 *@return y - Point coordinate.
	 */
    public int getY() {
        return this.y;
    }
	/**
	 *Method is.
	 *@param a - Function parameter.
	 *@param b - Function parameter.
	 *@return boolean: true or false.
	 */
    public boolean is(int a, int b) {
        return ((a * getX()) + b == getY()) ? true : false;
    }
}