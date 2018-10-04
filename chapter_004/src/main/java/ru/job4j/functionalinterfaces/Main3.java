package ru.job4j.functionalinterfaces;

/**
 * Created on 21.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Main3 {

    /**
     * Main method.
     * @param args - array str.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2,
                (value, index) -> {
                    double result = value * index;
                    System.out.printf("Multiple %s * %s = %s %n", value, index, result);
                    return result;
                },
                result -> System.out.println(result)
        );
    }
}
