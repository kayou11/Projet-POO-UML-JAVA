package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMotionElement.
 */
public interface IMotionElement extends IElement {
	
	/* (non-Javadoc)
	 * @see contract.IElement#getPermeability()
	 */
	Permeability getPermeability();
	
	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX();
	
	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY();
	
	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x);
	
	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y);
	
	/**
	 * Sets the lorann world.
	 *
	 * @param lorannWorld the lorann world
	 * @param x the x
	 * @param y the y
	 */
	public void setLorannWorld(final ILorannWorld lorannWorld, final int x, final int y);
	
	/**
	 * Move up.
	 */
	void moveUp();
	
	/**
	 * Move down.
	 */
	void moveDown();
	
	/**
	 * Move left.
	 */
	void moveLeft();
	
	/**
	 * Move right.
	 */
	void moveRight();
	
	/**
	 * Move right up.
	 */
	void moveRightUp();
	
	/**
	 * Move right down.
	 */
	void moveRightDown();
	
	/**
	 * Move left down.
	 */
	void moveLeftDown();
	
	/**
	 * Move left up.
	 */
	void moveLeftUp();
	
	/**
	 * Move to.
	 *
	 * @param x the x
	 * @param y the y
	 */
	void moveTo(int x, int y);
	
	/**
	 * Gets the behavior get animate.
	 *
	 * @return the behavior get animate
	 */
	public BehaviorAnimate getBehaviorGetAnimate();
	
	/**
	 * Checks if is move possible.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if is move possible
	 */
	boolean isMovePossible(int x, int y);
	
	/**
	 * Save last position.
	 */
	public void saveLastPosition();
}
