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

	protected int x;
	protected int y;
	private Direction direction;
	private ILorannWorld lorannWorld;
	protected int saveX;
	protected int saveY;
	
	public MotionElements(String name, Sprite sprite,ILorannWorld lorannWorld) {
		super(name, sprite, Permeability.BLOCKING);
		this.lorannWorld = lorannWorld;
		this.direction = Direction.NONE;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setNettleWorld(final ILorannWorld lorannWorld, final int x, final int y) {
		super.setLorannWorld(lorannWorld);
		this.setX(x);
		this.setY(y);
	}
	protected boolean isMovePossible(int x, int y) {
		//System.out.println(getLorannWorld().getMotionlessElements(getX(), getY()));
		return this.getLorannWorld().getMotionlessElements(x, y).getPermeability() != Permeability.BLOCKING;

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
	
	public boolean moveDown(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y++;
		return this.isMovePossible(this.x, this.y);
	}

	public boolean moveLeft(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.x--;
		return this.isMovePossible(this.x, this.y);
	}

	public boolean moveLeftDown(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y++;
		this.x--;
		return this.isMovePossible(this.x, this.y);
	}
	public boolean moveLeftUp(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y--;
		this.x--;
		return this.isMovePossible(this.x, this.y);
	}

	public boolean moveRight(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.x++;
		return this.isMovePossible(this.x, this.y);
	}

	public boolean moveRightDown(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y++;
		this.x++;
		return this.isMovePossible(this.x, this.y);
	}

	public boolean moveRightUp(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y--;
		this.x++;
		return this.isMovePossible(this.x, this.y);
	}

	public boolean moveUp(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y--;
		return this.isMovePossible(this.x, this.y);
	}
	
}
