package elements;

import java.awt.Image;
import java.util.Observable;

import contract.BehaviorElements;
import contract.IElement;
import contract.ILocation;
import contract.ILorannWorld;
import contract.ISprite;
import contract.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class Elements.
 */
public class Elements extends Observable implements IElement{
	
	/** The lorann world. */
	private ILorannWorld lorannWorld;
	 
 	/**  The behavior of the element. */
    protected BehaviorElements behaviorElements;
    
    /**  The location of the element. */
    protected ILocation location;
	
	/** The sprite. */
	private ISprite sprite;
	
	/** The permeability. */
	private Permeability permeability;
	
	/** The id element. */
	private int idElement;
	
	/** The name. */
	private String name;
	

	/**
	 * Instantiates a new elements.
	 *
	 * @param name the name
	 * @param sprite the sprite
	 * @param permeability the permeability
	 */
	public Elements(String name, ISprite sprite, Permeability permeability) {
		this.sprite = sprite;
		this.permeability = permeability;
		this.name = name;
		
	}	

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public Image getImage(){
		return this.sprite.getImage();
	}
	
	/* (non-Javadoc)
	 * @see contract.IElement#getLocation()
	 */
	public ILocation getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(ILocation location) {
		this.location = location;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#getBehaviorElements()
	 */
	public BehaviorElements getBehaviorElements() {
		return behaviorElements;
	}


	/**
	 * Sets the behavior elements.
	 *
	 * @param behaviorElements the new behavior elements
	 */
	public void setBehaviorElements(BehaviorElements behaviorElements) {
		this.behaviorElements = behaviorElements;
	}
	
	/* (non-Javadoc)
	 * @see contract.IElement#getSprite()
	 */
	public ISprite getSprite() {
		return this.sprite;
	}

	/**
	 * Sets the sprite.
	 *
	 * @param sprite the new sprite
	 */
	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#getPermeability()
	 */
	public Permeability getPermeability() {
		return this.permeability;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#setPermeability(contract.Permeability)
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}


	/**
	 * Gets the id element.
	 *
	 * @return the id element
	 */
	public int getIdElement() {
		return idElement;
	}

	/**
	 * Sets the id element.
	 *
	 * @param idElement the new id element
	 */
	public void setIdElement(int idElement) {
		this.idElement = idElement;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the lorann world.
	 *
	 * @return the lorann world
	 */
	public ILorannWorld getLorannWorld() {
		return this.lorannWorld;
	}

	/**
	 * Sets the lorann world.
	 *
	 * @param lorannWorld the new lorann world
	 */
	public void setLorannWorld(ILorannWorld lorannWorld) {
		this.lorannWorld = lorannWorld;
	}
}
