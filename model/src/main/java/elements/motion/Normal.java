package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Smart.
 */
public class Normal implements BehaviorAnimate {

	/* (non-Javadoc)
	 * @see model.Normal#animate()
	 */
	public void animate(IMotionElement motionElement, ILorannWorld lorannWorld) {
		motionElement.saveLastPosition();
		if(lorannWorld.getLorann().getY()<motionElement.getY()){
			motionElement.moveUp();
		}

		if (lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.moveRight();
		}

		if (lorannWorld.getLorann().getY()>motionElement.getY()){
			motionElement.moveDown();
		}

		if (lorannWorld.getLorann().getX()<motionElement.getX()){
			motionElement.moveLeft();
		}
	}

}
