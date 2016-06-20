package contract;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Observable;

public interface ILorannWorld {
	
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
	
	void setMobileHasChanged();

	public int getWidth();
	
	public int getHeight();

	public IMotionlessElement getMotionlessElements(int x, int y);
	
	public ILorann getLorann();
	public ArrayList<IOtherElements> getOtherElements();
	public int getId();
	public boolean isFinished();
	public void setFinished(boolean isFinished);
	
}
