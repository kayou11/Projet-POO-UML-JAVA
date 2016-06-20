package elements.motionless;

import contract.Permeability;
import elements.Sprite;

public class BoneH extends MotionlessElement {
	
	public BoneH(){
		
		super("HorizontalBone", new Sprite("horizontal_bone.png"), Permeability.BLOCKING);
	}
}
