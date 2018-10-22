package ru.job4j.task004;

/**
 * Created on 20.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public abstract class Figure {

    /**
     * The position of the chess piece on the board.
     */
    private final Cell position;

    /**
     * Constructor with parameter.
     * @param position - position of the chess piece on the board.
     */
    public Figure(Cell position) {
        this.position = position;
    }

    /**
     * Abstract method of remove the chess piece.
     * @param source - Initial position.
     * @param dest - The final position.
     * @return - new Cell position.
     * @throws Exception - exception.
     */
    abstract Cell[] way(Cell source, Cell dest) throws Exception;

    /**
     * Method of copy Figure.
     * @param dest - The final position.
     * @return - Destination Cell position.
     */
    abstract Figure copy(Cell dest);
}
