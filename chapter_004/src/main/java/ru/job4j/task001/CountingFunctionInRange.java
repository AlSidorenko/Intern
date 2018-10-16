package ru.job4j.task001;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created on 15.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CountingFunctionInRange {

    /**
     * The method returns a list of function values.
     *
     * @param start - first elem.
     * @param end   - finish elem.
     * @param func  - function.
     * @return - list.
     */
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(func.apply((double) i));
        }
        return result;
    }
}
