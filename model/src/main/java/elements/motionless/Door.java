package elements.motionless;

import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class Door extends MotionlessElement {

	
	public Door(){
		
		super(new Position(getPosition().getX(), getPosition().getY()), loadSprite(15), Permeability.BLOCKING);
	}
}