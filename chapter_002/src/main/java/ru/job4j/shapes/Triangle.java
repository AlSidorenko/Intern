package ru.job4j.shapes;

/**
 * Created on 08.09.2017.
 *
 * The class implements the triangle.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Triangle implements Shape {

    /**
     * Method implements the triangle.
     * @return - square.
     */
    public String pic() {
        StringBuilder sb = new StringBuilder();
        sb.append("   *   \r\n");
        sb.append("  ***  \r\n");
        sb.append(" ***** \r\n");
        sb.append("*******\r\n");
        return sb.toString();
    }
}
