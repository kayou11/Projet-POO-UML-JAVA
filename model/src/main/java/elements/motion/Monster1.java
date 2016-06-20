package elements.motion;

import java.awt.Point;

import contract.Direction;
import contract.ILorannWorld;
import elements.Sprite;

public class Monster1 extends Monster {

	
	public Monster1(ILorannWorld lorannWorld) {
		super("Monster1",new Sprite("monster_1.png"), lorannWorld,new behaviorGetAnimate(new Normal()));
	}
}