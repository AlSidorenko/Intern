package ru.job4j.benchmark;

/**
 * Created on 04.08.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class JoinArrays {
    /**
     *JoinArrays.
     *@param a - Firs sort array.
     *@param b - Second sort array.
     *@return - New array - join array.
     */
    int[] newArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < c.length / 2; i++) {
            if (a[i] > b[i]) {
                c[i + i] = b[i];
                c[i + i + 1] = a[i];
            } else {
                c[i + i] = a[i];
                c[i + i + 1] = b[i];
            }
        }
        return c;
    }
}