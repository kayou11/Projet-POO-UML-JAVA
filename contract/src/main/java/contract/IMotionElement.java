package contract;

public interface IMotionElement extends IElement {
	Permeability getPermeability();
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public void setLorannWorld(final ILorannWorld lorannWorld, final int x, final int y);
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
	void moveRightUp();
	void moveRightDown();
	void moveLeftDown();
	void moveLeftUp();
	void moveTo(int x, int y);
	public BehaviorAnimate getBehaviorGetAnimate();
	boolean isMovePossible(int x, int y);
	public void saveLastPosition();
}
