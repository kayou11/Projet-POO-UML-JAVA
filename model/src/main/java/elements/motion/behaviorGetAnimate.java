package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

// TODO: Auto-generated Javadoc
/**
 * The Class behaviorGetAnimate.
 */
public class behaviorGetAnimate {

	/** The behavior animate. */
	BehaviorAnimate behaviorAnimate;
	
	/**
	 * Instantiates a new behavior get animate.
	 *
	 * @param behaviorAnimate the behavior animate
	 */
	public behaviorGetAnimate(BehaviorAnimate behaviorAnimate){
		this.behaviorAnimate = behaviorAnimate;
	}
	
	/**
	 * Execute animate.
	 *
	 * @param motionElement the motion element
	 * @param lorannWorld the lorann world
	 */
	public void ExecuteAnimate(IMotionElement motionElement,ILorannWorld lorannWorld){
		behaviorAnimate.animate(motionElement, lorannWorld);
	}
}
