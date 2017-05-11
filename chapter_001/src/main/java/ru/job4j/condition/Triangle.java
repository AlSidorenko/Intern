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
	 *Method area.
	 *Gerone formula.
	 *ab - Triangle side.
	 *bc - Triangle side.
	 *ac - Triangle side.
	 *p - Semiperimeter.
	 *@return Area Of A Triangle.
	 */
    public double area() {
		double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        double ac = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
        double bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        double p = (ab + ac + bc) / 2;
        if (((ab + bc) <= ac) || ((ab + ac) <= bc) || ((ac + bc) <= ab) || ((ab - bc) >= ac) || ((ab - ac) >= bc) || ((bc - ac) >= ab)) {
            return -1;
        } else if ((ab == 0) || (bc == 0) || (ac == 0)) {
            return 0;
        } else {
            return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
    }
}