package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMonster;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster.
 */
public abstract class Monster extends MotionElements implements IMonster {

	/**
	 * Instantiates a new monster.
	 *
	 * @param nom the nom
	 * @param sprite the sprite
	 * @param lorannWorld the lorann world
	 * @param behaviorGetAnimate the behavior get animate
	 */
	public Monster(String nom, Sprite sprite,ILorannWorld lorannWorld,BehaviorAnimate behaviorGetAnimate) {
		super(nom,sprite,lorannWorld,behaviorGetAnimate);
	}
	
}