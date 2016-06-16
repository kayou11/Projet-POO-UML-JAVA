package elements.motionless;

import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class Kneecap extends MotionlessElement {

	public Kneecap(){
		
		super(new Position(getPosition().getX(), getPosition().getY()),new Sprite(getModel().get), Permeability.BLOCKING);
	}
}
