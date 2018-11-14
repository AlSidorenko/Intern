package ru.job4j.streamapi.task001.queue;

/**
 * Created on 20.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Task {

    /**Description.*/
    private String desc;

    /**Priority - numb.*/
    private int priority;

    /**
     *
     * @param desc - desc.
     * @param priority - numb.
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    /**
     *
     * @return - method get.
     */
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @return - method get.
     */
    public int getPriority() {
        return priority;
    }
}
