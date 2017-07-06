package ru.job4j.inheritance;

/**
 * Class Teacher.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Teacher extends Profession {
    /**
     *@param hobby - String.
     */
    private String hobby;
    /**
     *Constructor Teacher - default.
     */
    public Teacher() {
    }
    /**
     *Constructor Teacher.
     *@param name - String.
     *@param age - int.
     *@param gender - String.
     *@param specialty - String.
     *@param hobby - String.
     */
    public Teacher(String name, int age, String gender, String specialty, String hobby) {
        super(name, age, gender, specialty);
        this.hobby = hobby;
    }
    /**
     *Method Teach.
     */
    public void teach() {
    }
}