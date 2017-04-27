package ru.job4j.max;

/**
 * Max.
 *
 * @author Aleks Sidorenko (alek.siadorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
	/**
	 *Max element.
	 *@param first - first element.
	 *@param second - second element.
	 *@return - max element.
	 */
	 public int max(int first, int second) {
        int maxelem = (first > second) ? first : second;
        return maxelem;
    }
}