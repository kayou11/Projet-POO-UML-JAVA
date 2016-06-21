package elements.motionless;

import contract.Permeability;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Kneecap.
 */
public class Kneecap extends MotionlessElement {

	/**
	 * Instantiates a new kneecap.
	 */
	public Kneecap(){
		
		super("Kneecap",new Sprite("bone.png"), Permeability.BLOCKING);
	}
}
