package contract;

public interface ILorann extends IMotionElement{

	boolean animate(Direction direction);

	boolean isAlive();

	void setDirection(Direction direction);

	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
	void moveRightUp();
	void moveRightDown();
	void moveLeftDown();
	void moveLeftUp();

	public Direction getDirection();

	boolean isSpell();

	void setSpell(boolean spell);
}
