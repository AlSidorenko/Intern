package ru.job4j.inheritance;

/**
 * Class Engineer.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Engineer extends Profession {
    /**
     *Constructor Profession.
     *@param name - String.
     *@param age - int.
     *@param gender - String.
     *@param specialty - String.
     */
    public Engineer(String name, int age, String gender, String specialty) {
        super(name, age, gender, specialty);
    }
    /**
     *Method Make Code.
     */
    public void makeCode() {
    }
}