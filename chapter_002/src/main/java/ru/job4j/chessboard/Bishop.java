package ru.job4j.chessboard;

/**
 * Created on 20.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Bishop extends Figure {

    public Bishop(Cell position) {
        super(position);
    }

    @Override
    Cell[] way(Cell source, Cell dest) throws Exception {
        int horizontalDistance = Math.abs(dest.getX() - source.getX());
        int verticalDistance = Math.abs(dest.getY() - source.getY());

        if (horizontalDistance != verticalDistance) {
            throw new Exception("ImpossibleMoveException");
        }
            /*try {
                throw new Exception("ImpossibleMoveException");
            } catch (Exception e) {
                e.printStackTrace();
            }*/

        int horizontalCoefficient = dest.getX() - source.getX() > 0 ? 1 : -1;
        int verticalCoefficient = dest.getY() - source.getY() > 0 ? 1 : -1;

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
