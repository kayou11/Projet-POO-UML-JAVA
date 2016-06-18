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
	private IMotionlessElement element[][];
	public ArrayList<IMotionElement> motionElements;
	/**
	 * Instantiates a new model.
	 */
	public LorannWorld(final int width, final int height) {
		this.element = new IMotionlessElement[width][height];
		this.motionElements = new ArrayList<IMotionElement>();
		this.width = width;
		this.height = height;
	}
	
	public LorannWorld () {
		this(22, 16);
	}


	public void addElements(IMotionElement motionElements, int x, int y) {
		motionElements.setX(x);
		motionElements.setY(y);
		this.motionElements.add(motionElements);
		this.setChanged();		
	}

	public void addElements(IMotionlessElement motionlessElements, int x, int y) {
		this.element[x][y] = motionlessElements;
		if(motionlessElements != null){
			motionlessElements.setLorannWorld(this);
		}
		this.setChanged();
	}


	public void addLorann(ILorann lorann, int x, int y) {
		setLorann(lorann);
		this.addElements(lorann, x, y);
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
		this.lorann = lorann;
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
		for(;;)
		{
			this.setChanged();
			this.notifyObservers();
			try {
				Thread.sleep(125);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
			/*for(final IMobile mobile : this.motionElements)
			{
				mobile.getStrategy().animate(mobile, this);
			}*/
		}

	}

	public IMotionlessElement getElement(final int x,final int y) {
		return this.element[x][y];
	}

	public void setElement(IMotionlessElement element[][]) {
		this.element = element;
	}


	public IMotionlessElement getMotionlessElements(int x, int y) {
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
