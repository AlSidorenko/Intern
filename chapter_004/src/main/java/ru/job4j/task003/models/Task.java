package ru.job4j.task003.models;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Task extends Item {

    /**
     * Constructor of class Task.
     * @param id - id Item.
     * @param name - name Item.
     * @param desc - description Item.
     * @param created - created Item.
     * @param comments - comment.
     */
    public Task(String id, String name, String desc, long created, String[] comments) {
        super(id, name, desc, created, comments);

    }
}
