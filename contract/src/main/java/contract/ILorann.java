package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface ILorann.
 */
public interface ILorann extends IMotionElement{

	/**
	 * Animate.
	 *
	 * @param direction the direction
	 * @return true, if successful
	 */
	boolean animate(Direction direction);

	/**
	 * Checks if is alive.
	 *
	 * @return true, if is alive
	 */
	boolean isAlive();

	/**
	 * Sets the direction.
	 *
	 * @param direction the new direction
	 */
	void setDirection(Direction direction);

	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveUp()
	 */
	void moveUp();
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveDown()
	 */
	void moveDown();
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveLeft()
	 */
	void moveLeft();
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveRight()
	 */
	void moveRight();
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveRightUp()
	 */
	void moveRightUp();
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveRightDown()
	 */
	void moveRightDown();
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveLeftDown()
	 */
	void moveLeftDown();
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveLeftUp()
	 */
	void moveLeftUp();
	
	/**
	 * Checks if is spell possible.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if is spell possible
	 */
	boolean isSpellPossible(int x, int y);

	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public Direction getDirection();
	
	/**
	 * Adds the spell.
	 *
	 * @param x the x
	 * @param y the y
	 * @param direction the direction
	 */
	public void addSpell(int x, int y, Direction direction);
	
	/**
	 * Gets the spell.
	 *
	 * @return the spell
	 */
	public ISpell getSpell();
    
    /**
     * Gets the score.
     *
     * @return the score
     */
    public Integer getScore();

    public void setScore(Integer score);


}
