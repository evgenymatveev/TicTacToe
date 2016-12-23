package ru.ematveev.model;

public class FieldSmall {

	private final static int FIELD_SIZE = 3;

	private final static int MIN_COORDINATE = 0;

	private final static int MAX_COORDINATE = FIELD_SIZE;

	private final Figure[][] figures = new Figure[FIELD_SIZE][FIELD_SIZE];

	public int getSize() {
		return FIELD_SIZE;
	}

	public Figure getFigure(final Point point) {
		return figures[point.getX()][point.getY()];
	}

	public void setFigure(final Point point, final Figure figure) {
		figures[point.getX()][point.getY()] = figure;
	}

}