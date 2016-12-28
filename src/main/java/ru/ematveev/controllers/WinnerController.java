package ru.ematveev.controllers;

import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;
/**
 * Class WinnerController determines the winner.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */

public class WinnerController {
    /**
     * Metod сheck the field and determine the winner.
     * @param fieldSmall field.
     * @return figure.
     */
    public Figure getWinner(final FieldSmall fieldSmall) {
        final Point p1 = new Point(0, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(2, 2);

        if (fieldSmall.getFigure(p1) != null
                && fieldSmall.getFigure(p2) != null
                && fieldSmall.getFigure(p3) != null
                && fieldSmall.getFigure(p1).equals(fieldSmall.getFigure(p2))
                && fieldSmall.getFigure(p2).equals(fieldSmall.getFigure(p3))) {
            return fieldSmall.getFigure(p1);
        }
        final Point p4 = new Point(0, 2);
        final Point p5 = new Point(1, 1);
        final Point p6 = new Point(2, 0);

        if (fieldSmall.getFigure(p4) != null
                && fieldSmall.getFigure(p5) != null
                && fieldSmall.getFigure(p6) != null
                && fieldSmall.getFigure(p4).equals(fieldSmall.getFigure(p5))
                && fieldSmall.getFigure(p5).equals(fieldSmall.getFigure(p6))) {
            return fieldSmall.getFigure(p4);
        }
        for (int i = 0; i < fieldSmall.getSize(); i++) {
            final Point p7 = new Point(i, 0);
            final Point p8 = new Point(i, 1);
            final Point p9 = new Point(i, 2);

            if (fieldSmall.getFigure(p7) != null
                    && fieldSmall.getFigure(p8) != null
                    && fieldSmall.getFigure(p9) != null
                    && fieldSmall.getFigure(p7).equals(fieldSmall.getFigure(p8))
                    && fieldSmall.getFigure(p8).equals(fieldSmall.getFigure(p9))) {
                return fieldSmall.getFigure(p7);
            }
        }
        for (int i = 0; i < fieldSmall.getSize(); i++) {
            final Point p10 = new Point(0, i);
            final Point p11 = new Point(1, i);
            final Point p12 = new Point(2, i);

            if (fieldSmall.getFigure(p10) != null
                    && fieldSmall.getFigure(p11) != null
                    && fieldSmall.getFigure(p12) != null
                    && fieldSmall.getFigure(p10).equals(fieldSmall.getFigure(p11))
                    && fieldSmall.getFigure(p11).equals(fieldSmall.getFigure(p12))) {
                return fieldSmall.getFigure(p10);
            }
        }
        return null;
    }
}