package ru.job4j.streamapi.task001.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 13.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConversionListArr {

    /**
     * Conversion method.
     *
     * @param list - list of arrays.
     * @return - list.
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        list.stream().map(Arrays::stream).forEach(x -> x.forEach(result::add));
        return result;
    }
}
