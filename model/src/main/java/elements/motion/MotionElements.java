package elements.motion;

import java.awt.Point;
import contract.BehaviorAnimate;
import contract.Direction;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.Permeability;
import elements.Elements;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionElements.
 */
public class MotionElements extends Elements implements IMotionElement{

	/** The position. */
	protected Point position;
	
	/** The direction. */
	private Direction direction;
	
	/** The lorann world. */
	protected ILorannWorld lorannWorld;
	
	/** The behavior animate. */
	private BehaviorAnimate behaviorAnimate;
	
	/** The last position. */
	private Point lastPosition;
	
	/**
	 * Instantiates a new motion elements.
	 *
	 * @param name the name
	 * @param sprite the sprite
	 * @param lorannWorld the lorann world
	 * @param behaviorGetAnimate the behavior get animate
	 */
	public MotionElements(String name, Sprite sprite,ILorannWorld lorannWorld,BehaviorAnimate behaviorGetAnimate)  {
		super(name, sprite, Permeability.BLOCKING);
		this.lorannWorld = lorannWorld;
		this.direction = Direction.NONE;
		this.position = new Point();
		this.lastPosition = new Point();
		this.behaviorAnimate= behaviorGetAnimate;

	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#getBehaviorGetAnimate()
	 */
	public BehaviorAnimate getBehaviorGetAnimate() {
		return behaviorAnimate;
	}


	/**
	 * Sets the behavior get animate.
	 *
	 * @param behaviorAnimate the new behavior get animate
	 */
	public void setBehaviorGetAnimate(BehaviorAnimate behaviorAnimate) {
		this.behaviorAnimate = behaviorAnimate;
	}
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#getX()
	 */
	public int getX() {
		return this.position.x;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#setX(int)
	 */
	public void setX(int x) {
		if ((x >= 0) && (x < 22)) {
			this.position.x = x;
			this.getLorannWorld().setMobileHasChanged();
		}
	}

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public Point getPosition() {
		return this.position;
	}
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#getY()
	 */
	public int getY() {
		return this.position.y;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#setY(int)
	 */
	public void setY(int y) {
		if ((y >= 0) && (y < 16)) {
			this.position.y = y;
			this.getLorannWorld().setMobileHasChanged();
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#setLorannWorld(contract.ILorannWorld, int, int)
	 */
	public void setLorannWorld(final ILorannWorld lorannWorld, final int x, final int y) {
		super.setLorannWorld(lorannWorld);
		this.setX(x);
		this.setY(y);
	}
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#isMovePossible(int, int)
	 */
	public boolean isMovePossible(int x, int y) {
		if(getLorannWorld().getMotionlessElements(x,y) != null){
			if (getLorannWorld().getMotionlessElements(x,y).getPermeability() == Permeability.PENETRABLE)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * Sets the direction.
	 *
	 * @param direction the new direction
	 */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#saveLastPosition()
	 */
	public void saveLastPosition() {
		if ((this.lastPosition.getX() != this.getPosition().getX()) || (this.lastPosition.getY() != this.getPosition().getY())) {
			this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
		}
	}
    
    /**
     * Move the entity to a specified position.
     *
     * @param x The new X position
     * @param y The new Y position
     */
    public void moveTo(int x, int y){
        this.getPosition().setLocation(x+1,y+1);
    }
    
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveUp()
	 */
	public void moveUp(){

		if (this.isMovePossible(this.getX(), this.getY()-1)) {
			this.setY(this.getY() - 1);
		}
	}
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveRight()
	 */
	public void moveRight(){
		if (this.isMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
	}
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveDown()
	 */
	public void moveDown(){
		if (this.isMovePossible(this.getX(), this.getY()+1)) {
			this.setY(this.getY() + 1);
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveLeft()
	 */
	public void moveLeft(){
		if (this.isMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
	}
	

	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveLeftDown()
	 */
	public void moveLeftDown(){

		if (this.isMovePossible(this.getX() - 1, this.getY()+1)) {
			this.setX(this.getX() - 1);
			this.setY(this.getY() + 1);
		}
	}
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveLeftUp()
	 */
	public void moveLeftUp(){

		if (this.isMovePossible(this.getX() - 1, this.getY() - 1)) {
			this.setX(this.getX() - 1);
			this.setY(this.getY() - 1);
		}
	}


	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveRightDown()
	 */
	public void moveRightDown(){

		if (this.isMovePossible(this.getX() + 1, this.getY()+1)) {
			this.setX(this.getX() + 1);
			this.setY(this.getY() + 1);
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#moveRightUp()
	 */
	public void moveRightUp(){

		if (this.isMovePossible(this.getX() + 1, this.getY()-1)) {
			this.setX(this.getX() + 1);
			this.setY(this.getY() - 1);
		}
	}
	
}
