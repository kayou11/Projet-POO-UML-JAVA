package elements.motion;

import elements.Position;
import elements.Sprite;

public abstract class Monster extends MotionElements implements IMonster{

	public Monster(Position position, String pathElement) {
		super(position,pathElement);
	}

	public void getAnimate(){
	 
	}
}