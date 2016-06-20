package elements;

import java.util.Observable;

import contract.BehaviorElements;
import contract.IElement;
import contract.ILocation;
import contract.ILorannWorld;
import contract.ISprite;
import contract.Permeability;

public class Elements extends Observable implements IElement{
	
	private ILorannWorld lorannWorld;
	 /** The behavior of the element */
    protected BehaviorElements behaviorElements;
    /** The location of the element */
    protected ILocation location;
	private ISprite sprite;
	private Permeability permeability;
	private int idElement;
	private String name;

	public Elements(String name, ISprite sprite, Permeability permeability) {
		this.sprite = sprite;
		this.permeability = permeability;
		this.name = name;
		
	}	

	public ILocation getLocation() {
		return location;
	}

	public void setLocation(ILocation location) {
		this.location = location;
	}

	public BehaviorElements getBehaviorElements() {
		return behaviorElements;
	}


	public void setBehaviorElements(BehaviorElements behaviorElements) {
		this.behaviorElements = behaviorElements;
	}
	
	public ISprite getSprite() {
		return this.sprite;
	}

	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}

	public Permeability getPermeability() {
		return this.permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}


	public int getIdElement() {
		return idElement;
	}

	public void setIdElement(int idElement) {
		this.idElement = idElement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ILorannWorld getLorannWorld() {
		return this.lorannWorld;
	}

	public void setLorannWorld(ILorannWorld lorannWorld) {
		this.lorannWorld = lorannWorld;
	}
}
