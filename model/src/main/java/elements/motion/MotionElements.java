package elements.motion;

import java.util.logging.Level;

import elements.Elements;
import elements.Permeability;
import elements.Position;
import elements.Sprite;

public class MotionElements extends Elements{
	
	private Direction direction;
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
	
	protected void isMovePossible(Position position){
		
	}
	

	private void moveUp(){
		
	}
	
	private void moveDown(){
		
	}
	
	private void moveRight(){
		
	}
	
	private void moveLeft(){
		
	}
}




