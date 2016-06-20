package contract;

import java.util.Observable;

// TODO: Auto-generated Javadoc
/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Gets the lorann world.
	 *
	 * @return the lorann world
	 */
	public ILorannWorld getLorannWorld();

	/**
	 * Load next level.
	 *
	 * @return true, if successful
	 */
	public boolean loadNextLevel();
}
