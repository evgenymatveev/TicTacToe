package ru.ematveev.model;

/**
 * Class Player - create player and figure for game.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class Player {
	/**
	 * The name which the player is playing.
	 */
	private final String name;
    /**
     * The figure which the player is playing.
     */
	private final Figure figure;
	/**
	 * Сonstructor of Player.
	 * @param name name.
	 * @param figure figure.
	 */
	public Player(final String name, final Figure figure) {
		this.name = name;
		this.figure = figure;
	}
	/**
	 * The metod returns the name of the player.
	 * @return name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * The metod returns the figure of the player.
	 * @return figure.
	 */
    public Figure getFigure() {
		return figure;
	}
}