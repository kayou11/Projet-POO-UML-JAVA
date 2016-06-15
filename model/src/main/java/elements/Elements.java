package elements;

import model.Level;
import model.Entity;

public abstract class Elements extends Entity{
	
	private Sprite sprite;
	private Permeability permeability;
	private Level level;
	private static Position position;

	public Elements(Position position, Sprite sprite, Permeability permeability) {
		setSprite(this.sprite);
		setPermeability(this.permeability);
		setPosition(this.position);
	}

	public Sprite getSprite() {
		return this.sprite;
	}

	public void loadSprite(int idElement) {
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

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public static Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
