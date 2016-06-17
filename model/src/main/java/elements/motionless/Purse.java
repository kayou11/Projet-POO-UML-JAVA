package elements.motionless;

import contract.Permeability;
import elements.Position;
import elements.Sprite;

public class Purse extends MotionlessElement {
	
	public Purse(){
		
		super("Purse", new Sprite("purse.png"), Permeability.BLOCKING);
	}
}
