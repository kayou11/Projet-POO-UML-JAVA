package elements.motion;


import elements.Position;
import elements.Sprite;

public class Monster1 extends Monster{

	public Monster1() {
		super(new Position(getPosition().getX(), getPosition().getY()),new Sprite(20));
	}

}
