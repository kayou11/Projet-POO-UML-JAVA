package contract;

public interface IMotionElement extends IElement {
	Permeability getPermeability();
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
}
