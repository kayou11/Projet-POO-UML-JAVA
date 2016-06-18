package elements.motion;

import java.awt.event.KeyEvent;

import contract.ControllerOrder;
import contract.ILorann;
import elements.Sprite;

public class Lorann extends MotionElements implements ILorann{

	static Sprite lorannUp = new Sprite("lorann_u.png");
	static Sprite lorannDown = new Sprite("lorann_b.png");
	static Sprite lorannRight= new Sprite("lorann_r.png");
	static Sprite lorannLeft = new Sprite("lorann_l.png");
	static Sprite lorannUpRight = new Sprite("lorann_ur.png");
	static Sprite lorannUpLeft = new Sprite("lorann_ul.png");
	static Sprite lorannDownRight = new Sprite("lorann_br.png");
	static Sprite lorannDownLeft = new Sprite("lorann_bl.png");
	private int keyCode;
	public boolean win = false;

	static Sprite sprite[] = {lorannRight, lorannDownRight, lorannDown, lorannDownLeft, lorannLeft, lorannUpLeft,
			lorannUp, lorannUpRight };

	/*public Lorann() {
	super("LorannRight",changeLorann(sens,key));	
	}*/

	public Lorann() {
	super("LorannRight", lorannRight);	
	}
	
	public void setWin(boolean win) {
		this.win = win;
	}

	public boolean getWin() {
		return this.win;
		
	}

	public static Sprite changeLorann(int sens, int keyCode) {

		if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_LEFT) {
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
		} else {
			for (int i = 0; i < sprite.length; i++) {
				return sprite[i];
			}
		}
		return null;
	}
	

	public void moveUp() {
		if (isMovePossible(getX(), getY() - 1)) {
			setY(getY() - 1);
		}
		sens = 7;
	}

	public void moveLeft() {
		if (isMovePossible(getX() - 1, getY())) {
			setX(getX() - 1);
		}
		sens = 5;
	}

	public void moveDown() {
		if (isMovePossible(getX(), getY() + 1)) {
			setY(getY() + 1);
		}
		sens = 3;
	}

	public void moveRight() {
		if (isMovePossible(getX() + 1, getY())) {
			setX(getX() + 1);
		}
		sens = 1;
	}

	public void moveUpRight() {
		if (isMovePossible(getX() + 1, getY() - 1)) {
			setX(getX() + 1);
			setY(getY() - 1);
		}
		sens = 8;
	}

	public void moveUpLeft() {
		if (isMovePossible(getX() - 1, getY() - 1)) {
			setX(getX() - 1);
			setY(getY() - 1);
		}
		sens = 6;
	}

	public void moveDownRight() {
		if (isMovePossible(getX() + 1, getY() + 1)) {
			setX(getX() + 1);
			setY(getY() + 1);
		}
		sens = 2;
	}

	public void moveDownLeft() {
		if (isMovePossible(getX() - 1, getY() + 1)) {
			setX(getX() - 1);
			setY(getY() + 1);
		}
		sens = 4;
	}




	public void setKeyCode(final int keyCode){
		this.keyCode = keyCode;
	}

	public void animate() {
		if((this.keyCode == KeyEvent.VK_UP) || (this.keyCode == KeyEvent.VK_DOWN) || (this.keyCode == KeyEvent.VK_RIGHT) || (this.keyCode == KeyEvent.VK_LEFT)){

		}		
	}
}
