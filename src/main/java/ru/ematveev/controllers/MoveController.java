package ru.ematveev.controllers;

import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;
import ru.ematveev.model.exception.AlreadyOccupiedException;
import ru.ematveev.model.exception.InvalidPointException;
/**
 * Class MoveController check correctness of the coordinates and sets the figure on the field.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class MoveController {
    /**
     * Metod check correctness of the coordinates and sets the figure on the field.
     * @param fieldSmall field
     * @param point point
     * @param figure figure.
     * @throws AlreadyOccupiedException AlreadyOccupiedException.
     * @throws InvalidPointException AlreadyOccupiedException.
     */
    public void applyFigure(final FieldSmall fieldSmall,
                            final Point point,
                            final Figure figure) throws AlreadyOccupiedException, InvalidPointException {
        if (point.getX() < 0
                || point.getY() < 0
                || point.getX() > fieldSmall.getSize()
                || point.getY() > fieldSmall.getSize()) {
            throw new InvalidPointException();
        }

        if (fieldSmall.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }

        fieldSmall.setFigure(point, figure);

    }
}


