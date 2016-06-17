package model;

import java.util.ArrayList;
import java.util.Observable;

import contract.IElement;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMonster;
import contract.IMotionElement;
import contract.IMotionlessElement;

public class LorannWorld extends Observable implements ILorannWorld{
	/** The message. */
	private final int width;
	private final int height;
	private Level map;
	private ILorann lorann;
	private IElement element[][];
	public ArrayList<IMotionElement> motionElements;
	/**
	 * Instantiates a new model.
	 */
	public LorannWorld(final int width, final int height) {
		this.element = new IElement[width][height];
		this.motionElements = new ArrayList<IMotionElement>();
		this.width = width;
		this.height = height;
	}
	
	public LorannWorld () {
		this(22, 14);
	}


	public void addElements(IMotionElement motionElements, int x, int y) {
		motionElements.setX(x);
		motionElements.setY(y);
		this.motionElements.add(motionElements);
		this.setChanged();		
	}

	public void addElements(IMotionlessElement motionlessElements, int x, int y) {
		this.element[x][y] = motionlessElements;
		this.setChanged();
	}

	public void addLorann(ILorann lorann, int x, int y) {
		setLorann(lorann);
		this.addElements((IMotionElement) lorann, x, y);
	}

	public void addMonster(IMonster monster, int x, int y) {
		this.setMonster(monster);
		this.addElements((IMotionElement) monster, x, y);
		
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	
	public Observable getObservable() {
		return this;
	}

	
	public IElement[][] getMotionlessElements() {
		return this.element;
	}


	public ArrayList<IMotionElement> getMotionElements() {

		return this.motionElements;
	}
	
	public ILorann getLorann() {
		return lorann;
	}
	
	public void setLorann(final ILorann lorann) {
		this.setLorann(lorann);
		this.setChanged();
	}

	public void setMonster(final IMonster monster){
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

	public Level getMap() {
		return this.map;
	}

	public void setMap(Level map) {
		this.map = map;
	}

	public void play() {
		try {
			Thread.sleep(1000);
		} catch (final InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.element[0][3] = null;
		this.setChanged();
		this.notifyObservers();
		for(;;)
		{
			//
			//
		}		
	}

	public IElement getElement(final int x,final int y) {
		return this.element[x][y];
	}

	public void setElement(IElement element[][]) {
		this.element = element;
	}


	public IElement getMotionlessElements(int x, int y) {
		if ((x < 0) || (y < 0) || (x >= this.getWidth()) || (y >= this.getHeight())) {
			return null;
		}
		return this.element[x][y];
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

}
