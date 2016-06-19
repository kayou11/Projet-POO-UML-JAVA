package elements.motion;

import java.awt.Point;

import contract.Direction;
import contract.ILorann;
import elements.Sprite;
import model.LorannWorld;

public class Lorann extends MotionElements implements ILorann{

	static Sprite lorannUp = new Sprite("lorann_u.png");
	static Sprite lorannDown = new Sprite("lorann_b.png");
	static Sprite lorannRight= new Sprite("lorann_r.png");
	static Sprite lorannLeft = new Sprite("lorann_l.png");
	static Sprite lorannUpRight = new Sprite("lorann_ur.png");
	static Sprite lorannUpLeft = new Sprite("lorann_ul.png");
	static Sprite lorannDownRight = new Sprite("lorann_br.png");
	static Sprite lorannDownLeft = new Sprite("lorann_bl.png");
	

	/*static String lorannUp ="lorann_u.png";
	static String lorannDown = "lorann_b.png";
	static String lorannRight= "lorann_r.png";
	static String lorannLeft = "lorann_l.png";
	static String lorannUpRight = "lorann_ur.png";
	static String lorannUpLeft = "lorann_ul.png";
	static String lorannDownRight = "lorann_br.png";
	static String lorannDownLeft = "lorann_bl.png";*/
	
	public boolean win = false;
	public boolean alive;
	private boolean spell;
	private Point lastPosition;
	
	static Sprite sprite[] = {lorannRight, lorannDownRight, lorannDown, lorannDownLeft, lorannLeft, lorannUpLeft,
			lorannUp, lorannUpRight };
	
	public Lorann(LorannWorld lorannWorld) {
		super("LorannRight",lorannRight, lorannWorld);
        this.setSpell(true);
        this.alive = true;
		this.lastPosition = new Point();
		this.lastPosition.setLocation(this.saveX, this.saveY);
	}

	/*public Lorann(LorannWorld lorannWorld) {
	super("LorannRight", new AnimatedSprite("lorann_r.png", sprite));
	this.setLorannWorld(lorannWorld);
	}*/
	private void saveLastPosition() {
		if ((this.lastPosition.getX() != this.getPosition().getX()) || (this.lastPosition.getY() != this.getPosition().getY())) {
			this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
		}
	}

	public boolean animate(Direction direction) {
		System.out.println("alive : "+isAlive());
        if(!isAlive())
            return false;
        switch (direction){
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
            case UPLEFT:
                moveLeftUp();
                break;
            case UPRIGHT:
                moveRightUp();
                break;
            case DOWNRIGHT:
                moveRightDown();
                break;
            case DOWNLEFT:
                moveLeftDown();
                break;
            default:
                System.out.println("Invalid direction move");
                break;
        }
        setDirection(direction);
		return false;
	}

	@Override
	public void moveUp() {
		this.saveLastPosition();
		super.moveUp();
	}

	@Override
	public void moveLeft() {
		this.saveLastPosition();
		super.moveLeft();
	}

	@Override
	public void moveDown() {
		this.saveLastPosition();
		super.moveDown();
	}

	@Override
	public void moveRight() {
		this.saveLastPosition();
		super.moveRight();
	}
	
	@Override
	public void moveLeftUp() {
		this.saveLastPosition();
		super.moveLeftUp();
	}

	@Override
	public void moveLeftDown() {
		this.saveLastPosition();
		super.moveLeftDown();
	}

	@Override
	public void moveRightDown() {
		this.saveLastPosition();
		super.moveRightDown();
	}

	@Override
	public void moveRightUp() {
		this.saveLastPosition();
		super.moveRightUp();
	}
	
    /**
     * Boolean if hero is alive or not
     * @return alive
     */
	public boolean isAlive() {
		return this.alive;
	}

	/**
	 * Set alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public boolean isSpell() {
		return spell;
	}

	public void setSpell(boolean spell) {
		this.spell = spell;
	}
	
	public void setWin(boolean win) { 
		this.win = win;
	}

	public boolean getWin() {
		return this.win;
		
	}
		
}
