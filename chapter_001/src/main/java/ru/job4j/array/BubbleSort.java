package ru.job4j.array;
/**
* Package for Array.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class BubbleSort {
	/**
	 *Sort - array.
	 *@param array - source array.
	 *@return - sort array.
	 */
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}