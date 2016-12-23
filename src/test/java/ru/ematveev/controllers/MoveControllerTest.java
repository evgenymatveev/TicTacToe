package ru.ematveev.controllers;

import org.junit.Test;
import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;
import ru.ematveev.model.exception.AlreadyOccupiedException;
import ru.ematveev.model.exception.InvalidPointException;

import static org.junit.Assert.*;

public class MoveControllerTest {
    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenXNegativ() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(-1, 0);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenYNegativ() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();
        Point point = new Point(0, -1);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenXandYNegativ() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(-2, -2);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenXMoreFieldSize() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(500, 1000);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }
    @Test(expected = AlreadyOccupiedException.class)
    public void applyFigureWhenCellBusy() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(1, 2);

        fieldSmall.setFigure(point, Figure.X);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

}