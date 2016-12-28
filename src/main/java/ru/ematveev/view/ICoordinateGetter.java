package ru.ematveev.view;

import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Point;

/**
 * Interface ICoordinateGetter.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public interface ICoordinateGetter {
    /**
     * Metod getMoveCoordinate return Point.
     * @param field field.
     * @return Point.
     */
    Point getMoveCoordinate(final FieldSmall field);
}
