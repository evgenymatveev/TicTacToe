package ru.ematveev.model;
/**
 * Class Game - for create new game.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class Game {
	/**
	 * Immutable the Player 1.
	 */
	private final Player player1;
	/**
	 * Immutable the Player 2.
	 */
	private final Player player2;
	/**
	 * Immutable the FieldSmall.
	 */
	private final FieldSmall field;
	/**
	 * Immutable the name of the game.
	 */
	private final String name;

	/**
	 * Create constructor with pattern Builder.
	 * @param builder builder.
	 */
	public Game(final Builder builder) {

		this.player1 = builder.getPlayer1();
		this.player2 = builder.getPlayer2();
		this.field = builder.getField();
		this.name = builder.getName();
	}

	/**
	 * The metod which return the player1.
	 * @return player1.
	 */
	public Player getPlayer1() {
		return player1;
	}

	/**
	 * The metod which return the player1.
	 * @return player2.
	 */
	public Player getPlayer2() {
		return player2;
	}

	/**
	 * The metod which return the field.
	 * @return field.
	 */
	public FieldSmall getField() {
		return field;
	}

	/**
	 * The metod which return the name of the game.
	 * @return name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Class for building the Builder.
	 */

	public static class Builder {
		/**
		 * Player 1 of the game.
		 */
		private Player player1;
		/**
		 * Player 2 of the game.
		 */
		private Player player2;
		/**
		 * FieldSmall of the game.
		 */
		private FieldSmall field;
		/**
		 * The name of the game.
		 */
		private String name;

		/**
		 * Constructor the name for Builder.
		 * @param name String.
		 * @return Object Builder.
		 */
		public Builder name(final String name) {
			this.name = name;
			return this;
		}

		/**
		 * Constructor the field for Builder.
		 * @param field field.
		 * @return Object Builder.
		 */
		public Builder field(final FieldSmall field) {
			this.field = field;
			return this;
		}

		/**
		 * Constructor the player1 for Builder.
		 * @param player1 player1.
		 * @return Object Builder.
		 */
		public Builder player1(final Player player1) {
			this.player1 = player1;
			return this;
		}

		/**
		 * Constructor the player2 for Builder.
		 * @param player2 player2.
		 * @return Object Builder.
		 */
		public Builder player2(final Player player2) {
			this.player2 = player2;
			return this;
		}

		/**
		 * The metod which return the player1.
		 * @return player1.
		 */
		public Player getPlayer1() {
			return player1;
		}

		/**
		 * The metod which return the player2.
		 * @return player2.
		 */
		public Player getPlayer2() {
			return player2;
		}

		/**
		 * The metod which return the field.
		 * @return field.
		 */
		public FieldSmall getField() {
			return field;
		}

		/**
		 * The metod which return the name.
		 * @return name
		 */
		public String getName() {
			return name;
		}

		/**
		 * The metod which takes an object Builder and return Game..
		 * @return Object Game.
		 */
		public Game build() {
			return new Game(this);
		}
	}
}