package ru.job4j.chessboard;

/**
 * Created on 20.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Board {

    private Figure[][] figures;

    public Board() {
        figures = new Figure[8][8];
    }

    public Board(Figure[][] figures) {
        this.figures = figures;
    }

    boolean move(Cell source, Cell dest) throws Exception {
        // throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException

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
