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
	boolean animate();

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
	void setDirection(ControllerOrder direction);

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
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public ControllerOrder getOrder();
	
    
    /**
     * Gets the score.
     *
     * @return the score
     */
    public Integer getScore();

    public void setScore(Integer score);

}
