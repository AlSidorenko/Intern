package ru.job4j.polymorphism;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Item {
    private String id;
    public String name;
    public String description;
    public long create;

    public Item() {
    }

    public Item(String id, String name, String description, long create) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getCreate() {
        return create;
    }

    public void setId(String id) {
        this.id = id;
    }
}
