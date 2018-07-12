package ru.job4j.shapes;

/**
 * Created on 08.09.2017.
 *
 * The class implements the square.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Square implements Shape {

    /**
     * Method implements the square.
     * @return - square.
     */
    public String pic() {
        String line = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append("*******");
        sb.append(System.lineSeparator());
        sb.append("*******");
        sb.append(System.lineSeparator());
        sb.append("*******");
        sb.append(System.lineSeparator());
        sb.append("*******");
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
