package ru.job4j.queue;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 20.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PriorityQueueTest {

    /**
     * Test.
     */
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));

        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));

        result = queue.take();
        assertThat(result.getDesc(), is("middle"));

        result = queue.take();
        assertThat(result.getDesc(), is("low"));
    }
}
