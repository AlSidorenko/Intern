package ru.job4j.polymorphism;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * @param tracker - provides access to methods in the Tracker Class.
     */
    private Tracker tracker = new Tracker();

    /**
     * @param item - provides access to methods in the Item Class.
     */
    private Item item = new Item();

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
     * Method showMenu() - Demonstrates the possibility of operations with applications.
     */
    public void showMenu() {
        System.out.println("Information: ");
        System.out.println("0 - Add new Item.");
        System.out.println("1 - Show All Items.");
        System.out.println("2 - Edit Item.");
        System.out.println("3 - Delete Item.");
        System.out.println("4 - Find Item by Id.");
        System.out.println("5 - Find Items by Name.");
        System.out.println("6 - Exit Program.");
        System.out.print("Select: ");
    }

    /**
     * Logical method for matching parameters.
     * @param choise - Number of operation.
     * @return - true or false.
     */
    public boolean isValid(String choise) {
        int numb = Integer.parseInt(choise);
        if (numb < 0 | numb > 5 & numb != 6) {
            return false;
        }
        return true;
    }

    /**
     * Method allows you to choose the action with the application.
     * @param answer - Number of operation.
     */
    public void trackerOn(String answer) {

        if (ADD.equals(answer)) {
            System.out.println("Add new Item.");
            System.out.print("Please, enter Id: ");
            String id = scanner.next();
            System.out.print("Please, enter Name: ");
            String name = scanner.next();
            System.out.print("Please, enter Description: ");
            String desc = scanner.next();
            System.out.print("Please, enter Created (long): ");
            long created = scanner.nextLong();
            System.out.print("Please, enter comments: ");
            String comments = scanner.next();
            tracker.add(new Item(id, name, desc, created));
            System.out.println(" ");
        }

        if (SHOW_ALL.equals(answer)) {
            System.out.println("Show All Item.");
            System.out.println(Arrays.toString(tracker.getAll()));
            System.out.println(" ");
        }

        if (EDIT.equals(answer)) {
            System.out.println("Edit Item.");
            System.out.print("Please, enter Id: ");
            String idUpdate = scanner.next();
            System.out.print("Please, enter Name: ");
            String nameUpdate = scanner.next();
            System.out.print("Please, enter Description: ");
            String descUpdate = scanner.next();
            System.out.print("Please, enter Created (long): ");
            long createdUpdate = scanner.nextLong();
            System.out.print("Please, enter comments: ");
            String commentsUpdate = scanner.next();
            tracker.update(new Item(idUpdate, nameUpdate, descUpdate, createdUpdate));
            System.out.println(" ");
        }

        if (DELETE.equals(answer)) {
            System.out.println("Delete Item.");
            System.out.print("Please, enter Id: ");
            String idDelete = scanner.next();
            tracker.delete(new Item(idDelete));

        }

        if (FIND_BY_ID.equals(answer)) {
            System.out.println("Find Item by Id.");
            System.out.print("Please, enter Id: ");
            String idFind = scanner.next();
            System.out.println(tracker.findById(idFind));
        }

        if (FIND_BY_NAME.equals(answer)) {
            System.out.println("Find Items by Name.");
            System.out.print("Please, enter Name: ");
            String nameFind = scanner.next();
            System.out.println(Arrays.toString(tracker.findByName(nameFind)));
        }
    }

    /**
     * A method that makes it possible to obtain a parameter.
     * @return - The resulting parameter.
     */
    public String getEXIT() {
        return EXIT;
    }
}
