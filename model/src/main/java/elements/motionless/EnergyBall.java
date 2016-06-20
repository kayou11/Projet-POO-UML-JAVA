package elements.motionless;

import contract.BehaviorElements;
import contract.Permeability;
import elements.Position;
import elements.Sprite;

public class EnergyBall extends MotionlessElement {

	
	
	public EnergyBall(){
		super("EnergyBall", new Sprite("crystal_ball.png"), Permeability.BLOCKING);
        this.behaviorElements = BehaviorElements.UNLOCK;
	}
}
