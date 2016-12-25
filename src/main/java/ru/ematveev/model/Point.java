package ru.ematveev.model;

/**
 * Сlass Point.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class Point {
	/**
	 * coordinate x.
	 */
	private final int x;
	/**
	 * coordinate y.
	 */
	private final int y;

	/**
	 * constructor of Point.
	 * @param x x.
	 * @param y y.
	 */
	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * return the value x.
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * return the value y.
	 * @return y
	 */
	public int getY() {
		return y;
	}
}