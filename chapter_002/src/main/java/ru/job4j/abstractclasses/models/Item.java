package ru.job4j.abstractclasses.models;

import java.util.Arrays;

/**
 * Created on 08.08.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Item {

    /**
     * @param id - Ordinal number of the person.
     */
    private String id;

    /**
     * @param name - name of Person.
     */
    private String name;

    /**
     * @param desc - description.
     */
    private String desc;

    /**
     * @param created - data of created.
     */
    private long created;

    /**
     * @param comments - array of comments.
     */
    private String[] comments;

    /**
     * Constructor.
     * @param id - number.
     * @param name - Name of Person.
     * @param desc - description.
     * @param created - time of created.
     * @param comments - comment of Person.
     */
    public Item(String id, String name, String desc, long created, String[] comments) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
        this.comments = comments;
    }

    /**
     * Constructor.
     * @param id - number.
     */
    public Item(String id) {
        this.id = id;
    }

    /**
     * Constructor is empty.
     */
    public Item() { }

    /**
     * A method that makes it possible to obtain a parameter.
     * @return - The resulting parameter.
     */
    public String getId() {
        return id;
    }

    /**
     * A method that enables the installation of data.
     * @param id - Setting parameter.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * A method that makes it possible to obtain a parameter.
     * @return - The resulting parameter.
     */
    public String getName() {
        return name;
    }

    /**
     * A method that enables the installation of data.
     * @param name - Setting parameter.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A method that makes it possible to obtain a parameter.
     * @return - The resulting parameter.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * A method that enables the installation of data.
     * @param desc - Setting parameter.
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * A method that makes it possible to obtain a parameter.
     * @return - The resulting parameter.
     */
    public long getCreated() {
        return created;
    }

    /**
     * A method that enables the installation of data.
     * @param created - Setting parameter.
     */
    public void setCreated(long created) {
        this.created = created;
    }

    /**
     * A method that makes it possible to obtain a parameter.
     * @return - The resulting parameter.
     */
    public String[] getComments() {
        return comments;
    }

    /**
     * A method that enables the installation of data.
     * @param comments - Setting parameter.
     */
    public void setComments(String[] comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Item{" + "id='" + id + '\''
                + ", name='" + name + '\''
                + ", desc='" + desc + '\''
                + ", created=" + created
                + ", comments=" + Arrays.toString(comments) + '}';
    }
}
