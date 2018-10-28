package ru.job4j.task004;

import java.util.function.BiFunction;

/**
 * Created on 20.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Bishop extends Figure {

    /**
     * Constructor of class Bishop.
     *
     * @param position - Parameter for placing a chess piece.
     */
    public Bishop(Cell position) {
        super(position);
    }

    @Override
    Cell[] way(Cell source, Cell dest) throws Exception {

        BiFunction<Integer, Integer, Integer> biFunc = (x, y) -> Math.abs(x - y);

        int horizontalDistance = biFunc.apply(dest.getX(), source.getX());
        int verticalDistance = biFunc.apply(dest.getY(), source.getY());

        if (horizontalDistance != verticalDistance) {
            throw new Exception("ImpossibleMoveException");
        }

        int horizontalCoefficient = biFunc.apply(dest.getX(), source.getX()) > 0 ? 1 : -1;
        int verticalCoefficient = biFunc.apply(dest.getY(), source.getY()) > 0 ? 1 : -1;

        Cell[] cells = new Cell[horizontalDistance - 1];
        for (int i = 1; i < horizontalDistance; i++) {
            cells[i - 1] = new Cell(source.getX() + i * horizontalCoefficient,
                    source.getY() + i * verticalCoefficient);
        }
        return cells;
    }

    @Override
    Figure copy(Cell dest) {
        return new Bishop(dest);
    }
}
