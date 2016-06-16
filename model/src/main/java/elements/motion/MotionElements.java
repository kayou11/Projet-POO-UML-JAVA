package elements.motion;

import java.util.logging.Level;

import elements.Elements;
import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class MotionElements extends Elements {

	private int x;
	private int y;
	protected static int sens;

	public MotionElements(Position position, Sprite sprite) {
		super(position, sprite, Permeability.BLOCKING);
	}

	public int getX() {
		return this.x;
	}

	protected void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	protected void setY(int y) {
		this.y = y;
	}

	public void setLevel(Level level, int x, int y) {

	}

	protected boolean isMovePossible(int x, int y) {
		return getModel().getMotionlessElements(getX(), getY()).getPermeability() != Permeability.BLOCKING;
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
