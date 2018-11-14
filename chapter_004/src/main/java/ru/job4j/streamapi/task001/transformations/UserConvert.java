package ru.job4j.streamapi.task001.transformations;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
        return (HashMap<Integer, User>) list.stream().
                collect(Collectors.toMap(User::getId, user -> user));
    }
}
