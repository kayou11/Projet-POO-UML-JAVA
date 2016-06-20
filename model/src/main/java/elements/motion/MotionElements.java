package elements.motion;

import java.awt.Point;
import java.util.logging.Level;

import contract.BehaviorAnimate;
import contract.Direction;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.Permeability;
import elements.Elements;
import elements.Sprite;

public class MotionElements extends Elements implements IMotionElement{

	protected Point position;
	private Direction direction;
	protected ILorannWorld lorannWorld;
	protected int saveX;
	protected int saveY;
	public BehaviorAnimate behaviorAnimate;
	private Point lastPosition;
	
	public MotionElements(String name, Sprite sprite,ILorannWorld lorannWorld,BehaviorAnimate behaviorGetAnimate)  {
		super(name, sprite, Permeability.BLOCKING);
		this.lorannWorld = lorannWorld;
		this.direction = Direction.NONE;
		this.position = new Point();
		this.lastPosition = new Point();
		this.behaviorAnimate= behaviorGetAnimate;

	}

	public BehaviorAnimate getBehaviorGetAnimate() {
		return behaviorAnimate;
	}


	public void setBehaviorGetAnimate(BehaviorAnimate behaviorAnimate) {
		this.behaviorAnimate = behaviorAnimate;
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
	public boolean isMovePossible(int x, int y) {
		if (getLorannWorld().getMotionlessElements(x,y) == null)
		{
			return true;
		}
		else
		{
			this.setX((int) lastPosition.getX());
			this.setY((int) lastPosition.getY());
			return false;
		}
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void saveLastPosition() {
		if ((this.lastPosition.getX() != this.getPosition().getX()) || (this.lastPosition.getY() != this.getPosition().getY())) {
			this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
		}
	}
    /**
     * Move the entity to a specified position
     * @param x
     * The new X position
     * @param y
     * The new Y position
     */
    public void moveTo(int x, int y){
        this.getPosition().setLocation(x+1,y+1);
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
