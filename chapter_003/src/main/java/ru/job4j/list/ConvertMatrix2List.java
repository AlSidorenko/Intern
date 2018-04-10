package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 26.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConvertMatrix2List {

    /**
     * The method converts a two-dimensional array to a list.
     * @param array - source array.
     * @return - list result.
     */

    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] i : array) {
            for (int j : i) {
                list.add(j);
            }
        }
        return list;
    }
}