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
        return (first > second) ? first : second;
    }
	/**
	 *Max element of three numbers.
	 *@param first - first element.
	 *@param second - second element.
	 *@param third - third element.
	 *@return - max element.
	 */
	public int maxOfThreeNumbers(int first, int second, int third) {
        int maxFirst = max(first, second);
        int maxSecond = max(maxFirst, third);
        return maxSecond;
    }
}