package ru.job4j.polymorphism;

/**
 * Created on 14.11.2017.
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
        tracker.add(new Task("0", "test name", "desc", "6"));
        for (Item item : tracker.findAll()) {
            System.out.println(item.getName());
        }
    }
    public static void main(String[] args) {

        Input input = new ConcoleInput();
        new StartUI(input).init();
    }
}
