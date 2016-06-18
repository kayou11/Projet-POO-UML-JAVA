package contract;

import java.util.ArrayList;
import java.util.Observable;

public interface ILorannWorld {
	void setMobileHasChanged();
	
	public void play();
	/**
	 * Load the Level.
	 *
	 * @param key
	 *          the key
	 */
	
	public void addElements(IMotionElement elements, int x, int y);

	public void addElements(IMotionlessElement elements, int x, int y);
	
	public void addLorann(ILorann lorann, int x, int y);
	
	public IElement[][] getMotionlessElements();
	
	public ArrayList<IMotionElement> getMotionElements();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	public int getWidth();
	public int getHeight();

	public IElement getMotionlessElements(int x, int y);
	
	public ILorann getLorann();
}
