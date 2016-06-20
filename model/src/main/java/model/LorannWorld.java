package model;

import java.util.ArrayList;
import java.util.Observable;

import contract.IAnimatedSprites;
import contract.IElement;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IMotionlessElement;
import contract.IOtherElements;
import elements.FactoryElements;


public class LorannWorld extends Observable implements ILorannWorld{
	
	private final int width = 22;
	private final int height = 16;
	private ILorann lorann;
	private boolean spellLaunched;
	private boolean attractSpell;
	
    /**
     * The database ID of the level
     */
    private int id;
    
    /**
     * Indicate if the level is finished
     */
    private boolean finished;
    
	private IElement[][] element;

	private ArrayList<IOtherElements> otherElements;
	
	public ArrayList<IMotionElement> motionElements;
	
	/**
	 * Instantiates a new LorannWorld.
	 */
	public LorannWorld(int id) {
		this.element = new IMotionlessElement[this.getWidth()][this.getHeight()];
		this.motionElements = new ArrayList<IMotionElement>();
		this.otherElements = new ArrayList<IOtherElements>();
		this.id = id;
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
		this.addElements(FactoryElements.getfromNameSpell("SpellGreen",this), x, y);
		setLorann(lorann);
		this.addElements(lorann, x, y);
	}
	
    /**
     * Add the IOtherElements
     * @param otherElements
     */
    public void addOtherElements(IOtherElements otherElements){
        this.otherElements.add(otherElements);
    }

    /**
     * Remove the IOtherElements
     * @param otherElements
     */
    public void removeOtherElements(IOtherElements otherElements){
        this.otherElements.remove(otherElements);
    }
    
    /**
     * Get the otherElements of the lorannWorld
     * @return
     * The otherElements
     */
	@SuppressWarnings("unchecked")
	public ArrayList<IOtherElements> getOtherElements() {
        return ( ArrayList<IOtherElements>) otherElements.clone();
    }
    
    /**
     * Set the otherElements of the lorannWorld
     * @param entities
     * The entity
     */
    public void setOtherElements(ArrayList<IOtherElements> otherElements) {
        this.otherElements = otherElements;
    }
    
    /**
     * Remove the element
     * @param element
     */
    public void destroyElement(IElement element){
        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {	                	
            	IElement elementmap = getMotionlessElements(x, y);
            	if(elementmap != null)
                    if(element instanceof IElement){
                        this.setMotionlessElements(null,lorann.getX(), lorann.getY());
                    }
            }
            
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

	
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}
	

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	public IElement getMotionlessElements(int x, int y) {
		return this.element[x][y];
	}
	
	public void setMotionlessElements(IElement element,int x,int y){

		this.element[x][y] = element;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
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


	public void play() {
		for(;;)
		{
			this.setMobileHasChanged();
			try {
				Thread.sleep(125);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
			
			for(final IMotionElement motionElement : this.motionElements){
				if(motionElement.getBehaviorGetAnimate() != null)
					//motionElement.getBehaviorGetAnimate().animate(motionElement, this);
				this.lorann.animate();
			}
			updateSprites();

		}		
	}
	
	/**
	 * Update the sprites
	 */
	private void updateSprites(){
		for(IOtherElements otherElements : this.getOtherElements()){
			if(otherElements.getSprite() instanceof IAnimatedSprites){
				((IAnimatedSprites) otherElements.getSprite()).nextStep();
			}
		}
		
		if(this.getLorann().getSprite() instanceof IAnimatedSprites){
			((IAnimatedSprites) this.getLorann().getSprite()).nextStep();
		}
		
	}

	public boolean isSpellLaunched() {
		return spellLaunched;
	}


	public void setSpellLaunched(boolean spellLaunched) {
		this.spellLaunched = spellLaunched;
	}


	public boolean isAttractSpell() {
		return attractSpell;
	}


	public void setAttractSpell(boolean attractSpell) {
		this.attractSpell = attractSpell;
	}

}
