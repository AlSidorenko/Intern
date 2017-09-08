package ru.job4j.shapes;

/**
 * Created on 08.09.2017.
 *
 * Starting class.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StartShape {

    /**
     * Main method.
     * @param args - array.
     */
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());
    }
}
