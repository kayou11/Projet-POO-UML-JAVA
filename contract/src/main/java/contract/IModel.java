package contract;

import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	int getLevel();

	/**
	 * Load the message.
	 *
	 * @param key
	 *          the key
	 */
	void loadLevel(int level);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	void setMobileHasChanged();
}
