package elements.motion;

import java.awt.Point;
import java.util.logging.Level;

import contract.Direction;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.Permeability;
import elements.Elements;
import elements.Sprite;

public class MotionElements extends Elements implements IMotionElement{

	protected Point position;
	private Direction direction;
	private ILorannWorld lorannWorld;
	protected int saveX;
	protected int saveY;
	
	public MotionElements(String name, Sprite sprite,ILorannWorld lorannWorld) {
		super(name, sprite, Permeability.BLOCKING);
		this.lorannWorld = lorannWorld;
		this.direction = Direction.NONE;
		this.position = new Point();
	}

	public int getX() {
		return this.position.x;
	}

	public void setX(int x) {
		if ((x >= 0) && (x < this.getLorannWorld().getWidth())) {
			this.position.x = x;
			this.getLorannWorld().setMobileHasChanged();
		}
	}

	public Point getPosition() {
		return this.position;
	}
	
	public int getY() {
		return this.position.y;
	}

	public void setY(int y) {
		if ((y >= 0) && (y < this.getLorannWorld().getHeight())) {
			this.position.y = y;
			this.getLorannWorld().setMobileHasChanged();
		}
	}

	public void setLorannWorld(final ILorannWorld lorannWorld, final int x, final int y) {
		super.setLorannWorld(lorannWorld);
		this.setX(x);
		this.setY(y);
	}
	protected boolean isMovePossible(int x, int y) {
		if (this.lorannWorld.getMotionlessElements(x, y) == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getSaveX() {
		return saveX;
	}

	public void setSaveX(int saveX) {
		this.saveX = saveX;
	}

	public int getSaveY() {
		return saveY;
	}

	public void setSaveY(int saveY) {
		this.saveY = saveY;
	}
	public void moveUp(){
		System.out.println("moveispossible : " +this.isMovePossible(this.getX(), this.getY()-1));

		if (this.isMovePossible(this.getX(), this.getY()-1)) {
			this.setY(this.getY() - 1);
		}
	}
	
	public void moveRight(){
		if (this.isMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
	}
	
	public void moveDown(){
		if (this.isMovePossible(this.getX(), this.getY()+1)) {
			this.setY(this.getY() + 1);
		}
	}

	public void moveLeft(){
		if (this.isMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
	}
	

	public void moveLeftDown(){

		if (this.isMovePossible(this.getX() - 1, this.getY()+1)) {
			this.setX(this.getX() - 1);
			this.setY(this.getY() + 1);
		}
	}
	public void moveLeftUp(){

		if (this.isMovePossible(this.getX() - 1, this.getY() - 1)) {
			this.setX(this.getX() - 1);
			this.setY(this.getY() - 1);
		}
	}


	public void moveRightDown(){

		if (this.isMovePossible(this.getX() + 1, this.getY()+1)) {
			this.setX(this.getX() + 1);
			this.setY(this.getY() + 1);
		}
	}

	public void moveRightUp(){

		if (this.isMovePossible(this.getX() + 1, this.getY()-1)) {
			this.setX(this.getX() + 1);
			this.setY(this.getY() - 1);
		}
	}
	
}
