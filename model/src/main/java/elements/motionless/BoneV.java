package elements.motionless;

import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class BoneV extends MotionlessElement {
	
	public BoneV(){
		
		super(new Position(getPosition().getX(), getPosition().getY()), new Sprite(18), Permeability.BLOCKING);
	}

}
