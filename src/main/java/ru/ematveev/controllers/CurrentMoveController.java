package ru.ematveev.controllers;

import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;
/**
 * Class CurrentMoveController for to determine which player to go.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class CurrentMoveController {
    /**
     * Metod currentMove the input accepts a field and returns the figure of the player whose turn it is.
     * @param fieldSmall field.
     * @return figure.
     */
    public Figure currentMove(final FieldSmall fieldSmall) {
        /**
         * The counter the figure X on the field.
         */
        int countX = 0;
        /**
         * The counter the figure O on the field.
         */
        int countO = 0;

        for (int i = 0; i < fieldSmall.getSize(); i++) {
            for (int j = 0; j < fieldSmall.getSize(); j++) {

                if (fieldSmall.getFigure(new Point(i, j)) == null) {
                    continue;
                }
                if (fieldSmall.getFigure(new Point(i, j)) == Figure.X) {
                    countX++;
                }

                if (fieldSmall.getFigure(new Point(i, j)) == Figure.O) {
                    countO++;
                }
            }
        }
        return countX == countO ? Figure.X : Figure.O;
    }
}
