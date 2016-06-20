package elements.motion;

import java.awt.Point;

import contract.BehaviorAnimate;
import contract.Direction;
import contract.ILorann;
import contract.ISpell;
import contract.Permeability;
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
	private ISpell spell;
	
	static Sprite sprite[] = {lorannRight, lorannDownRight, lorannDown, lorannDownLeft, lorannLeft, lorannUpLeft,
			lorannUp, lorannUpRight };
	
	public Lorann(LorannWorld lorannWorld,BehaviorAnimate behaviorAnimate) {
		super("LorannRight",lorannRight, lorannWorld,behaviorAnimate);
        this.alive = true;
		spell = new Spell(lorannWorld,null);
	}

	/*public Lorann(LorannWorld lorannWorld) {
	super("LorannRight", new AnimatedSprite("lorann_r.png", sprite));
	this.setLorannWorld(lorannWorld);
	}*/
	
	public void addSpell(int x, int y, Direction direction ) {
        if(isSpellPossible(x, y)) { 
        	this.getLorannWorld().addElements(getSpell(), x, y);
        }
	}

	
	public boolean animate(Direction direction) {
		System.out.println("alive : "+isAlive());
		this.saveLastPosition();
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
	public boolean isSpellPossible(int x, int y) {
		return super.isMovePossible(x, y);
	}
	
	@Override
	public void moveUp() {
		super.moveUp();
	}

	@Override
	public void moveLeft() {
		super.moveLeft();
	}

	@Override
	public void moveDown() {
		super.moveDown();
	}

	@Override
	public void moveRight() {
		super.moveRight();
	}
	
	@Override
	public void moveLeftUp() {
		super.moveLeftUp();
	}

	@Override
	public void moveLeftDown() {
		super.moveLeftDown();
	}

	@Override
	public void moveRightDown() {
		super.moveRightDown();
	}

	@Override
	public void moveRightUp() {
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

	
	public void setWin(boolean win) { 
		this.win = win;
	}

	public boolean getWin() {
		return this.win;
		
	}

	public ISpell getSpell() {
		return spell;
	}

	public void setSpell(ISpell spell) {
		this.spell = spell;
	}
		
}
