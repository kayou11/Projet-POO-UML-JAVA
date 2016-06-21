package elements.motionless;

import contract.IMotionlessElement;
import contract.ISprite;
import contract.Permeability;
import elements.Elements;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionlessElement.
 */
public class MotionlessElement extends Elements implements IMotionlessElement{

	/**
	 * Instantiates a new motionless element.
	 *
	 * @param name the name
	 * @param sprite the sprite
	 * @param permeability the permeability
	 */
	public MotionlessElement(String name,final ISprite sprite, final Permeability permeability) {
		super(name, sprite, permeability);
	}
} 