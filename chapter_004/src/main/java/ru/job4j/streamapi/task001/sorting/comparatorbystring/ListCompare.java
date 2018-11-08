package ru.job4j.streamapi.task001.sorting.comparatorbystring;

import java.util.Comparator;

/**
 * Created on 22.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ListCompare implements Comparator<String> {


    @Override
    public int compare(String left, String right) {
        char[] leftChars = left.toCharArray();
        char[] rightChars = right.toCharArray();

        return compareChars(leftChars, rightChars);
    }

    /**
     * Check whether right word has length less then index to avoid IndexOutOfBoundException.
     * @param leftChars - char's array.
     * @param rightChars - char's array.
     * @return - index.
     */
    private int compareChars(char[] leftChars, char[] rightChars) {
        for (int index = 0; index < leftChars.length; index++) {
            if (index < rightChars.length) {
                if (Character.compare(leftChars[index], rightChars[index]) != 0) {
                    return Character.compare(leftChars[index], rightChars[index]);
                }
            }
        }
        return Integer.compare(leftChars.length, rightChars.length);
    }
}
