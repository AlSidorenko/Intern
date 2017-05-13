package ru.job4j.condition;

/**
 * Triangle.
 *
 * @author Aleks Sidorenko (alek.siadorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
	/**
	 *An object Point a.
	 */
    private Point a;
	/**
	 *An object Point b.
	 */
	private Point b;
	/**
	 *An object Point c.
	 */
	private Point c;
	/**
	 *Constructor.
	 *@param a - Point coordinate.
	 *@param b - Point coordinate.
	 *@param c - Point coordinate.
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
		}
    /**
	 *Method Length of Side of Triangle.
	 *Gerone formula.
	 *@param x - Point coordinate.
	 *@param y - Point coordinate.
	 *@return Length of Side.
	 */
    public double lengthSideTriangle(Point x, Point y) {
        return Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + Math.pow(x.getY() - y.getY(), 2));
    }
	/**
	 *Method Area.
	 *Gerone formula.
	 *@return area of triangle.
	 */
    public double area() {
        double ab = lengthSideTriangle(a, b);
        double ac = lengthSideTriangle(a, c);
        double bc = lengthSideTriangle(b, c);
        double p = (ab + ac + bc) / 2;
        return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
    }
}