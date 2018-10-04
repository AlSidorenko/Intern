package ru.job4j.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Created on 21.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Calculator {

    /**
     * Interface.
     */
    public interface Operation {

        /**
         * Interface.
         * @param left - fist numb.
         * @param right - ending numb.
         * @return - not res.
         */
        double calc(int left, int right);
    }

    /**
     * The method of multiplying the numbers.
     * @param start - first numb.
     * @param finish - ending numb.
     * @param value - multiplier.
     * @param op - result.
     */
    public void multiple(int start, int finish, int value, Operation op) {
        for (int index = start; index != finish; index++) {
            System.out.println(
                    op.calc(value, index)
            );
        }
    }

    /**
     * The method of multiplying the numbers.
     * @param start - first numb.
     * @param finish - ending numb.
     * @param value - multiplier.
     * @param op - res.
     * @param media - res.
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
     * @param args - array str.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2,
                new Operation() {
                    @Override
                    public double calc(int left, int right) {
                        return left * right;
                    }
                }
        );
    }
}
