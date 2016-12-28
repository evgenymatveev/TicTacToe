package ru.ematveev.controllers;

import org.junit.Test;
import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;
import ru.ematveev.model.exception.AlreadyOccupiedException;
import ru.ematveev.model.exception.InvalidPointException;
/**
 * Class MoveControllerTestTest tests the metods of the class MoveControllerTest.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class MoveControllerTest {
    /**
     * Metod testApplyFigureWhenXNegativ().
     * @throws Exception Exception.
     */
    @Test(expected = InvalidPointException.class)
    public void testApplyFigureWhenXNegativ() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(-1, 0);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

    /**
     * Metod testApplyFigureWhenYNegativ().
     * @throws Exception Exception.
     */
    @Test(expected = InvalidPointException.class)
    public void testApplyFigureWhenYNegativ() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(0, -1);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

    /**
     * Metod testApplyFigureWhenXandYNegativ().
     * @throws Exception Exception.
     */
    @Test(expected = InvalidPointException.class)
    public void testApplyFigureWhenXandYNegativ() throws Exception {
        final int x = -2;
        final int y = -2;

        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(x, y);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

    /**
     * Metod testApplyFigureWhenXMoreFieldSize().
     * @throws Exception Exception.
     */
    @Test(expected = InvalidPointException.class)
    public void testApplyFigureWhenXMoreFieldSize() throws Exception {
        final int x = 500;
        final int y = 1000;

        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(x, y);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

    /**
     * Metod testApplyFigureWhenCellBusy().
     * @throws Exception Exception.
     */
    @Test(expected = AlreadyOccupiedException.class)
    public void testApplyFigureWhenCellBusy() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();

        Point point = new Point(1, 2);

        fieldSmall.setFigure(point, Figure.X);

        MoveController moveController = new MoveController();

        moveController.applyFigure(fieldSmall, point, Figure.X);

    }

}