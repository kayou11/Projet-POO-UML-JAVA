package model;



import java.util.ArrayList;

import contract.ILorannWorld;
import contract.IModel;

// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model implements IModel {

	/** The dao lorann world. */
	final DAOLorannWorld daoLorannWorld;
	
	/** The lorann world. */
	private ILorannWorld lorannWorld;
	
	
	/**
	 * Instantiates a new model.
	 *
	 * @throws Exception the exception
	 */
	public Model() throws Exception {
		this.daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
		this.lorannWorld = this.daoLorannWorld.find(1);

	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#loadNextLevel()
	 */
	public boolean loadNextLevel(){
		System.out.println("id : "+this.lorannWorld.getId());
		int lastIndex = this.lorannWorld.getId();
		if((lastIndex+1) < 5) {
			this.lorannWorld = this.daoLorannWorld.find(lastIndex+1);
			this.lorannWorld.setId(lastIndex+1);
			return true;
		}
		return false;
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
