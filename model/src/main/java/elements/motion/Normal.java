package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

public class Normal implements BehaviorAnimate{

	/* (non-Javadoc)
	 * @see model.Normal#animate()
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld) {
		
		if (lorannWorld.getLorann().getY()<motionElement.getY() && lorannWorld.getLorann().getX()<motionElement.getX() ){
			motionElement.moveLeftUp();
		}
		if (lorannWorld.getLorann().getY()<motionElement.getY() && lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.moveRightUp();
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY() && lorannWorld.getLorann().getX()<motionElement.getX() ){
			motionElement.moveLeftDown();
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY() && lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.moveRightDown();
		}
	}
}
