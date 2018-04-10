package ru.job4j.list;

import java.util.List;

/**
 * Created on 09.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConvertList2Array {

    /**
     * The method converts the list into a two-dimensional array.
     * @param list - List Integer.
     * @param rows - number of rows.
     * @return - array.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = 3;
        int[][] result = new int[rows][cells];
        int i = 0;
        int j = 0;

        for (Integer value : list) {
            result[i][j] = value;
            j++;
            if (j > rows - 1) {
                i++;
                j = 0;
            }
        }
        return result;

        // second version.
        /*int cells = 3;
        int[][] array = new int[cells][rows];
        int counter = 0;

        for (Integer value : list) {
            array[counter / rows][counter % rows] = value;
            counter++;
        }
        return array;*/
    }
}
