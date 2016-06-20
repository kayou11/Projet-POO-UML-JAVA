package elements.motionless;

import contract.BehaviorElements;
import contract.Permeability;
import elements.Sprite;

public class EnergyBall extends MotionlessElement {

	public EnergyBall(){
		super("EnergyBall", new Sprite("crystal_ball.png"), Permeability.PENETRABLE);
        this.behaviorElements = BehaviorElements.UNLOCK;
	}
}
