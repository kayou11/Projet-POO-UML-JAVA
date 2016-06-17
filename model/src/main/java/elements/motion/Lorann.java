package elements.motion;

import java.awt.event.KeyEvent;

import elements.Position;
import elements.Sprite;

public class Lorann extends MotionElements{
	
	static Sprite lorannUp = new Sprite(1);
	static Sprite lorannDown = new Sprite(2);
	static Sprite lorannRight= new Sprite(3);
	static Sprite lorannLeft = new Sprite(4);
	static Sprite lorannUpRight = new Sprite(5);
	static Sprite lorannUpLeft = new Sprite(7);
	static Sprite lorannDownRight = new Sprite(6);
	static Sprite lorannDownLeft = new Sprite(8);
	private static int key;
	
	static Sprite sprite [] = {lorannRight,lorannDownRight, lorannDown,lorannDownLeft,lorannLeft,lorannUpLeft,lorannUp,lorannUpRight};
	
	public Lorann() {
		super(new Position(getPosition().getX(), getPosition().getY()),changeLorann(sens, 0));
	}
	
	public static Sprite changeLorann(int sens, int keyCode) {

		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT){
			switch (sens) {
				case 1:
					return sprite[1];
			
				case 2:
					return sprite[2];
				
				case 3:
					return sprite[3];
				
				case 4:
					return sprite[4];
			
				case 5:
					return sprite[5];
				
				case 6:
					return sprite[6];
			
				case 7:
					return sprite[7];
				
				case 8:
					return sprite[8];
			
				default:
				;
			}
		}
		else {
			for(int i = 0 ; i < sprite.length ; i++){
				return sprite[i];
			}
		}
		return null;
	}			
}
