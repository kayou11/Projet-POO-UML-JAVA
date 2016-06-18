package elements.motion;

import contract.ILorannWorld;
import elements.Position;
import elements.Sprite;

public abstract class Monster extends MotionElements implements IMonster {


	public Monster(String nom, Sprite sprite,ILorannWorld lorannWorld) {
		super(nom,sprite,lorannWorld);
	}

	public void getAnimate() {

	}
}