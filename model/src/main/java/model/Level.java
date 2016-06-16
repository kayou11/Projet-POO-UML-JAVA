package model;

/**
 * The Class Level.
 *
 * @author Pierre Kerebel Omer
 */
public class Level extends Entity implements ILevel {

	/** The id. */
	private int			id;


	/** The level. */
	private int	level;
	private Dimension dimension;

	/**
	 * Instantiates a new Level
	 *
	 * @param id
	 *          the id

	 * @param message
	 *          the message
	 */
	public Level(final int id, final int level) {
		this.setId(id);
		this.setLevel(level);
	}

	/**
	 * Instantiates a new level.
	 */
	public Level() {
		this(0, 1);
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}


	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public int getLevel() {
		return this.level;
	}

	/**
	 * Sets the level.
	 *
	 * @param level
	 *          the new level
	 */
	public void setLevel(final int level) {
		this.level = level;
	}

	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return this.dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
}
