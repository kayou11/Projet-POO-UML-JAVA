package elements.motionless;

import contract.Permeability;
import elements.Position;
import elements.Sprite;

public class BoneV extends MotionlessElement {
	
	public BoneV(){
		
		super("VerticalBone", new Sprite("vertical_bone.png"), Permeability.BLOCKING);
	}

}
