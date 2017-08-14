package ru.job4j.accountingOfApplications;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 09.08.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "Alec", "desc", 25L, new String[]{"aaaaa", "bbbbb"});
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    /*
    @Test
    public void whenUpdateItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("1", "Alec", "desc", 25L, new String[]{"aaaaa", "bbbbb"});
        tracker.update(new Item("1", "Anna", "desc", 21L, new String[]{"ccccc", "dddddd"}));
        assertThat(tracker.findAll(), is());
    }*/
    /*
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(new Item("1", "Alec", "desc",25L, new String[]{"aaaaa", "bbbbb"}));
        tracker.add(new Item("2", "Anna", "desc",18L, new String[]{"ccccc", "eeeee"}));
        tracker.delete(new Item("2", "Anna", "desc",18L, new String[]{"ccccc", "eeeee"}));
        assertThat(tracker.findAll(), is(item));
    }*/

}
