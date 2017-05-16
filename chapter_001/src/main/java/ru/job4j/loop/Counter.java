package ru.job4j.loop;
/**
* Package for LoopFor.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class Counter {
	/**
	 *Add elements.
	 *@param start - first element.
	 *@param finish - finish element.
	 *@return - sum.
	 */
	public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}