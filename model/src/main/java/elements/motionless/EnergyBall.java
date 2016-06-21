package elements.motionless;

import contract.BehaviorElements;
import contract.IEnergyBall;
import contract.Permeability;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class EnergyBall.
 */
public class EnergyBall extends MotionlessElement implements IEnergyBall {

	/**
	 * Instantiates a new energy ball.
	 */
	public EnergyBall(){
		super("EnergyBall", new Sprite("crystal_ball.png"), Permeability.BLOCKING);
        this.behaviorElements = BehaviorElements.UNLOCK;
	}
}
