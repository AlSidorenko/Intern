package ru.job4j.lambda.task004;

/**
 * Created on 20.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Board {

    /**
     * Two-dimensional array for placing chess pieces.
     */
    private Figure[][] figures;

    /**
     * Default constructor of class Board.
     */
    public Board() {
        figures = new Figure[8][8];
    }

    /**
     * Constructor with parameter.
     * @param figures - parameter of array.
     */
    public Board(Figure[][] figures) {
        this.figures = figures;
    }

    /**
     * Method to check the correct movement of chess pieces.
     * @param source - Initial position.
     * @param dest - The final position.
     * @return - Boolean result.
     * @throws Exception - exception.
     */
    boolean move(Cell source, Cell dest) throws Exception {

        if (figures[source.getX()][source.getY()] == null) {
            throw new Exception("FigureNotFoundException");
        }

        Cell[] cells = figures[source.getX()][source.getY()].way(source, dest);

        for (Cell cell : cells) {
            if (figures[cell.getX()][cell.getY()] != null) {
                throw new IllegalArgumentException("OccupiedWayException");
            }
        }

        figures[dest.getX()][dest.getY()] = figures[source.getX()][source.getY()].copy(dest);
        figures[source.getX()][source.getY()] = null;

        return true;
    }
}
