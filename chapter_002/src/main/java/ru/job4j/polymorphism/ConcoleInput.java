package ru.job4j.polymorphism;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 23.08.2017.
 *
 * Class ConsoleInput for entering user data.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConcoleInput implements Input {

    private Scanner sc = new Scanner(System.in);
    private Tracker tracker = new Tracker();
    private Item item = new Item();
    private static final String ADD = "0";
    private static final String SHOW_ALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FIND_BY_ID = "4";
    private static final String FIND_BY_NAME = "5";
    private static final String EXIT = "6";

    @Override
    public String ask(String question) {
        System.out.print(question);
        return sc.nextLine();
    }

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

    public boolean isValid(String choise) {
        int numb = Integer.parseInt(choise);
        if (numb < 0 | numb > 5 & numb != 6) {
            return false;
        }
        return true;
    }

    public void trackerOn(String answer) {

        if (ADD.equals(answer)) {
            System.out.println("Add new Item.");
            System.out.print("Please, enter Id: ");
            String id = sc.next();
            System.out.print("Please, enter Name: ");
            String name = sc.next();
            System.out.print("Please, enter Description: ");
            String desc = sc.next();
            System.out.print("Please, enter Created (long): ");
            long created = sc.nextLong();
            System.out.print("Please, enter comments: ");
            String comments = sc.next();
            tracker.add(new Item(id, name, desc, created, new String[]{comments}));
            System.out.println(" ");
        }

        if (SHOW_ALL.equals(answer)) {
            System.out.println("Show All Item.");
            System.out.println(Arrays.toString(tracker.findAll()));
            System.out.println(" ");
        }

        if (EDIT.equals(answer)) {
            System.out.println("Edit Item.");
            System.out.print("Please, enter Id: ");
            String idUpdate = sc.next();
            System.out.print("Please, enter Name: ");
            String nameUpdate = sc.next();
            System.out.print("Please, enter Description: ");
            String descUpdate = sc.next();
            System.out.print("Please, enter Created (long): ");
            long createdUpdate = sc.nextLong();
            System.out.print("Please, enter comments: ");
            String commentsUpdate = sc.next();
            tracker.update(new Item(idUpdate, nameUpdate, descUpdate, createdUpdate, new String[]{commentsUpdate}));
            System.out.println(" ");
        }

        if (DELETE.equals(answer)) {
            System.out.println("Delete Item.");
            System.out.print("Please, enter Id: ");
            String idDelete = sc.next();
            tracker.delete(new Item(idDelete));

        }

        if (FIND_BY_ID.equals(answer)) {
            System.out.println("Find Item by Id.");
            System.out.print("Please, enter Id: ");
            String idFind = sc.next();
            System.out.println(tracker.findById(idFind));
        }

        if (FIND_BY_NAME.equals(answer)) {
            System.out.println("Find Items by Name.");
            System.out.print("Please, enter Name: ");
            String nameFind = sc.next();
            System.out.println(Arrays.toString(tracker.findByName(nameFind)));
        }
    }

    public String getEXIT() {
        return EXIT;
    }
}