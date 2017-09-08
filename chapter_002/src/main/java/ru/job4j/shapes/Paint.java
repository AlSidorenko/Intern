package ru.job4j.shapes;

/**
 * Created on 08.09.2017.
 *
 * Class Paint draws the figure.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Paint {

    /**
     * @param shape - triangle, square.
     */
    private Shape shape;

    /**
     * Method draws shape.
     *
     * @param shape - triangle, square.
     */
    public void draw(Shape shape) {
        System.out.println(shape.pic());
    }
}
