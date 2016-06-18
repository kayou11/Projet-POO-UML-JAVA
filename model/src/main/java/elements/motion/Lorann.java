package elements.motion;

import java.awt.event.KeyEvent;

import contract.ILorann;
import elements.AnimatedSprite;
import elements.Sprite;
import model.LorannWorld;

public class Lorann extends MotionElements implements ILorann{

	static Sprite lorannUp = new Sprite("lorann_u.png");
	static Sprite lorannDown = new Sprite("lorann_b.png");
	static Sprite lorannRight= new Sprite("lorann_r.png");
	static Sprite lorannLeft = new Sprite("lorann_l.png");
	static Sprite lorannUpRight = new Sprite("lorann_ur.png");
	static Sprite lorannUpLeft = new Sprite("lorann_ul.png");
	static Sprite lorannDownRight = new Sprite("lorann_br.png");
	static Sprite lorannDownLeft = new Sprite("lorann_bl.png");
	

	/*static String lorannUp ="lorann_u.png";
	static String lorannDown = "lorann_b.png";
	static String lorannRight= "lorann_r.png";
	static String lorannLeft = "lorann_l.png";
	static String lorannUpRight = "lorann_ur.png";
	static String lorannUpLeft = "lorann_ul.png";
	static String lorannDownRight = "lorann_br.png";
	static String lorannDownLeft = "lorann_bl.png";*/
	
	private int keyCode;
	public boolean win = false;

	static Sprite sprite[] = {lorannRight, lorannDownRight, lorannDown, lorannDownLeft, lorannLeft, lorannUpLeft,
			lorannUp, lorannUpRight };
	
	public Lorann(LorannWorld lorannWorld) {
	super("LorannRight",lorannRight);
	this.setLorannWorld(lorannWorld);
	}

	/*public Lorann(LorannWorld lorannWorld) {
	super("LorannRight", new AnimatedSprite("lorann_r.png", sprite));
	this.setLorannWorld(lorannWorld);
	}*/
	
	public void setWin(boolean win) { 
		this.win = win;
	}

	public boolean getWin() {
		return this.win;
		
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
