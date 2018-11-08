package ru.job4j.streamapi.task001.transfers;

import java.util.Objects;

/**
 * Created on 19.07.2018.
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
     * Passport data of user.
     */
    private String passport;

    /**
     * Constructor.
     */
    public User() {
    }

    /**
     * Constructor.
     *
     * @param name     - name of user.
     * @param passport - passport data of user.
     */
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * Get method.
     *
     * @return - name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get method.
     *
     * @return - data passport.
     */
    public String getPassport() {
        return passport;
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
        return Objects.equals(name, user.name)
                && Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }

    @Override
    public String toString() {
        return "User{" + "name='"
                + name + '\'' + ", passport='"
                + passport + '\'' + '}';
    }

    @Override
    public int compareTo(User user) {
        int nameComparisonResult = this.getName().compareTo(user.getName());
        if (nameComparisonResult == 0) {
            return this.getPassport().compareTo(user.getPassport());
        }
        return nameComparisonResult;
    }
}
