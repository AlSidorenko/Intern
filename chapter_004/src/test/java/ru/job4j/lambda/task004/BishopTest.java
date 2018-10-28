package ru.job4j.lambda.task004;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

/**
 * Created on 18.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BishopTest {

    /**
     * Test Should Move Bishop Right Down When Figure Exist And Empty Way.
     * @throws Exception - exception.
     */
    @Test
    public void moveShouldMoveBishopRightDownWhenFigureExistAndEmptyWay() throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCell = new Cell(3, 4);
        Cell finalCell = new Cell(6, 7);
        figures[startCell.getX()][startCell.getY()] = new Bishop(startCell);
        Board board = new Board(figures);
        assertTrue(board.move(startCell, finalCell));
    }

    /**
     * Test Should Move Bishop RightUp When Figure Exist And Empty Way.
     * @throws Exception - exception.
     */
    @Test
    public void moveShouldMoveBishopRightUpWhenFigureExistAndEmptyWay() throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCell = new Cell(3, 4);
        Cell finalCell = new Cell(6, 1);
        figures[startCell.getX()][startCell.getY()] = new Bishop(startCell);
        Board board = new Board(figures);
        assertTrue(board.move(startCell, finalCell));
    }

    /**
     * Test Should Move Bishop LeftDown When Figure Exist And Empty Way.
     * @throws Exception - exception.
     */
    @Test
    public void moveShouldMoveBishopLeftDownWhenFigureExistAndEmptyWay()throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCell = new Cell(3, 4);
        Cell finalCell = new Cell(1, 6);
        figures[startCell.getX()][startCell.getY()] = new Bishop(startCell);
        Board board = new Board(figures);
        assertTrue(board.move(startCell, finalCell));
    }

    /**
     * Test Should Move Bishop LeftUp When Figure Exist And Empty Way.
     * @throws Exception - exception.
     */
    @Test
    public void moveShouldMoveBishopLeftUpWhenFigureExistAndEmptyWay() throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCell = new Cell(3, 4);
        Cell finalCell = new Cell(0, 1);
        figures[startCell.getX()][startCell.getY()] = new Bishop(startCell);
        Board board = new Board(figures);
        assertTrue(board.move(startCell, finalCell));
    }

    /**
     * Test Should Throw Figure Not Found Exception When Cell Is Empty.
     * @throws Exception - exception.
     */
    @Test (expected = Exception.class)
    public void moveShouldThrowFigureNotFoundExceptionWhenCellIsEmpty() throws Exception {
        Board board = new Board();
        Cell startCell = new Cell(2, 0);
        Cell finalCell = new Cell(7, 5);
        assertEquals("FigureNotFoundException", is(board.move(startCell, finalCell)));
    }

    /**
     * Test Should Throw Impossible Move Exception When Way Incorrect.
     * @throws Exception - exception.
     */
    @Test (expected = Exception.class)
    public void moveShouldThrowImpossibleMoveExceptionWhenWayIncorrect() throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCellBishop = new Cell(2, 0);
        Cell finalCellBishop = new Cell(7, 7);
        Cell startCellPawn = new Cell(6, 4);
        figures[startCellBishop.getX()][startCellBishop.getY()] = new Bishop(startCellBishop);
        figures[startCellPawn.getX()][startCellPawn.getY()] = new Pawn(startCellPawn);
        Board board = new Board(figures);
        assertEquals("ImpossibleMoveException", is(board.move(startCellBishop, finalCellBishop)));
    }

    /**
     * Test Should Throw Occupied Way Exception When There Is Figure On The Way.
     * @throws Exception - exception.
     */
    @Test (expected = Exception.class)
    public void moveShouldThrowOccupiedWayExceptionWhenThereIsFigureOnTheWay() throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCellBishop = new Cell(2, 0);
        Cell finalCellBishop = new Cell(7, 5);
        Cell startCellPawn = new Cell(6, 4);
        figures[startCellBishop.getX()][startCellBishop.getY()] = new Bishop(startCellBishop);
        figures[startCellPawn.getX()][startCellPawn.getY()] = new Pawn(startCellPawn);
        Board board = new Board(figures);
        assertEquals("OccupiedWayException", is(board.move(startCellBishop, finalCellBishop)));
    }
}
