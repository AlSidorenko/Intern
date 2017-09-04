package ru.job4j.multiformity;

import java.io.IOException;

/**
 * Created on 23.08.2017.
 *
 * Starting Class.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StartUi {

    /**
     * Starting method of the program.
     * @throws IOException - Exception.
     */
    public void init() throws IOException {
        char answer;
        char ignore;
        ConcoleInput ci = new ConcoleInput();

        for (;;) {
            do {
                ci.showMenu();
                answer = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!ci.isValid(Character.toString(answer)));
            if (ci.getEXIT().equals(Character.toString(answer))) {
                break;
            }
            System.out.println(" ");
            ci.trackerOn(Character.toString(answer));
        }
    }

    /**
     * Start program.
     * @param args - array.
     * @throws IOException - Exception.
     */
    public static void main(String[] args) throws IOException {
        new StartUi().init();
    }
}
