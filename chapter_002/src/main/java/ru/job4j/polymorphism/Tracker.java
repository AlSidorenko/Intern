package ru.job4j.polymorphism;

import java.util.Random;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Tracker {

    private Item[] items = new Item[10];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add (Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    public void update(Item s) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(s.getId())) {
                items[i] = s;
                return;
            }
        }
    }

    public void delete(Item s) {
        int n = Integer.parseInt(s.getId()) - 1;
        Item[] temp = new Item[items.length - 1];
        System.arraycopy(items, 0, temp, 0, n);
        System.arraycopy(items, n + 1, temp, n, temp.length - n);
        items = temp;
    }

    public Item[] getAll () {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

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
        for (int i = 0; i < temp.length; i++)
            if (temp[i] != null) n++;

        // 2 : allocate new array
        Item[] localAllElements = new Item[n];

        // 3 : copy not null elements
        int j = 0;
        for (int i = 0; i < temp.length; i++)
            if (temp[i] != null)
                localAllElements[j++] = temp[i];

        return localAllElements;
    }

    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                break;
            }
        }
        return result;
    }

    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
