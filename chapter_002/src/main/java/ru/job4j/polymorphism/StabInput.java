package ru.job4j.polymorphism;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StabInput implements Input {

    private String id;
    public String name;
    public String description;
    public String create;

    private String[] answers;
    private int position = 0;

    public StabInput(String id, String name, String description, String create) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String ask(String question) {
        return answers[position++];
    }
}
