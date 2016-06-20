package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

public class Smart implements BehaviorAnimate {

	public void animate(IMotionElement motionElement, ILorannWorld lorannWorld) {
		if (lorannWorld.getLorann().getY() < motionElement.getY()) {
			motionElement.moveUp();
		}
		if (lorannWorld.getLorann().getY() > motionElement.getY()) {
			motionElement.moveDown();
		}
		if (lorannWorld.getLorann().getY() == motionElement.getY()) {
			if (lorannWorld.getLorann().getX() < motionElement.getX()) {
				motionElement.moveLeft();
			}
			if (lorannWorld.getLorann().getY() > motionElement.getY()) {
				motionElement.moveRight();
			}
		}

	}

}
