package elements.motionless;

import contract.Permeability;
import elements.Position;
import elements.Sprite;

public class EnergyBall extends MotionlessElement {

	
	
	public EnergyBall(){
		
		super("EnergyBall", new Sprite("crystall_ball.png"), Permeability.BLOCKING);
	}
}
