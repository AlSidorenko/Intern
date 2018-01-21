package ru.job4j.chessboard;

/**
 * Created on 21.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Pawn extends Figure {

    /**
     * Constructor with parameter.
     * @param position - coordinate of chess piece.
     */
    public Pawn(Cell position) {
        super(position);
    }

    @Override
    Cell[] way(Cell source, Cell dest) throws Exception {
        throw new Exception();
    }

    @Override
    Figure copy(Cell dest) {
        return new Pawn(dest);
    }
}
