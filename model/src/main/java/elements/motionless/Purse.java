package elements.motionless;

import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class Purse extends MotionlessElement {
	
	public Purse(){
		
		super(new Position(getPosition().getX(), getPosition().getY()), loadSprite(24), Permeability.BLOCKING);
	}
}
