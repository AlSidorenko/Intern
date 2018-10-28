package ru.job4j.lambda.task003.behavior;


/**
 * Created on 14.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public abstract class BaseAction implements UserAction {

    /**
     * @param key - This param of number operation in Tracker.
     */
    private final int key;

    /**
     * @param name - Param of name operation.
     */
    private final String name;

    /**
     * Constructor - of Class BaseAction.
     * @param key - This param of number operation in Tracker.
     * @param name - Param of name operation.
     */
    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public String info() {
        return String.format("%s : %s", this.key, this.name);
    }
}
