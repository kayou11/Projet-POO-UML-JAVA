package contract;

public interface ILorann extends IMotionElement{

	boolean animate(Direction direction);

	boolean isAlive();

	void setDirection(Direction direction);

}
