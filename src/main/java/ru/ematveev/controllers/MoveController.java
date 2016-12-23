package ru.ematveev.controllers;

import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;
import ru.ematveev.model.exception.AlreadyOccupiedException;
import ru.ematveev.model.exception.InvalidPointException;

public class MoveController {
    public void applyFigure(final FieldSmall fieldSmall,
                               final Point point,
                               final Figure figure) throws AlreadyOccupiedException, InvalidPointException{
        if (point.getX() < 0
                || point.getY() < 0
                || point.getX() > fieldSmall.getSize()
                || point.getY() > fieldSmall.getSize()){
            throw new InvalidPointException();
        }

        if (fieldSmall.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }

        fieldSmall.setFigure(point, figure);

    }
}


