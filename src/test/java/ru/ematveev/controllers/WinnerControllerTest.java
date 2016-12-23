package ru.ematveev.controllers;

import org.junit.Test;
import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;

import static org.junit.Assert.*;

public class WinnerControllerTest {

    @Test
    public void getWinnerWhenInputFieldEmpty() throws Exception {
        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(new FieldSmall());

        assertNull(actualValue);
    }

    @Test
    public void getWinnerWhenInputDiag_1_All_O() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(0, 0), Figure.O);
        inputfieldSmall.setFigure(new Point(1, 1), Figure.O);
        inputfieldSmall.setFigure(new Point(2, 2), Figure.O);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertSame(Figure.O, actualValue);
    }

    @Test
    public void getWinnerWhenInputDiag_2_All_X() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(0, 2), Figure.X);
        inputfieldSmall.setFigure(new Point(1, 1), Figure.X);
        inputfieldSmall.setFigure(new Point(2, 0), Figure.X);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertSame(Figure.X, actualValue);
    }
    @Test
    public void getWinnerWhenInputLine_All_O() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(1, 0), Figure.O);
        inputfieldSmall.setFigure(new Point(1, 1), Figure.O);
        inputfieldSmall.setFigure(new Point(1, 2), Figure.O);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertSame(Figure.O, actualValue);
    }
    @Test
    public void getWinnerWhenInputColumn_All_X() throws Exception {
        FieldSmall inputfieldSmall = new FieldSmall();

        inputfieldSmall.setFigure(new Point(0, 2), Figure.X);
        inputfieldSmall.setFigure(new Point(1, 2), Figure.X);
        inputfieldSmall.setFigure(new Point(2, 2), Figure.X);

        WinnerController winnerController = new WinnerController();

        final Figure actualValue = winnerController.getWinner(inputfieldSmall);

        assertSame(Figure.X, actualValue);
    }
    @Test
    public void getWinnerWhenNonWinner() throws Exception {
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