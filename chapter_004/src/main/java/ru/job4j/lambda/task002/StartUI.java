package ru.job4j.lambda.task002;

import ru.job4j.lambda.task002.behavior.MenuTracker;
import ru.job4j.lambda.task002.input.Input;
import ru.job4j.lambda.task002.input.ValidateInput;
import ru.job4j.lambda.task002.models.Tracker;

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
     * Constructor StartUI.
     * @param input - param of interface.
     */
    public StartUI(Input input) {
        this.input = input;
    }

    /**
     * Method showed menu.
     */
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();

        do {
            menu.show(System.out::println);
            menu.select(input.ask("select: ", menu.getRanges()));
        } while (!"y".equals(this.input.ask("Exit? (y/n): ")));
    }

    /**
     * Start program.
     * @param args - array.
     */
    public static void main(String[] args) {
        Input input = new ValidateInput();
        new StartUI(input).init();
    }
}
