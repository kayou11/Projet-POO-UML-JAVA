package elements;

import model.Level;
import model.Model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IElement;
import contract.ILorannWorld;
import contract.IModel;
import contract.ISprite;
import contract.Permeability;
import model.DAOElements;
import model.DBConnection;
import model.Entity;

public class Elements extends Observable implements IElement{
	
	private ILorannWorld lorannWorld;
	private ISprite sprite;
	private Permeability permeability;
	private static Position position;
	private int idElement;
	private String name;
	private String pathElement;

	public Elements(String name, Sprite sprite, Permeability permeability) {
		this.setPathElement(this.pathElement);
		this.setPermeability(this.permeability);
		this.setName(name);
		
	}
	
	public Elements(final int idElement, final String Name,final String pathElement){
		this.setIdElement(idElement);
		this.setName(Name);
		this.setPathElement(pathElement);
	}
	
	public Elements(){
		this(0, "", "");
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

	public static Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
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
