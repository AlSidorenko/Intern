package ru.job4j.methodreferences;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Created on 08.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Calculator {

    /**
     * Method multiple.
     *
     * @param start - first param.
     * @param finish - last param.
     * @param value - value.
     * @param op - function.
     * @param media - consumer.
     */
    public void multiple(int start, int finish, int value,
                         BiFunction<Integer, Integer, Double> op,
                         Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }

    /**
     * Main method.
     *
     * @param args - array.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2,
                MathUtil::add,
                result -> System.out.println(result)
        );
    }
}
