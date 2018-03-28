package ru.job4j.queue;

import java.util.LinkedList;

/**
 * Created on 20.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PriorityQueue {

    /**
     * Linked list.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     *
     * @param task задача.
     */
    public void put(Task task) {
        if (tasks.size() == 0) {
            tasks.add(task);
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getPriority() > task.getPriority()) {
                tasks.add(i, task);
                break;
            }
        }
    }

    /**
     *
     * @return - result.
     */
    public Task take() {
        return this.tasks.poll();
    }
}
