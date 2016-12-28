package ru.ematveev.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Class PlayerTest tests the metods of the class Player.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class PlayerTest {
    /**
     * Metod check return Name.
     * @throws Exception Exception.
     */
    @Test
    public void testGetName() throws Exception {
        final String inputValue = "Evgeny";
        final String expectedValue = inputValue;
        final Player player = new Player(inputValue, null);
        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }
    /**
     * Metod check return figure.
     * @throws Exception Exception.
     */
    @Test
    public void testGetFigure() throws Exception {
        final Figure inputValue = Figure.O;
        final Figure expectedValue = inputValue;
        final Player player = new Player(null, inputValue);
        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }

}