package model;

import java.sql.SQLException;
import java.util.Observable;

import javax.swing.text.Position;

import contract.IModel;
import elements.motion.IMonster;
import elements.motion.Lorann;
import elements.motion.MotionElements;
import elements.motionless.MotionlessElements;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	/** The message. */
	private int level;
	private Lorann lorann;
	private IMonster monster;
	private MotionlessElements elements[][];

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.level = 0;
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getLevel()
	 */
	
	public int getLevel() {
		return level;
	}
	
	/**
	 * Sets the level.
	 *
	 * @param message
	 *          the new level
	 */
	
	public void setLevel(int level) {
		this.level = level;
		
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#loadLevel(java.lang.String)
	 */
	public void loadLevel(final int level) {
		
		try {
			final DAOLevel daoLevel = new DAOLevel(DBConnection.getInstance().getConnection());
			this.setLevel(daoLevel.find(level).getLevel());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	
	public Observable getObservable() {
		return this;
	}
	
	public void addElements(MotionElements elements, int x, int y) {
		// TODO Auto-generated method stub
	}

	public void addElements(MotionlessElements elements, int x, int y) {
		// TODO Auto-generated method stub
	}
	
	public void addLorann(Lorann lorann, int x, int y) {
		// TODO Auto-generated method stub

	}
	
	//public void addMonster(Monster monster, int x, int y) {
		// TODO Auto-generated method stub

	//}
	
	public MotionlessElements getMotionlessElements(Position position) {
		return null;
	}
	

	public void setHero(final Lorann lorann) {
		this.lorann = lorann;
		this.setChanged();
	}

	public void setMonster(final IMonster monster){
		this.monster = monster;
		this.setChanged();

	}
	
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}
}
