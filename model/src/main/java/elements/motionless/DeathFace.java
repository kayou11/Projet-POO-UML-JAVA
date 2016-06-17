package elements.motionless;

import elements.Sprite;
import contract.Permeability;
import elements.Position;

public class DeathFace extends MotionlessElement {

	
	public DeathFace(){
		
		super("ClosedDoor", new Sprite("gate_closed.png"), Permeability.BLOCKING);
	}
}
