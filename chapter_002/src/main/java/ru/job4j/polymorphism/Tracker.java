package ru.job4j.polymorphism;

import java.util.Arrays;

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
     * An array of 100 elements.
     */
    private Item[] items = new Item[100];

    /**
     * @param elemId - The index of the array.
     */
    private int elemId = 0;

    /**
     * Method of adding new applications.
     * @param s - new application form.
     * @return - new array.
     */
    public Item add(Item s) {
        items[elemId++] = s;
        return s;
    }

    /**
     * Method of updating the data.
     * @param s - new application form.
     */
    public void update(Item s) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(s.getId())) {
                items[i] = s;
                return;
            }
        }
    }

    /**
     * Method of deleting an application.
     * @param s - original number of application.
     */
    public void delete(Item s) {
        int n = Integer.parseInt(s.getId()) - 1;
        Item[] temp = new Item[items.length - 1];
        System.arraycopy(items, 0, temp, 0, n);
        System.arraycopy(items, n + 1, temp, n, temp.length - n);
        items = temp;
    }

    /**
     * The method of displaying the array data.
     * @return - all array.
     */
    public Item[] findAll() {
        int countElenNull = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                countElenNull++;
            }
        }
        Item[] temp = new Item[items.length - countElenNull];
        System.arraycopy(items, 0, temp, 0, temp.length);
        return temp;
    }

    /**
     * The method of searching for data on id.
     * @param name - name of person.
     * @return - Data of the person.
     */
    public Item[] findByName(String name) {
        Item[] temp = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(name)) {
                temp[i] = items[i];
            } else {
                temp[i] = null;
            }
        }
        int n = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                n++;
            }
        }
        // 2 : allocate new array
        Item[] localAllElements = new Item[n];

        // 3 : copy not null elements
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                localAllElements[j++] = temp[i];
            }
        }
        return localAllElements;
    }

    /**
     * The method of searching for data on id.
     * @param id - original number.
     * @return - Data of the person.
     */
    public Item findById(String id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                return items[i];
            }
        }
        return null;
    }

    /**
     * A method that makes it possible to obtain a parameter.
     * @return - The resulting parameter.
     */
    public Item[] getItems() {
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
