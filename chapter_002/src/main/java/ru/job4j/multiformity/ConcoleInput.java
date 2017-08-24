package ru.job4j.multiformity;

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
public class ConcoleInput {
    /**
     * Class Scanner is used to read the input data.
     * @param sc - This parameter is for reading data.
     */
    private Scanner sc = new Scanner(System.in);
    /**
     * @param tracker - provides access to methods in the Tracker Class.
     */
    private Tracker tracker = new Tracker();
    /**
     * @param item - provides access to methods in the Item Class.
     */
    private Item item = new Item();
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
     * @param numb - Number of operation.
     * @return - true or false.
     */
    public boolean isValid(int numb) {
        if (numb < '0' | numb > '5' & numb != '6') {
            return false;
        }
        return true;
    }
    /**
     * Method allows you to choose the action with the application.
     * @param numb - Number of operation.
     */
    public void trackerOn(int numb) {
        switch (numb) {
            case '0':
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
                break;
            case '1':
                System.out.println("Show All Item.");
                System.out.println(Arrays.toString(tracker.findAll()));
                System.out.println(" ");
                break;
            case '2':
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
                break;
            case '3':
                System.out.println("Delete Item.");
                System.out.print("Please, enter Id: ");
                String idDelete = sc.next();
                tracker.delete(new Item(idDelete));
                break;
            case '4':
                System.out.println("Find Item by Id.");
                System.out.print("Please, enter Id: ");
                String idFind = sc.next();
                System.out.println(tracker.findById(idFind));
                break;
            case '5':
                System.out.println("Find Items by Name.");
                System.out.print("Please, enter Name: ");
                String nameFind = sc.next();
                System.out.println(Arrays.toString(tracker.findByName(nameFind)));
                break;
            default:
                System.out.println();
                break;
        }
    }
}
