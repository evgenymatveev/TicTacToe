package ru.ematveev.model;

/**
 * Сlass Point - create cordinate for field.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class Point {
	/**
	 * Coordinate x.
	 */
	private final int x;
	/**
	 * Coordinate y.
	 */
	private final int y;

	/**
	 * Constructor of class Point.
	 * @param x x.
	 * @param y y.
	 */
	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * The metod getX - return the value x.
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * The metod getY - return the value y.
	 * @return y
	 */
	public int getY() {
		return y;
	}
}