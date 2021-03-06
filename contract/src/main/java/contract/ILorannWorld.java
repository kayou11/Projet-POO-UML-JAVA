package contract;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Observable;

// TODO: Auto-generated Javadoc
/**
 * The Interface ILorannWorld.
 */
public interface ILorannWorld {
	
	/**
	 * Play.
	 */
	public void play();
	
	/**
	 * Load the Level.
	 *
	 * @param elements the elements
	 * @param x the x
	 * @param y the y
	 */
	
	public void addElements(IMotionElement elements, int x, int y);

	/**
	 * Adds the elements.
	 *
	 * @param elements the elements
	 * @param x the x
	 * @param y the y
	 */
	public void addElements(IMotionlessElement elements, int x, int y);
	
	/**
	 * Adds the lorann.
	 *
	 * @param lorann the lorann
	 * @param x the x
	 * @param y the y
	 */
	public void addLorann(ILorann lorann, int x, int y);
		
	/**
	 * Gets the motionless elements.
	 *
	 * @return the motionless elements
	 */
	public IElement[][] getMotionlessElements();
	
	/**
	 * Gets the motion elements.
	 *
	 * @return the motion elements
	 */
	public ArrayList<IMotionElement> getMotionElements();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	
	/**
	 * Sets the mobile has changed.
	 */
	void setMobileHasChanged();


	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth();
	
	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight();

	/**
	 * Gets the motionless elements.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the motionless elements
	 */
	public IElement getMotionlessElements(int x, int y);
	
	/**
	 * Gets the lorann.
	 *
	 * @return the lorann
	 */
	public ILorann getLorann();
	
	/**
	 * Gets the other elements.
	 *
	 * @return the other elements
	 */
	public ArrayList<IOtherElements> getOtherElements();
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId();
	
	/**
	 * Checks if is finished.
	 *
	 * @return true, if is finished
	 */
	public boolean isFinished();
	
	/**
	 * Sets the finished.
	 *
	 * @param isFinished the new finished
	 */
	public void setFinished(boolean isFinished);

	/**
	 * Destroy element.
	 *
	 * @param element the element
	 */
	public void destroyElement(IElement element);

	/**
	 * Checks if is spell launched.
	 *
	 * @return true, if is spell launched
	 */
	public boolean isSpellLaunched();

	/**
	 * Sets the spell launched.
	 *
	 * @param b the new spell launched
	 */
	public void setSpellLaunched(boolean b);

	/**
	 * Sets the attract spell.
	 *
	 * @param b the new attract spell
	 */
	public void setAttractSpell(boolean b);

	/**
	 * Checks if is attract spell.
	 *
	 * @return true, if is attract spell
	 */
	public boolean isAttractSpell();

	public void setId(int level);

	public int getValue();
	
}
