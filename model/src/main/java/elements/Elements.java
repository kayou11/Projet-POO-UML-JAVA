package elements;

import java.util.logging.Level;

public abstract class Elements {
	private ISprite sprite;
	private Permeability permeability;
	private Level level;
	private Position position;

	public void Elements(Position position) {
		setSprite(this.sprite);
		setPermeability(this.permeability);
	}

	public ISprite getSprite() {
		return this.sprite;
	}

	public void loadSprite(int idElement) {
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

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
