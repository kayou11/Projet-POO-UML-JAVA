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
import contract.IOtherElements;
import contract.ISpell;
import elements.motion.Monster;
import elements.motion.Normal;
import elements.motion.Spell;
import elements.motion.behaviorGetAnimate;

public class LorannWorld extends Observable implements ILorannWorld{
	
	private final int width = 22;
	private final int height = 16;
	private Level map;
	private ILorann lorann;
	public ISpell spell;
	
    /**
     * The database ID of the level
     */
    private int id;
    
    /**
     * Indicate if the level is finished
     */
    private boolean finished;
    
	private IMonster monster;
	private IMotionlessElement[][] element;

	private ArrayList<IOtherElements> otherElements;
	
	public ArrayList<IMotionElement> motionElements;
	
	/**
	 * Instantiates a new LorannWorld.
	 */
	public LorannWorld(int id) {
		this.element = new IMotionlessElement[this.getWidth()][this.getHeight()];
		this.motionElements = new ArrayList<IMotionElement>();
		setMonster(monster);
		setSpell(spell);
		this.setId(id);
		this.setFinished(true);
	}
	
	
	public void addElements(IMotionElement motionElements, int x, int y) {
		this.motionElements.add(motionElements);
		motionElements.setLorannWorld(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}

	public void addElements(IMotionlessElement motionlessElements, int x, int y) {
		setMotionlessElements(motionlessElements, x, y);
		if(motionlessElements != null){
			motionlessElements.setLorannWorld(this);
		}
		this.setChanged();
	}

	public void addLorann(ILorann lorann, int x, int y) {
		setLorann(lorann);
		this.addElements(lorann, x, y);
	}
	
    /**
     * Add the IOtherElements
     * @param otherElements
     */
    public void addEntity(IOtherElements otherElements){
        this.otherElements.add(otherElements);
    }

    /**
     * Remove the IOtherElements
     * @param otherElements
     */
    public void removeEntity(IOtherElements otherElements){
        this.otherElements.remove(otherElements);
    }
    /**
     * Get the otherElements of the lorannWorld
     * @return
     * The otherElements
     */
	public ArrayList<IOtherElements> getOtherElements() {
        return otherElements;
    }
    
    /**
     * Set the otherElements of the lorannWorld
     * @param entities
     * The entity
     */
    public void setOtherElements(ArrayList<IOtherElements> otherElements) {
        this.otherElements = otherElements;
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


		return this.element[x][y];
	}
	
	public void setMotionlessElements(IMotionlessElement element,int x,int y){
		this.element[x][y] = element;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public boolean isFinished() {
		return finished;
	}


	public void setFinished(boolean finished) {
		this.finished = finished;
	}

}
