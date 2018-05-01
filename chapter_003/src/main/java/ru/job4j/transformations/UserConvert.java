package ru.job4j.transformations;

import java.util.HashMap;
import java.util.List;

/**
 * Created on 30.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class UserConvert {

    /**
     * Method transformation.
     * @param list - ArrayList.
     * @return - HashMap.
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> users = new HashMap<>();

        for (User user : list) {
            users.put(user.getId(), user);
        }
        return users;
    }
}
