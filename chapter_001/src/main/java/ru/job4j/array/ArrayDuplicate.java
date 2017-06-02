package ru.job4j.array;

import java.util.Arrays;

/**
* Package for Array.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class ArrayDuplicate {
	/**
	 *remove - remove elements of array.
	 *@param array - source array.
	 *@return - array.
	 */
    public String[] remove(String[] array) {
        int countRepeatElement = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    countRepeatElement++;
                    String temp = array[j];
                    for (int k = j; k < array.length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    array[array.length - 1] = temp;
                    break;
                }
            }
        }
        return Arrays.copyOf(array, array.length - countRepeatElement);
    }
}