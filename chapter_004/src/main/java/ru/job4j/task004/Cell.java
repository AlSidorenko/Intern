package ru.job4j.task004;

/**
 * Created on 20.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Cell {

    /**
     * Coordinates of the chess piece.
     */
    private int x;

    /**
     * Coordinates of the chess piece.
     */
    private int y;

    /**
     * Constructor of class Cell.
     * @param x - coordinate.
     * @param y - coordinate.
     */
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method of returning the coordinates of the chess piece.
     * @return - parameter x.
     */
    public int getX() {
        return x;
    }

    /**
     * Method of returning the coordinates of the chess piece.
     * @return - parameter y.
     */
    public int getY() {
        return y;
    }
}
