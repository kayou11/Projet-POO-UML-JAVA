package elements.motionless;

import contract.Permeability;
import elements.Position;
import elements.Sprite;

public class Kneecap extends MotionlessElement {

	public Kneecap(){
		
		super("Kneecap",new Sprite("bone.png"), Permeability.BLOCKING);
	}
}
