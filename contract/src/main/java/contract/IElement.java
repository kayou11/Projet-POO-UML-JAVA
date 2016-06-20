package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IElement.
 */
public interface IElement {
	
	/**
	 * Gets the sprite.
	 *
	 * @return the sprite
	 */
	public ISprite getSprite();

	/**
	 * Gets the permeability.
	 *
	 * @return the permeability
	 */
	public Permeability getPermeability();
	
	/**
	 * Sets the permeability.
	 *
	 * @param permeability the new permeability
	 */
	public void setPermeability(Permeability permeability);
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName();

	/**
	 * Gets the behavior elements.
	 *
	 * @return the behavior elements
	 */
	public BehaviorElements getBehaviorElements();
	
	public ILocation getLocation();

}
