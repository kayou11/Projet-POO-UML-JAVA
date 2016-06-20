package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

public class Normal implements BehaviorAnimate{

	/* (non-Javadoc)
	 * @see model.Normal#animate()
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld) {
		motionElement.saveLastPosition();

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
		if (lorannWorld.getLorann().getY()==motionElement.getY() && lorannWorld.getLorann().getX()<motionElement.getX()){
			motionElement.moveLeft();
		}
		if (lorannWorld.getLorann().getY()==motionElement.getY() && lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.moveRight();
		}
		if (lorannWorld.getLorann().getY()<motionElement.getY() && lorannWorld.getLorann().getX()==motionElement.getX()){
			motionElement.moveUp();
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY() && lorannWorld.getLorann().getX()==motionElement.getX()){
			motionElement.moveDown();
		}
	}
}
