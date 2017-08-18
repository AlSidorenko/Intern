package ru.job4j.encapsulation;

/**
 * Created on 08.08.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Item {
    /**
     *@param id - The serial number of the person.
     */
    private String id;
    /**
     *@param name - name of person.
     */
    private String name;
    /**
     *@param desc - description of person.
     */
    private String desc;
    /**
     * @param created - date of creation.
     */
    private long created;
    /**
     * @param comments - array of comments.
     */
    private String[] comments;
    /**
     * Default constructor.
     */
    public Item() { }
    /**
     * Constructor Item.
     * @param id - the serial number of the person.
     * @param name - name of person.
     * @param desc - description of person.
     * @param created - date of creation.
     * @param comments - comment of person.
     */
    public Item(String id, String name, String desc, long created, String[] comments) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
        this.comments = comments;
    }
    /**
     * Method getId.
     * @return id.
     */
    public String getId() {
        return id;
    }
    /**
     * Method setId().
     * @param id - the serial number of the person.
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Method getName().
     * @return name - name of person.
     */
    public String getName() {
        return name;
    }
    /**
     * Method setName().
     * @param name - name of person.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method getDesc().
     * @return desc - description of person.
     */
    public String getDesc() {
        return desc;
    }
    /**
     * Method setDesc().
     * @param desc - description of person.
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /**
     * Method getCreated().
     * @return created - date of creation.
     */
    public long getCreated() {
        return created;
    }
    /**
     * Method setCreated().
     * @param created - date of creation.
     */
    public void setCreated(long created) {
        this.created = created;
    }
    /**
     * Method getComments().
     * @return comments - comment of person.
     */
    public String[] getComments() {
        return comments;
    }
    /**
     * Method setComments().
     * @param comments - comment of person.
     */
    public void setComments(String[] comments) {
        this.comments = comments;
    }
}