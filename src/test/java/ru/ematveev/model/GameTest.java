package ru.ematveev.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Class GameTest tests the metods of the class Game.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class GameTest {
    /**
     * Metod check return player1.
     * @throws Exception Exception.
     */
    @Test
    public void testGetPlayer1() throws Exception {
        Player inputValue = new Player("Evgeny", Figure.O);
        Game.Builder builder = new Game.Builder();
        builder.player1(inputValue);
        Game game = new Game(builder);
        final Player actualValue = game.getPlayer1();
        final Player expectedValue = inputValue;

        assertEquals(expectedValue, actualValue);

    }
    /**
     * Metod check return player2.
     * @throws Exception Exception.
     */
    @Test
    public void testGetPlayer2() throws Exception {
        Player inputValue = new Player("Max", Figure.X);
        Game.Builder builder = new Game.Builder();
        builder.player2(inputValue);
        Game game = new Game(builder);
        final Player actualValue = game.getPlayer2();
        final Player expectedValue = inputValue;

        assertEquals(expectedValue, actualValue);
    }
    /**
     * Metod check return field.
     * @throws Exception Exception.
     */
    @Test
    public void testGetField() throws Exception {

    }
    /**
     * Metod check return Name.
     * @throws Exception Exception.
     */
    @Test
    public void testGetName() throws Exception {
        final String inputValue = "Evgeny";
        final Game.Builder builder = new Game.Builder();
        builder.name(inputValue);
        Game game = new Game(builder);
        final String actualValue = game.getName();
        final String expectedValue = inputValue;

        assertEquals(expectedValue, actualValue);

    }

}