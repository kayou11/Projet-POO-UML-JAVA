package elements.motion;

import java.awt.Point;
import java.util.logging.Level;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.Permeability;
import elements.Elements;
import elements.Sprite;

public class MotionElements extends Elements implements IMotionElement{

	private int x;
	private int y;
	protected static int sens;
	
	public MotionElements(String name, Sprite sprite) {
		super(name, sprite, Permeability.BLOCKING);
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setNettleWorld(final ILorannWorld lorannWorld, final int x, final int y) {
		super.setLorannWorld(lorannWorld);
		this.setX(x);
		this.setY(y);
	}
	protected boolean isMovePossible(int x, int y) {
		System.out.println(getLorannWorld().getMotionlessElements(getX(), getY()));
		return this.getLorannWorld().getMotionlessElements(x, y).getPermeability() != Permeability.BLOCKING;
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

}
