package ru.job4j.streamapi.task001.transformations;

import java.util.Objects;

/**
 * Created on 30.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class User {

    /**id - number of user.*/
    private int id;

    /**name of user.*/
    private String name;

    /**city.*/
    private String city;

    /**
     * Constructor.
     * @param id - number of user.
     * @param name - name of user.
     * @param city - city.
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     * Method get.
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * Method get.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Method get.
     * @return city.
     */
    public String getCity() {
        return city;
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
        return id == user.id
                && Objects.equals(name, user.name)
                && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, city);
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", city='" + city + '\''
                + '}';
    }
}
