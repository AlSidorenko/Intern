package ru.job4j.loop;
/**
* Package for Pyramid.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class Paint {
	/**
	 *Paint - Pyramid.
	 *@param h - height.
	 *@return - pyramid.
	 */
    public String pyramid(int h) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 2 * h - 1; j++) {
                if (((2 * h - 1) / 2) - i > j || ((2 * h - 1) / 2) + i < j) {
                    sb.append(" ");
                } else {
                    sb.append("^");
                }
            }
            sb.append("\r\n");
        }
        return sb.toString();
    }
}