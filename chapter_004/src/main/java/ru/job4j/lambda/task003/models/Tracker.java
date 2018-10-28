package ru.job4j.lambda.task003.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Created on 08.08.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Tracker {

    /**
     * An object of Item.
     */
    private Item item = new Item();

    /**
     * An arrayList of elements.
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Random number generation.
     */
    private static final Random RN = new Random();

    /**
     * Functional interface.
     */
    private Predicate<String> predicate;

    /**
     * Generate id.
     * @return - id.
     */
    public String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }

    /**
     * Method add.
     * @param item - item.
     * @return - add Item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Method of updating the data.
     * @param s - new application form.
     */
    public void update(Item s) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && items.get(i).getId().equals(s.getId())) {
                items.set(i, s);
                return;
            }
        }
    }

    /**
     * Method of deleting an application.
     * @param s - original number of application.
     */
    public void delete(Item s) {
        Iterator iterator = items.iterator();
        while (iterator.hasNext()) {
            Item i = (Item) iterator.next();
            predicate = (value) -> i.getId().equals(value);
            if (predicate.test(s.getId())) {
                iterator.remove();
            }
        }
    }

    /**
     * The method of displaying the array data.
     * @return - all array.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * The method of searching for data on id.
     * @param name - name of person.
     * @return - Data of the person.
     */
    public List<Item> findByName(String name) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            predicate = (value) -> item.getName().equals(value);
            if (predicate.test(name)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * The method of searching for data on id.
     * @param id - original number.
     * @return - Data of the person.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            predicate = (value) -> item.getId().equals(value);
            if (predicate.test(id)) {
                result = item;
            }
        }
        return result;
    }

    /**
     * A method that makes it possible to obtain a parameter.
     * @return - The resulting parameter.
     */
    public  List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Tracker{" + "items=" + "id='" + item.getId() + '\''
                + ", name='" + item.getName() + '\''
                + ", desc='" + item.getDesc() + '\''
                + ", created=" + item.getCreated()
                + ", comments=" + Arrays.toString(item.getComments()) + '}';
    }
}
