package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMonster;
import elements.Sprite;

public abstract class Monster extends MotionElements implements IMonster {


	public Monster(String nom, Sprite sprite,ILorannWorld lorannWorld,BehaviorAnimate behaviorGetAnimate) {
		super(nom,sprite,lorannWorld,behaviorGetAnimate);
	}


	
}