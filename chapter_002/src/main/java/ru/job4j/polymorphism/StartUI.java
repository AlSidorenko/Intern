package ru.job4j.polymorphism;

import java.util.Arrays;

/**
 * Created on 14.11.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StartUI {

    /**
     * @param input - param of interface.
     */
    private Input input;

    /**
     * @param tracker - provides access to methods in the Tracker Class.
     */
    private Tracker tracker;

    /**
     * @param ADD - add method marker.
     */
    private static final String ADD = "0";

    /**
     * @param SHOW_ALL - Show All Item method marker.
     */
    private static final String SHOW_ALL = "1";

    /**
     * @param EDIT - Edit Item method marker.
     */
    private static final String EDIT = "2";

    /**
     * @param DELETE - Delete Item method marker.
     */
    private static final String DELETE = "3";

    /**
     * @param FIND_BY_ID - Find Item By Id method marker.
     */
    private static final String FIND_BY_ID = "4";

    /**
     * @param FIND_BY_NAME - Find Items by Name method marker.
     */
    private static final String FIND_BY_NAME = "5";

    /**
     * @param EXIT - Exit Program method marker.
     */
    private static final String EXIT = "6";

    /**
     * Constructor StartUI.
     * @param input - param of interface.
     * @param tracker - provides access to methods in the Tracker Class.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Method showed menu.
     */
    public void init() {
        for (;;) {
            String taskNumber = input.ask("Information:\r\n"
                    + "0 - Add new Item.\r\n"
                    + "1 - Show All Items.\r\n"
                    + "2 - Edit Item.\r\n"
                    + "3 - Delete Item.\r\n"
                    + "4 - Find Item by Id.\r\n"
                    + "5 - Find Items by Name.\r\n"
                    + "6 - Exit Program.\r\n"
                    + "Select: ");

            if (ADD.equals(taskNumber)) {
                addItem();
            } else if (SHOW_ALL.equals(taskNumber)) {
                showAllItems();
            } else if (EDIT.equals(taskNumber)) {
                editItem();
            } else if (DELETE.equals(taskNumber)) {
                deleteItem();
            } else if (FIND_BY_ID.equals(taskNumber)) {
                findItemById();
            } else if (FIND_BY_NAME.equals(taskNumber)) {
                getItemsByName();
            } else if (EXIT.equals(taskNumber)) {
                break;
            }
        }
    }

    /**
     * Method find items by Name person.
     */
    private void getItemsByName() {
        System.out.println("Find Items by Name.");
        String nameFind = input.ask("Please, enter Name: ");
        System.out.println(Arrays.toString(tracker.findByName(nameFind)));
        //((tracker.findByName(nameFind)));
    }

    /**
     * Method find items by Id person.
     */
    private void findItemById() {
        System.out.println("Find Item by Id.");
        String idFind = input.ask("Please, enter Id: ");
        System.out.println(tracker.findById(idFind));
    }

    /**
     * Method delete item.
     */
    private void deleteItem() {
        System.out.println("Delete Item.");
        String idDelete = input.ask("Please, enter Id: ");
        tracker.delete(new Item(idDelete));
    }

    /**
     * Method edit item.
     */
    private void editItem() {
        System.out.println("Edit Item.");
        String idUpdate = input.ask("Please, enter Id: ");
        String nameUpdate = input.ask("Please, enter Name: ");
        String descUpdate = input.ask("Please, enter Description: ");
        String createdUpdate = input.ask("Please, enter Created (long): ");
        String commentsUpdate = input.ask("Please, enter comments: ");
        tracker.update(new Item(idUpdate, nameUpdate, descUpdate, Long.parseLong(createdUpdate), new String[] {commentsUpdate}));
    }

    /**
     * Method show all items.
     */
    private void showAllItems() {
        System.out.println("Show All Item.");
        System.out.println(Arrays.toString(tracker.findAll()));
        //((tracker.findAll()));
    }

    /**
     * Method add new item.
     */
    private void addItem() {
        System.out.println("Add new Item.");
        String id = input.ask("Please, enter Id: ");
        String name = input.ask("Please, enter Name: ");
        String desc = input.ask("Please, enter Description: ");
        String created = input.ask("Please, enter Created (long): ");
        String comments = input.ask("Please, enter comments: ");
        tracker.add(new Item(id, name, desc, Long.parseLong(created), new String[] {comments}));
    }

    /**
     * Start program.
     * @param args - array.
     */
    public static void main(String[] args) {
        Input input = new ConcoleInput();
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
    }
}
