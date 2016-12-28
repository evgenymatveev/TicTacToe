package ru.ematveev.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Class FieldSmallTest tests the metods of the class FieldSmall.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */

public class FieldSmallTest {
    /**
     * Metod check return size of the field.
     * @throws Exception Exception.
     */
    @Test
    public void testGetSize() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();
        final int expectedValue = 3;
        final int actualValue = fieldSmall.getSize();

        assertEquals(expectedValue, actualValue);

    }
    /**
     * Metod check return figure..
     * @throws Exception Exception.
     */
    @Test
    public void testGetFigure() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();
        Point inputPoint = new Point(0, 0);
        Figure inputFigure = Figure.O;
        fieldSmall.setFigure(inputPoint, inputFigure);
        Figure expectedValue = inputFigure;
        final Figure actualValue = fieldSmall.getFigure(inputPoint);

        assertEquals(expectedValue, actualValue);
    }

}