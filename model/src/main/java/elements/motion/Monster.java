package elements.motion;

import elements.Position;
import elements.Sprite;

public abstract class Monster extends MotionElements implements IMonster{

	public Monster(Position position, Sprite sprite) {
		super(position,sprite);
	}

	public void getAnimate(){
	 
	}
}