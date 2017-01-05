package ru.ematveev.view;

//import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertSame;
import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Class ConsoleViewTest tests the metods of the class ConsoleView.
 *
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */

public class ConsoleViewTest {
    /**
     * Check the output lines on the screen when the field set all figures X.
     *
     * @throws Exception Exception.
     */
    @Test
    public void testShowWhenFieldSetAllFiguresX() throws Exception {
        final ConsoleView.IPrinter printer = mock(ConsoleView.IPrinter.class);
        final ConsoleView consoleView = new ConsoleView(printer);

        FieldSmall fieldSmall = new FieldSmall();
        fieldSmall.setFigure(new Point(0, 0), Figure.X);
        fieldSmall.setFigure(new Point(1, 0), Figure.X);
        fieldSmall.setFigure(new Point(2, 0), Figure.X);
        fieldSmall.setFigure(new Point(0, 1), Figure.X);
        fieldSmall.setFigure(new Point(1, 1), Figure.X);
        fieldSmall.setFigure(new Point(2, 1), Figure.X);
        fieldSmall.setFigure(new Point(0, 2), Figure.X);
        fieldSmall.setFigure(new Point(1, 2), Figure.X);
        fieldSmall.setFigure(new Point(2, 2), Figure.X);

        consoleView.show(fieldSmall);
        verify(printer).println(" X | X | X \n~~~~~~~~~~~\n X | X | X \n~~~~~~~~~~~\n X | X | X \n");
    }

    /**
     * Check the output lines on the screen when the field null.
     *
     * @throws Exception Exception.
     */
    @Test
    public void testShowWhenFieldNull() throws Exception {
        final ConsoleView.IPrinter printer = mock(ConsoleView.IPrinter.class);
        final ConsoleView consoleView = new ConsoleView(printer);

        FieldSmall fieldSmall = new FieldSmall();

        consoleView.show(fieldSmall);
        verify(printer).println("   |   |   \n~~~~~~~~~~~\n   |   |   \n~~~~~~~~~~~\n   |   |   \n");
    }

    /**
     * Check the output separetor on the screen.
     *
     * @throws Exception Exception.
     */
    @Test
    public void testGenerateSeparator() throws Exception {
        ConsoleView.IPrinter printer = mock(ConsoleView.IPrinter.class);
        final ConsoleView consoleView = new ConsoleView(printer);

        final String expectedValue = "~~~~~~~~~~~\n";

        final StringBuilder inputStringBuilder = new StringBuilder();

        consoleView.generateSeparator(inputStringBuilder);

        assertEquals(expectedValue, inputStringBuilder.toString());
    }

    //@Test
    /**
     * Check the output of the first row field on the screen.
     */
    /*public void testGenerateLineWnenXequal0() throws Exception {
        int x = 0;
        ConsoleView.IPrinter printer = mock(ConsoleView.IPrinter.class);
        final ConsoleView consoleView = new ConsoleView(printer);

        StringBuilder stringBuilder = new StringBuilder();
        FieldSmall fieldSmall = new FieldSmall();

        fieldSmall.setFigure(new Point(0, 0), Figure.X);
        fieldSmall.setFigure(new Point(1, 0), Figure.X);
        fieldSmall.setFigure(new Point(2, 0), Figure.X);

        consoleView.generateLine(fieldSmall, x, stringBuilder);

        String expected = " X | X | X \n ";
        String actualValue = stringBuilder.toString();

        assertSame(expected, actualValue);
    }*/

    //@Test
    /*public void testGetMoveCoordinate() throws Exception {
        final int x = 0;
        final int y = 0;
        final ConsoleView.IPrinter printer = mock(ConsoleView.IPrinter.class);
        final ConsoleView consoleView = new ConsoleView(printer);
        FieldSmall fieldSmall = new FieldSmall();


        assertSame(new Point(x, y), consoleView.getMoveCoordinate(fieldSmall));
    }*/

}