package elements.motion;

import java.util.logging.Level;

import elements.Elements;
import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class MotionElements extends Elements{
	
	private int x;
	private int y;

	public MotionElements(Position position, Sprite sprite){
		super(position, sprite, Permeability.BLOCKING);
	}
	
	public int getX(){
		return this.x;
	}
	
	protected void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return this.y;
	}
	
	protected void setY(int y){
		this.y = y;
	}
	
	public void setLevel(Level level, int x, int y){
		
	}
	
	protected boolean isMovePossible(int x, int y){
		return (this.getModel().getMotionlessElements(getX(), getY()).getPermeability() != Permeability.BLOCKING);
	}
	
	public void moveUp() {
		if (this.isMovePossible(this.getX(), this.getY() - 1)) {
			this.setY(this.getY() - 1);
		}
	}

	public void moveLeft() {
		if (this.isMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
	}

	public void moveDown() {
		if (this.isMovePossible(this.getX(), this.getY() + 1)) {
			this.setY(this.getY() + 1);
		}
	}

	public void moveRight() {
		if (this.isMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
	}
	


}




