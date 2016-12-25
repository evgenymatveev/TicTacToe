package ru.ematveev.model;
/**
 * class Player create players.
 */
public class Player {

	/**
	 * the figure which the player is playing.
	 */
	private final String name;

	/**
	 * Class Player.
	 * @author Matveev Evgeny.
	 * @version 1.0.
	 * @since 25.12.2016.
	 */
	private final Figure figure;

	/**
	 * constructor of Player.
	 * @param name name.
	 * @param figure figure.
	 */
	public Player(final String name, final Figure figure) {
		this.name = name;
		this.figure = figure;
	}

	/**
	 * returns the name of the player.
	 * @return name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * returns the figure of the player.
	 * @return figure.
	 */
	public Figure getFigure() {
		return figure;
	}
}