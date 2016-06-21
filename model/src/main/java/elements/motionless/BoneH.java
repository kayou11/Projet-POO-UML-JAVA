package elements.motionless;

import contract.Permeability;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class BoneH.
 */
public class BoneH extends MotionlessElement {
	
	/**
	 * Instantiates a new bone H.
	 */
	public BoneH(){
		
		super("HorizontalBone", new Sprite("horizontal_bone.png"), Permeability.BLOCKING);
	}
}
