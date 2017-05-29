package ru.job4j.array;
/**
* Package for Array.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class RotateArray {
	/**
	 *Rotate - array.
	 *@param array - source array.
	 *@return - rotate array.
	 */
    public int[][] rotate(int[][] array) {
            for (int i = 0; i < array.length / 2; i++) {
                for (int j = i; j < array.length - 1 - i; j++) {
                    int temp = array[i][j];
                    array[i][j] = array[array.length - 1 - j][i];
                    array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                    array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
                    array[j][array.length - 1 - i] = temp;
                }
            }
        return array;
    }
}