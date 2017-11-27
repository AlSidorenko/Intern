package ru.job4j.polymorphism;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 05.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StartUITest {

    /**
     * Test method for Adding item.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"0", "id", "test name", "desc", "55", "comments", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    /**
     * Test method for Updating Item.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("1", "test name", "desc", 55, new String[] {"comments"}));
        Input input = new StubInput(new String[] {item.getId(), "test name", "desc", "55", "comments", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }

    /**
     * Test method for Showing All Items.
     */
    @Test
    public void whenUserShowAllItemsHasFindAllItems() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("1", "test name", "desc", 55, new String[] {"comments"}));
        Input input = new StubInput(new String[] {"1", "id", "test name", "desc", "55", "comments", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0], is(item));
    }

    /**
     * Test method for Deleting Item.
     */
    @Test
    public void whenUserDeleteItemHasFindAllItemsNull() {
        Tracker tracker = new Tracker();
        Item item =  new Item("1", "test name", "desc", 55, new String[] {"comments"});
        tracker.add(item);
        Input input = new StubInput(new String[] {"3", "1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().length, is(0));
    }

    /**
     * Test method Finding By Name By Item.
     */
    @Test
    public void whenUserFindByNameHasReturnItemThisName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("1", "test name", "desc", 55, new String[] {"comments"}));
        Input input = new StubInput(new String[] {"1", item.getName(), "desc", "55", "comments", "6" });
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName(item.getName())[0], is(item));
    }
}