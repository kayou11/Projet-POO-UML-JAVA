package model;

import java.util.ArrayList;
import java.util.Observable;

import contract.IAnimatedSprites;
import contract.IDoor;
import contract.IElement;
import contract.IEnergyBall;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IMotionlessElement;
import contract.IOtherElements;
import contract.Permeability;
import elements.FactoryElements;


// TODO: Auto-generated Javadoc
/**
 * The Class LorannWorld.
 */
public class LorannWorld extends Observable implements ILorannWorld{
	
	/** The width. */
	private final int width = 22;
	
	/** The height. */
	private final int height = 16;
	
	/** The lorann. */
	private ILorann lorann;
	
	/** The spell launched. */
	private boolean spellLaunched;
	
	/** The attract spell. */
	private boolean attractSpell;
	
    /** The database ID of the level. */
    private int id;
    
    /** Indicate if the level is finished. */
    private boolean finished;
    
	/** The element. */
	private IElement[][] element;

	/** The other elements. */
	private ArrayList<IOtherElements> otherElements;
	
	/** The motion elements. */
	public ArrayList<IMotionElement> motionElements;
	
	/**
	 * Instantiates a new LorannWorld.
	 *
	 * @param id the id
	 */
	public LorannWorld(int id) {
		this.element = new IMotionlessElement[this.getWidth()][this.getHeight()];
		this.motionElements = new ArrayList<IMotionElement>();
		this.otherElements = new ArrayList<IOtherElements>();
		this.id = id;
	}
	
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorld#addElements(contract.IMotionElement, int, int)
	 */
	public void addElements(IMotionElement motionElements, int x, int y) {
		this.motionElements.add(motionElements);
		motionElements.setLorannWorld(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#addElements(contract.IMotionlessElement, int, int)
	 */
	public void addElements(IMotionlessElement motionlessElements, int x, int y) {
		setMotionlessElements(motionlessElements, x, y);
		if(motionlessElements != null){
			motionlessElements.setLorannWorld(this);
		}
		this.setChanged();
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#addLorann(contract.ILorann, int, int)
	 */
	public void addLorann(ILorann lorann, int x, int y) {
		this.addElements(FactoryElements.getfromNameSpell("SpellGreen",this), x, y);
		setLorann(lorann);
		this.addElements(lorann, x, y);
	}
	
    /**
     * Add the IOtherElements.
     *
     * @param otherElements the other elements
     */
    public void addOtherElements(IOtherElements otherElements){
        this.otherElements.add(otherElements);
    }

    /**
     * Remove the IOtherElements.
     *
     * @param otherElements the other elements
     */
    public void removeOtherElements(IOtherElements otherElements){
        this.otherElements.remove(otherElements);
    }
    
    /**
     * Get the otherElements of the lorannWorld.
     *
     * @return The otherElements
     */
	@SuppressWarnings("unchecked")
	public ArrayList<IOtherElements> getOtherElements() {
        return ( ArrayList<IOtherElements>) otherElements.clone();
    }
    
    /**
     * Set the otherElements of the lorannWorld.
     *
     * @param otherElements the new other elements
     */
    public void setOtherElements(ArrayList<IOtherElements> otherElements) {
        this.otherElements = otherElements;
    }
    
    /**
     * Remove the element.
     *
     * @param element the element
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

	
	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getMotionlessElements()
	 */
	public IElement[][] getMotionlessElements() {
		return this.element;
	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getMotionElements()
	 */
	public ArrayList<IMotionElement> getMotionElements() {

		return this.motionElements;
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getLorann()
	 */
	public ILorann getLorann() {
		return lorann;
	}
	
	/**
	 * Sets the lorann.
	 *
	 * @param lorann the new lorann
	 */
	public void setLorann(final ILorann lorann) {
		this.lorann = lorann;
		this.setChanged();
	}

	
	/* (non-Javadoc)
	 * @see contract.ILorannWorld#setMobileHasChanged()
	 */
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}
	

	/* (non-Javadoc)
	 * @see java.util.Observable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getMotionlessElements(int, int)
	 */
	public IElement getMotionlessElements(int x, int y) {
		return this.element[x][y];
	}
	
	/**
	 * Sets the motionless elements.
	 *
	 * @param element the element
	 * @param x the x
	 * @param y the y
	 */
	public void setMotionlessElements(IElement element,int x,int y){

		this.element[x][y] = element;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getWidth()
	 */
	public int getWidth() {
		return this.width;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getHeight()
	 */
	public int getHeight() {
		return this.height;
	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getId()
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorld#isFinished()
	 */
	public boolean isFinished() {
		return finished;
	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorld#setFinished(boolean)
	 */
	public void setFinished(boolean finished) {
		this.finished = finished;
	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorld#play()
	 */
	public void play() {
		int time = 0;
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
					motionElement.getBehaviorGetAnimate().animate(motionElement, this);
				this.lorann.animate();
			}

			updateSprites();
			if(time == 100){
	            for (int y = 0; y < this.getHeight(); y++) {
	                for (int x = 0; x < this.getWidth(); x++) {	                	
	                	IElement elementmap = this.getMotionlessElements(x, y);
	                	if(elementmap != null){
			                if (elementmap.getName().equals("EnergyBall")) {
			                   ((IEnergyBall) this.getMotionlessElements(x, y)).setPermeability(Permeability.PENETRABLE);
			                }
	                	}
	                }
	            }
	            time = 0;
			}
			
			time++;
		}		
	}
	
	/**
	 * Update the sprites.
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

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#isSpellLaunched()
	 */
	public boolean isSpellLaunched() {
		return spellLaunched;
	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorld#setSpellLaunched(boolean)
	 */
	public void setSpellLaunched(boolean spellLaunched) {
		this.spellLaunched = spellLaunched;
	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorld#isAttractSpell()
	 */
	public boolean isAttractSpell() {
		return attractSpell;
	}


	/* (non-Javadoc)
	 * @see contract.ILorannWorld#setAttractSpell(boolean)
	 */
	public void setAttractSpell(boolean attractSpell) {
		this.attractSpell = attractSpell;
	}
}
