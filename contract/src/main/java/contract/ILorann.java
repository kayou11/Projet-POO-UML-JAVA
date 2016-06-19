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
	boolean isSpellPossible(int x, int y);

	public Direction getDirection();
	public void addSpell(int x, int y, Direction direction);
	public ISpell getSpell();


}
