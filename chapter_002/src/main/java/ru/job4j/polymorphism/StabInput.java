package ru.job4j.polymorphism;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StabInput implements Input {

    private String[] answers;
    private int position = 0;

    public StabInput(String[] answers) {
        this.answers = answers;
    }

    public String ask(String question) {
        return answers[position++];
    }
}
