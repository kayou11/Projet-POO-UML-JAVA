package contract;

public interface IMotionElement extends IElement {
	Permeability getPermeability();
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public void setLorannWorld(final ILorannWorld lorannWorld, final int x, final int y);
}
