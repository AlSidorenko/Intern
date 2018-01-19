package ru.job4j.chessboard;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created on 18.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BishopTest {

    @Test
    public void move_ShouldMoveBishopRightDown_WhenFigureExistAndEmptyWay() throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCell = new Cell(3, 4);
        Cell finalCell = new Cell(6, 7);
        figures[startCell.getX()][startCell.getY()] = new Bishop(startCell);
        Board board = new Board(figures);
        assertTrue(board.move(startCell, finalCell));
    }

    @Test
    public void move_ShouldMoveBishopRightUp_WhenFigureExistAndEmptyWay() throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCell = new Cell(3, 4);
        Cell finalCell = new Cell(6, 1);
        figures[startCell.getX()][startCell.getY()] = new Bishop(startCell);
        Board board = new Board(figures);
        assertTrue(board.move(startCell, finalCell));
    }

    @Test
    public void move_ShouldMoveBishopLeftDown_WhenFigureExistAndEmptyWay()throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCell = new Cell(3, 4);
        Cell finalCell = new Cell(1, 6);
        figures[startCell.getX()][startCell.getY()] = new Bishop(startCell);
        Board board = new Board(figures);
        assertTrue(board.move(startCell, finalCell));
    }
    @Test
    public void move_ShouldMoveBishopLeftUp_WhenFigureExistAndEmptyWay() throws Exception {
        Figure[][] figures = new Figure[8][8];
        Cell startCell = new Cell(3, 4);
        Cell finalCell = new Cell(0, 1);
        figures[startCell.getX()][startCell.getY()] = new Bishop(startCell);
        Board board = new Board(figures);
        assertTrue(board.move(startCell, finalCell));
    }
    @Test
    public void move_ShouldThrowFigureNotFoundException_WhenCellIsEmpty() {
        Board board = new Board();
        Cell startCell = new Cell(2, 0);
        Cell finalCell = new Cell(7, 5);
        Exception exception; //= Assert.a(board.move(startCell, finalCell));
        //Assert.assertEquals("FigureNotFoundException", is(exception.getMessage()));
    }
}
