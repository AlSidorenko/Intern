package ru.job4j.encapsulation;

/**
 * Created on 08.08.2017.
 * Class Tracker - Application Management Class.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Tracker {
    /**
     * Array of storage of applications.
     */
    private Item[] items = new Item[100];
    /**
     * @param elemId - Number of the element of the array.
     */
    private int elemId = 0;
    /**
     * Method of adding new applications.
     * @param s - application.
     * @return s - next application in array.
     */
    public Item add(Item s) {
        items[elemId++] = s;
        return s;
    }
    /**
     * Method of update applications.
     * @param s - Application form.
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
     * Method of deleting applications.
     * @param s - Application form.
     */
    public void delete(Item s) {
        int n = Integer.parseInt(s.getId()) - 1;
        Item[] temp = new Item[items.length - 1];
        System.arraycopy(items, 0, temp, 0, n);
        System.arraycopy(items, n + 1, temp, n, temp.length - n);
        items = temp;
    }
    /**
     * The method of searching for all applications.
     * @return temp - Array of applications.
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
     * The method of searching for an application by name.
     * @param name - name of person.
     * @return - An application with the appropriate name.
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
        Item[] localAllElements = new Item[n];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                localAllElements[j++] = temp[i];
            }
        }
        return localAllElements;
    }
    /**
     * The method of searching for an application by id number.
     * @param id - number of application.
     * @return - An application with the appropriate Id.
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
     * Method getItems().
     * @return - application.
     */
    public Item[] getItems() {
        return items;
    }
}