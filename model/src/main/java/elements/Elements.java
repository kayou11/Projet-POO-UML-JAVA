package elements;

import java.util.Observable;

import contract.IElement;
import contract.ILorannWorld;
import contract.ISprite;
import contract.Permeability;

public class Elements extends Observable implements IElement{
	
	private ILorannWorld lorannWorld;
	private ISprite sprite;
	private Permeability permeability;
	private int idElement;
	private String name;
	private String pathElement;

	public Elements(String name, ISprite sprite, Permeability permeability) {
		this.sprite = sprite;
		this.permeability = permeability;
		this.name = name;
		
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

	public String getPathElement() {
		return pathElement;
	}

	public void setPathElement(String pathElement) {
		this.pathElement = pathElement;
	}

	public ILorannWorld getLorannWorld() {
		return lorannWorld;
	}

	public void setLorannWorld(ILorannWorld lorannWorld) {
		this.lorannWorld = lorannWorld;
	}
}
