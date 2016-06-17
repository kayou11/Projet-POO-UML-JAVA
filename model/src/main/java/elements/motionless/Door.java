package elements.motionless;

import contract.Permeability;
import elements.Position;
import elements.Sprite;

public class Door extends MotionlessElement {

	
	public Door(){
		
		super("OpenedDoor", new Sprite("gate_open.png"), Permeability.BLOCKING);
	}
}