package elements.motionless;

import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class EnergyBall extends MotionlessElement {

	
	
	public EnergyBall(){
		
		super(new Position(getPosition().getX(), getPosition().getY()), new Sprite(), Permeability.BLOCKING);
	}
}