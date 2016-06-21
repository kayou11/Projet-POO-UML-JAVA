package elements.motionless;

import contract.Permeability;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class BoneV.
 */
public class BoneV extends MotionlessElement {
	
	/**
	 * Instantiates a new bone V.
	 */
	public BoneV(){
		
		super("VerticalBone", new Sprite("vertical_bone.png"), Permeability.BLOCKING);
	}

}
