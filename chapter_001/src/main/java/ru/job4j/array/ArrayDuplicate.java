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
        int end = array.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (array[i] == array[j]) {
                    int shiftLeft = j;
                    for (int k = j + 1; k < end; k++, shiftLeft++) {
                        array[shiftLeft] = array[k];
                    }
                    end--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, end);
    }
}