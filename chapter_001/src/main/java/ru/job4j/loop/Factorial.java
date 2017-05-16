package ru.job4j.loop;
/**
* Package for LoopFor.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class Factorial {
	/**
	 *Factorial.
	 *@param n - element.
	 *@return - result.
	 */
	 public int calc(int n) {
		int factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}