package elements.motion;

import java.awt.event.KeyEvent;

import contract.Direction;
import contract.ILorann;
import contract.IMotionElement;
import elements.AnimatedSprite;
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
	
	static Sprite sprite[] = {lorannRight, lorannDownRight, lorannDown, lorannDownLeft, lorannLeft, lorannUpLeft,
			lorannUp, lorannUpRight };
	
	public Lorann(LorannWorld lorannWorld) {
		super("LorannRight",lorannRight, lorannWorld);
        this.setSpell(true);
        this.alive = true;
	}

	/*public Lorann(LorannWorld lorannWorld) {
	super("LorannRight", new AnimatedSprite("lorann_r.png", sprite));
	this.setLorannWorld(lorannWorld);
	}*/
	
	public void setWin(boolean win) { 
		this.win = win;
	}

	public boolean getWin() {
		return this.win;
		
	}

	public boolean animate(Direction direction) {
        if(isAlive())
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
		
}
