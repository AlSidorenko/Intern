package ru.job4j.polymorphism;

import java.util.Scanner;

/**
 * Created on 23.08.2017.
 *
 * Class ConsoleInput for entering user data.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConcoleInput implements Input {

    /**
     * Class Scanner is used to read the input data.
     * @param sc - This parameter is for reading data.
     */
    private Scanner sc = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.print(question);
        return sc.nextLine();
    }
}