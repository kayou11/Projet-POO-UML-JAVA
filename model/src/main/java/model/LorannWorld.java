package model;

import java.util.ArrayList;
import java.util.Observable;

import contract.Direction;
import contract.IElement;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMonster;
import contract.IMotionElement;
import contract.IMotionlessElement;
import contract.ISpell;
import elements.motion.Monster;
import elements.motion.Normal;
import elements.motion.Spell;
import elements.motion.behaviorGetAnimate;

public class LorannWorld extends Observable implements ILorannWorld{
	
	private final int width;
	private final int height;
	private Level map;
	private ILorann lorann;
	public ISpell spell;

	private IMonster monster;
	private IMotionlessElement element[][];
	public ArrayList<IMotionElement> motionElements;
	
	/**
	 * Instantiates a new LorannWorld.
	 */
	public LorannWorld(final int width, final int height) {
		this.element = new IMotionlessElement[width][height];
		this.motionElements = new ArrayList<IMotionElement>();
		setMonster(monster);
		this.width = width;
		this.height = height;
		setSpell(spell);
	}
	
	public LorannWorld () {
		this(22, 16);
	}


	public void addElements(IMotionElement motionElements, int x, int y) {
		this.motionElements.add(motionElements);
		motionElements.setLorannWorld(this, x, y);
		this.setChanged();
		this.notifyObservers();
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


	public void addSpell(ISpell spell, int x, int y, Direction direction ) {
		this.addElements(new Spell(this, x, y, direction), x, y);
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
	
	public ISpell getSpell() {
		return this.spell;
	}

	public void setSpell(ISpell spell) {
		this.spell = spell;
		this.setChanged();
	}
	
	public IMonster getMonster() {
		return this.monster;
	}
	public void setMonster(final IMonster monster){
		this.monster = monster;
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
			
			for(final IMotionElement motionElement : this.motionElements){

			}
		}

	}

}
