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
	
	/** The IDs of the levels. */
	private ArrayList<Integer> levelsId;
	
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
		int lastIndex = this.levelsId.indexOf(this.lorannWorld.getId());
		if((lastIndex+1) < this.levelsId.size()) {
			this.lorannWorld = this.daoLorannWorld.find(this.levelsId.get(lastIndex+1));
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
