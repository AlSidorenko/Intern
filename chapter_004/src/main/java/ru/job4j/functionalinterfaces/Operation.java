package ru.job4j.functionalinterfaces;

/**
 * Created on 21.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public interface Operation {
    /**
     * Interface.
     * @param left - first param.
     * @param right - second param.
     * @return - not result.
     */
    double calc(int left, int right);
}
