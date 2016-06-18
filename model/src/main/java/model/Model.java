package model;

import java.sql.SQLException;
import java.util.Observable;

import javax.swing.text.Position;

import contract.ILorannWorld;
import contract.IModel;
import elements.motion.IMonster;
import elements.motion.Lorann;
import elements.motion.Monster;
import elements.motion.MotionElements;
import elements.motionless.MotionlessElement;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	final DAOLorannWorld daoLorannWorld;
	private final ILorannWorld lorannWorld;

	/**
	 * Instantiates a new model.
	 * @throws SQLException 
	 */
	public Model() throws SQLException {
		this.daoLorannWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
		this.lorannWorld = this.daoLorannWorld.find(1);

	}

	/*
	 * 
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	
	public Observable getObservable() {
		return this;
	}

	public ILorannWorld getLorannWorld() {
		return this.lorannWorld;
	}
}
