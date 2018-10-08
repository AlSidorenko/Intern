package ru.job4j.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created on 08.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class UserConvert {

    /**
     * Static class.
     */
    public static class User {

        /**
         * Name of User.
         */
        private final String name;


        /**
         * Constructor.
         *
         * @param name - user name.
         */
        public User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" + "name='" + name + '\'' + '}';
        }
    }

    /**
     * Method convert.
     *
     * @param names - user name.
     * @param op - function.
     * @return - list of names.
     */
    public List<User> convert(List<String> names, Function<String, User> op) {
        List<User> users = new ArrayList<>();
        names.forEach(
                n -> users.add(op.apply(n))
        );
        return users;
    }

    /**
     * Main method.
     *
     * @param args - array.
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Petr", "Nick", "Ban");
        UserConvert users = new UserConvert();
        List<User> data = users.convert(names, User::new);
        data.forEach(System.out::println);
    }
}