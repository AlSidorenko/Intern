package ru.job4j.loop;
/**
* Package for Chess board.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class Board {
	/**
	 *Paint.
	 *@param width - element.
	 *@param height - element.
	 *@return - board.
	 */
    public String paint(int width, int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    sb.append("x");
                } else {
                    sb.append(" ");
                }
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}