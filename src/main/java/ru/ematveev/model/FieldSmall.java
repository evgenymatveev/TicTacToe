package ru.ematveev.model;
/**
 * Class FieldSmall create Small field for the game.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class FieldSmall {
	/**
	 * Size the field.
	 */
	private static final int FIELD_SIZE = 3;
	/**
	 * Minimum coordinate for field.
	 */
	private static final int MIN_COORDINATE = 0;
	/**
	 * Maximum coordinate for field.
	 */
	private static final int MAX_COORDINATE = FIELD_SIZE;
	/**
	 * Create an array to store figures.
	 */
	private final Figure[][] figures = new Figure[FIELD_SIZE][FIELD_SIZE];

	/**
	 * Metod which return the size of the field.
	 * @return size.
	 */
	public int getSize() {
		return FIELD_SIZE;
	}

	/**
	 * Metod which return figure on the input coordinates.
	 * @param point figure.
	 * @return figure.
	 */
	public Figure getFigure(final Point point) {
		return figures[point.getX()][point.getY()];
	}

	/**
	 * Method which sets the field incoming figure in the incoming coordinates.
	 * @param point point.
	 * @param figure figure.
	 */
	public void setFigure(final Point point, final Figure figure) {
		figures[point.getX()][point.getY()] = figure;
	}

}