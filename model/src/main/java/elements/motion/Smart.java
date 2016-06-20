package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

public class Smart implements BehaviorAnimate {

	/* (non-Javadoc)
	 * @see model.Normal#animate()
	 */
	public void animate(IMotionElement motionElement, ILorannWorld lorannWorld) {
		motionElement.saveLastPosition();
		if(lorannWorld.getLorann().getY()<motionElement.getY()){
			motionElement.setY(motionElement.getY()-1);
			if(motionElement.isMovePossible(motionElement.getX(), motionElement.getY())) {
			}
		}

		if (lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.setX(motionElement.getX()+1);
			if(motionElement.isMovePossible(motionElement.getX(), motionElement.getY())) {
			}
		}

		if (lorannWorld.getLorann().getY()>motionElement.getY()){
			motionElement.setY(motionElement.getY()+1);
			if(motionElement.isMovePossible(motionElement.getX(), motionElement.getY())) {
			}
		}

		if (lorannWorld.getLorann().getX()<motionElement.getX()){
			motionElement.setX(motionElement.getX()-1);
			if(motionElement.isMovePossible(motionElement.getX(), motionElement.getY())) {
			}
		}

		motionElement.isMovePossible(motionElement.getX(), motionElement.getY());
	}

}
