package elements.motion;


import elements.Position;
import elements.Sprite;

public class Monster2 extends Monster{

	public Monster2() {
		super(new Position(getPosition().getX(), getPosition().getY()),loadSprite(21));
	}
	

}
