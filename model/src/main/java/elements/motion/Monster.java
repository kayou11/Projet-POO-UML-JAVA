package elements.motion;

import contract.ILorannWorld;
import contract.IMonster;
import elements.Sprite;

public abstract class Monster extends MotionElements implements IMonster {

	public behaviorGetAnimate behaviorGetAnimate;


	public Monster(String nom, Sprite sprite,ILorannWorld lorannWorld,behaviorGetAnimate behaviorGetAnimate) {
		super(nom,sprite,lorannWorld);
		this.behaviorGetAnimate= behaviorGetAnimate;
	}


	public behaviorGetAnimate getBehaviorGetAnimate() {
		return behaviorGetAnimate;
	}


	public void setBehaviorGetAnimate(behaviorGetAnimate behaviorGetAnimate) {
		this.behaviorGetAnimate = behaviorGetAnimate;
	}

	
}