package ru.ematveev.controllers;

import org.junit.Test;
import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

/**
 * Class WinnerControllerTest tests the metods of the class WinnerController.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class WinnerControllerTest {
    /**
     * Metod testGetWinnerWhenInputFieldEmpty().
     * @throws Exception Exception.
     */
    @Test
    public void testGetWinnerWhenInputFieldEmpty() throws Exception {
        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(new FieldSmall());

        assertNull(actualValue);
    }

    /**
     * testGetWinnerWhenInputDiag_1_All_O().
     * @throws Exception Exception.
     */
    @Test
    public void testGetWinnerWhenInputDiag1AllO() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(0, 0), Figure.O);
        inputfieldSmall.setFigure(new Point(1, 1), Figure.O);
        inputfieldSmall.setFigure(new Point(2, 2), Figure.O);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertSame(Figure.O, actualValue);
    }

    /**
     * Metod testGetWinnerWhenInputDiag_2_All_X().
     * @throws Exception Exception.
     */
    @Test
    public void testGetWinnerWhenInputDiag2AllX() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(0, 2), Figure.X);
        inputfieldSmall.setFigure(new Point(1, 1), Figure.X);
        inputfieldSmall.setFigure(new Point(2, 0), Figure.X);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertSame(Figure.X, actualValue);
    }

    /**
     * Metod testGetWinnerWhenInputLine_All_O().
     * @throws Exception Exception.
     */
    @Test
    public void testGetWinnerWhenInputLineAllO() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(1, 0), Figure.O);
        inputfieldSmall.setFigure(new Point(1, 1), Figure.O);
        inputfieldSmall.setFigure(new Point(1, 2), Figure.O);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertSame(Figure.O, actualValue);
    }

    /**
     * Metod testGetWinnerWhenInputColumn_All_X().
     * @throws Exception Exception.
     */
    @Test
    public void testGetWinnerWhenInputColumnAllX() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(0, 2), Figure.X);
        inputfieldSmall.setFigure(new Point(1, 2), Figure.X);
        inputfieldSmall.setFigure(new Point(2, 2), Figure.X);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertSame(Figure.X, actualValue);
    }

    /**
     * Metod testGetWinnerWhenNonWinner().
     * @throws Exception Exception.
     */
    @Test
    public void testGetWinnerWhenNonWinner() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(0, 0), Figure.O);
        inputfieldSmall.setFigure(new Point(0, 1), Figure.X);
        inputfieldSmall.setFigure(new Point(0, 2), Figure.X);
        inputfieldSmall.setFigure(new Point(1, 0), Figure.X);
        inputfieldSmall.setFigure(new Point(1, 1), Figure.X);
        inputfieldSmall.setFigure(new Point(1, 2), Figure.O);
        inputfieldSmall.setFigure(new Point(2, 0), Figure.O);
        inputfieldSmall.setFigure(new Point(2, 1), Figure.O);
        inputfieldSmall.setFigure(new Point(2, 2), Figure.X);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertNull(actualValue);
    }


}