package ru.job4j.sorting.comparable;

/**
 * Created on 05.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class User implements Comparable<User> {

    /**
     * Name of user.
     */
    private String name;

    /**
     * Age of user.
     */
    private int age;

    /**
     * Constructor of Class User.
     *
     * @param name - user's name.
     * @param age  - user's age.
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return age > o.age ? 1 : -1;
    }

    @Override
    public String toString() {
        return "User{"
                + "name='" + name + '\''
                + ", age=" + age + '}';
    }
}