package ru.ematveev.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Class PointTest tests the metods of the class Point.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */

public class PointTest {
    /**
     * Metod check return x.
     * @throws Exception Exception.
     */
    @Test
    public void testGetX() throws Exception {
        int inputValue = 1;
        int inputY = 2;
        int expectedValue = inputValue;
        Point point = new Point(inputValue, inputY);
        int actualValue = point.getX();

        assertEquals(expectedValue, actualValue);

    }
    /**
     * Metod check return y.
     * @throws Exception Exception.
     */
    @Test
    public void testGetY() throws Exception {
        int inputValue = 1;
        int inputX = 2;
        int expectedValue = inputValue;
        Point point = new Point(inputX, inputValue);
        int actualValue = point.getY();

        assertEquals(expectedValue, actualValue);
    }

}