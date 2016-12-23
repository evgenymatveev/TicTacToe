package ru.ematveev.controllers;

import org.junit.Test;
import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;

import static org.junit.Assert.*;

public class CurrentMoveControllerTest {

    @Test
    public void testCurrentMoveWhenInputFieldIsEmpty() throws Exception {
        CurrentMoveController currentMoveController = new CurrentMoveController();

        final Figure actualValue
                = currentMoveController.currentMove(new FieldSmall());

        assertSame(Figure.X, actualValue);
    }

    @Test
    public void testCurrentMoveWhenOnlyOneFigureXOnTheField() throws Exception {
        testCurrentMoveWhenOnlyOneFigureXOnTheField(0, 0);
        testCurrentMoveWhenOnlyOneFigureXOnTheField(0, 1);
        testCurrentMoveWhenOnlyOneFigureXOnTheField(0, 2);
        testCurrentMoveWhenOnlyOneFigureXOnTheField(1, 0);
        testCurrentMoveWhenOnlyOneFigureXOnTheField(1, 1);
        testCurrentMoveWhenOnlyOneFigureXOnTheField(1, 2);
        testCurrentMoveWhenOnlyOneFigureXOnTheField(2, 0);
        testCurrentMoveWhenOnlyOneFigureXOnTheField(2, 1);
        testCurrentMoveWhenOnlyOneFigureXOnTheField(2, 2);
    }

    private void testCurrentMoveWhenOnlyOneFigureXOnTheField(final int x, final int y)
            throws Exception {
        final FieldSmall inputField = new FieldSmall();
        final Point p = new Point(x, y);
        inputField.setFigure(p, Figure.X);

        CurrentMoveController currentMoveController = new CurrentMoveController();

        final Figure actualValue
                = currentMoveController.currentMove(inputField);

        assertSame(Figure.O, actualValue);
    }
}
