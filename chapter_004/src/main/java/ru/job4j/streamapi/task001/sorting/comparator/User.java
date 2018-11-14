package ru.job4j.streamapi.task001.sorting.comparator;

import java.util.Objects;

/**
 * Created on 05.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class User {

    /**Name of user.*/
    private String name;

    /**Age of user.*/
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

    /**
     * Method get.
     *
     * @return - name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return - length of Name.
     */
    public int getNameLength() {
        return this.name.length();
    }
    /**
     * Method get.
     *
     * @return - age.
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{"
                + "name='" + name + '\''
                + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
