package ru.job4j.streamapi.task001.queue;

import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * Created on 20.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PriorityQueue {

    /**Linked list.*/
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     *
     * @param task задача.
     */
    public void put(Task task) {
        if (tasks.size() == 0) {
            tasks.add(task);
        }
        IntStream.range(0, tasks.size()).filter(i -> task.getPriority()
                <= this.tasks.get(i).getPriority()).findFirst().ifPresent(i -> tasks.add(i, task));
    }

    /**
     *
     * @return - result.
     */
    public Task take() {
        return this.tasks.poll();
    }
}
