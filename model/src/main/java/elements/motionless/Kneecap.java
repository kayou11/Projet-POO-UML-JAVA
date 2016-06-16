package elements.motionless;

import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class Kneecap extends MotionlessElement {

	public Kneecap(){
		
		super(new Position(getPosition().getX(), getPosition().getY()), loadSprite(17), Permeability.BLOCKING);
	}
}
