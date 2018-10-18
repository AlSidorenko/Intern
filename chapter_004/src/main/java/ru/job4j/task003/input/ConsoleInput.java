package ru.job4j.task003.input;

import ru.job4j.task003.exceptions.MenuOutException;

import java.util.List;
import java.util.Scanner;

/**
 * Created on 23.08.2017.
 *
 * Class ConsoleInput for entering user data.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConsoleInput implements Input {

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

    @Override
    public int ask(String question, List<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range.");
        }
    }
}