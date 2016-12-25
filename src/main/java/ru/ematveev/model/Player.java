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
	 * player name.
	 */
	private final Figure figure;

	/**
	 * constructor.
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