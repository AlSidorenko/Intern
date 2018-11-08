package ru.job4j.streamapi.task001.transformations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 30.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class UserConvertTest {

    /**
     * Test convert List to Map.
     */
    @Test
    public void whenConvListToMap() {
        User user = new User(1, "Alec", "London");
        UserConvert userConvert = new UserConvert();
        HashMap<Integer, User> expected = userConvert.process(new ArrayList<>(asList(user)));
        HashMap<Integer, User> result = new HashMap<>();
        result.put(1, new User(1, "Alec", "London"));
        assertThat(expected, is(result));
    }
}
