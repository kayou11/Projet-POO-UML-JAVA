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
	
	public void addSpell(ISpell spell, int x, int y, Direction direction );
	
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

	public IElement getMotionlessElements(int x, int y);
	
	public ILorann getLorann();
	
	public ISpell getSpell();
	
}
