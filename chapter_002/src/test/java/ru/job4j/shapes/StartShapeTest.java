package ru.job4j.shapes;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 08.09.2017.
 *
 * Test demonstration of figures.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StartShapeTest {

    /**
     * Triangle testing.
     */
    @Test
    public void triangleTesting() {
        String result = new Triangle().pic();
        final String line = System.getProperty("line.separator");
        String expected = String.format("   *   %s  ***  %<s ***** %<s*******%<s", line);
        assertThat(result, is(expected));
    }

    /**
     * Square testing.
     */
    @Test
    public void squareTesting() {
        String result = new Square().pic();
        final String line = System.getProperty("line.separator");
        String expected = String.format("*******%s*******%<s*******%<s*******%<s", line);
        assertThat(result, is(expected));
    }
}
