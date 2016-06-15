package elements.motionless;

import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class BoneH extends MotionlessElement {
	
	public BoneH(){
		
		super(new Position(getPosition().getX(), getPosition().getY()), new Sprite(), Permeability.BLOCKING);
	}
}
