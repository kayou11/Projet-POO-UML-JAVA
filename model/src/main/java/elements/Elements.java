package elements;

import model.Level;
import model.Model;

import java.sql.SQLException;

import model.DAOElements;
import model.DBConnection;
import model.Entity;

public class Elements extends Entity{
	
	private Sprite sprite;
	private Permeability permeability;
	private Model model;
	private static Position position;
	private int idElement;
	private String name;
	private String pathElement;

	public Elements(Position position, Sprite sprite, Permeability permeability) {
		this.setPathElement(this.pathElement);
		this.setPermeability(this.permeability);
		this.setPosition(this.position);
	}
	
	public Elements(final int idElement, final String Name,final String pathElement){
		this.setIdElement(idElement);
		this.setName(Name);
		this.setPathElement(pathElement);
	}
	
	public Elements(){
		this(0, "", "");
	}

	public Sprite getSprite() {
		return this.sprite;
	}



	public void setSprite(Sprite sprite) {
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

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
}
