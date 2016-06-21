package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Aggressive.
 */
public class Aggressive implements BehaviorAnimate{

	/* (non-Javadoc)
	 * @see contract.BehaviorAnimate#animate(contract.IMotionElement, contract.ILorannWorld)
	 */
	public void animate(IMotionElement motionElement, ILorannWorld lorannWorld) {
		motionElement.saveLastPosition();

		if (lorannWorld.getLorann().getX()<motionElement.getX()){
			motionElement.moveLeft();
		}
		if (lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.moveRight();
		}
		if (lorannWorld.getLorann().getX()==motionElement.getX()){
			if (lorannWorld.getLorann().getY()<motionElement.getY()){
				motionElement.moveUp();
			}
			if (lorannWorld.getLorann().getY()>motionElement.getY()){
				motionElement.moveDown();
			}
		}

		
	}
	
}
