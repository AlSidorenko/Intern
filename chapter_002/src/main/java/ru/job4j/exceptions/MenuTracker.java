package ru.job4j.exceptions;

import java.util.Arrays;

/**
 * Created on 04.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MenuTracker {

    /**
     * This array used.
     */
    private int[] ranges = new int[]{0, 1, 2, 3, 4, 5};

    /**
     * @param input - param of interface.
     */
    private Input input;

    /**
     * @param tracker - param of Class Tracker.
     */
    private Tracker tracker;

    /**
     * @param actions - param of interface UserAction.
     */
    private UserAction[] actions = new UserAction[6];

    /**
     * Constructor this class.
     * @param input - param of Interface Input.
     * @param tracker - param of Class Tracker.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Get method.
     * @return - int array.
     */
    public int[] getRanges() {
        return ranges;
    }

    /**
     * Method fillActions - demonstrates menu.
     */
    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = this.new ShowItems();
        this.actions[2] = this.new EditItem();
        this.actions[3] = this.new DeleteItem();
        this.actions[4] = new MenuTracker.FindById(); // class static.
        this.actions[5] = new MenuTracker.FindByName(); // class static.

    }

    /**
     * Method select.
     * @param key - parameter of choice.
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Method show - demonstrates actions.
     */
    public void show() {
        for (UserAction action : actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * AddItem - internal class.
     * The class provides the addition of a new Item.
     */
    private class AddItem implements UserAction {

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id: ");
            String name = input.ask("Please, enter the task's name: ");
            String desc = input.ask("Please, enter the task's description: ");
            String created = input.ask("Please, enter the task's created(long): ");
            String comments = input.ask("Please, enter the task's comments: ");
            tracker.add(new Item(id, name, desc, Long.parseLong(created), new String[]{comments}));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new Item.");
        }
    }

    /**
     * ShowItem - internal class.
     * The class provides the shows of all Items.
     */
    private class ShowItems implements UserAction {

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("%s. %s, %s, %s, %s.", item.getId(), item.getName(), item.getDesc(),
                                Long.toString(item.getCreated()), Arrays.toString(item.getComments()))
                );
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all Items");
        }
    }

    /**
     * EditItem - internal class.
     * The class provides the edit the Item.
     */
    private class EditItem implements UserAction {

        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id: ");
            String name = input.ask("Please, enter the task's name: ");
            String desc = input.ask("Please, enter the task's description: ");
            String created = input.ask("Please, enter the task's created(long): ");
            String comments = input.ask("Please, enter the task's comments: ");
            Task task;
            task = new Task(
                    id, name, desc, Long.parseLong(created), new String[]{comments}
            );
            task.setId(id);
            tracker.update(task);
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Edit the new Item.");
        }
    }

    /**
     * DeleteItem - internal class.
     * The class provides the delete of Item.
     */
    private class DeleteItem implements UserAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id: ");
            tracker.delete(new Item(id));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete the Item");
        }
    }

    /**
     * FindById - internal class.
     * The class provides choice Item by ID.
     */
    private static class FindById implements UserAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id: ");
            int num = (Integer.parseInt(id) - 1);
            System.out.println(
                    String.format("%s. %s, %s, %s, %s.", id, tracker.findAll()[num].getName(),
                            tracker.findAll()[num].getDesc(), Long.toString(tracker.findAll()[num].getCreated()),
                            Arrays.toString(tracker.findAll()[num].getComments()))
            );
            //System.out.println(tracker.findById(id));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find the Item by Id.");
        }
    }

    /**
     * FindByName - internal class.
     * The class provides choice Item by Name.
     */
    private static class FindByName implements UserAction {

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name: ");
            System.out.println(Arrays.toString(tracker.findByName(name)));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find the Item By Name.");
        }
    }
}
