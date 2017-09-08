package ru.job4j.polymorphism;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StartUI {

    private Input input;
    private Tracker tracker;

    public StartUI(Input input) {
        this.input = input;
    }

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        //ConsoleInput input = new ConsoleInput();
        String name = input.ask("Please, enter the tasks's name: ");
        Tracker tracker = new Tracker();
        tracker.add(new Task(name, "first desc"));
        for (Item item : tracker.getAll()) {
            System.out.println(item.getName());
        }
    }
    public static void main(String[] args) {
        //Input input = new StabInput(new String[]{"create stub task"});
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }
}
