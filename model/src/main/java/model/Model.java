package model;



import contract.ILorannWorld;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model implements IModel {

	final DAOLorannWorld daoLorannWorld;
	private final ILorannWorld lorannWorld;

	/**
	 * Instantiates a new model.
	 * @throws Exception 
	 */
	public Model() throws Exception {
		this.daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
		this.lorannWorld = this.daoLorannWorld.find(2);

	}

	/*
	 * 
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */

	public ILorannWorld getLorannWorld() {
		return this.lorannWorld;
	}
}
