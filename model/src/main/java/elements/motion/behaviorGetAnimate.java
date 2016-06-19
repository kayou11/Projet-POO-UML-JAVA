package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

public class behaviorGetAnimate {

	BehaviorAnimate behaviorAnimate;
	public behaviorGetAnimate(BehaviorAnimate behaviorAnimate){
		this.behaviorAnimate = behaviorAnimate;
	}
	
	public void ExecuteAnimate(IMotionElement motionElement,ILorannWorld lorannWorld){
		behaviorAnimate.animate(motionElement, lorannWorld);
	}
}
