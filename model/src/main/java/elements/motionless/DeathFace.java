package elements.motionless;

import elements.Sprite;
import elements.Permeability;
import elements.Position;

public class DeathFace extends MotionlessElement {

	
	public DeathFace(){
		
		super(new Position(getPosition().getX(), getPosition().getY()), new Sprite(), Permeability.BLOCKING);
	}
}
