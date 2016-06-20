package elements.motion;


import contract.BehaviorAnimate;
import contract.ControllerOrder;
import contract.ILorann;
import elements.AnimatedSprite;
import model.LorannWorld;

public class Lorann extends MotionElements implements ILorann{

	/*static Sprite lorannUp = new Sprite("lorann_u.png");
	static Sprite lorannDown = new Sprite("lorann_b.png");
	static Sprite lorannRight= new Sprite("lorann_r.png");
	static Sprite lorannLeft = new Sprite("lorann_l.png");
	static Sprite lorannUpRight = new Sprite("lorann_ur.png");
	static Sprite lorannUpLeft = new Sprite("lorann_ul.png");
	static Sprite lorannDownRight = new Sprite("lorann_br.png");
	static Sprite lorannDownLeft = new Sprite("lorann_bl.png");*/
	

	static String lorannUp ="lorann_u.png";
	static String lorannDown = "lorann_b.png";
	static String lorannRight= "lorann_r.png";
	static String lorannLeft = "lorann_l.png";
	static String lorannUpRight = "lorann_ur.png";
	static String lorannUpLeft = "lorann_ul.png";
	static String lorannDownRight = "lorann_br.png";
	static String lorannDownLeft = "lorann_bl.png";
	
	private ControllerOrder direction = ControllerOrder.STAY;
    /** The score of the player */
	private Integer score = 0;
	public boolean alive;
	
	static String sprite[] = {lorannRight, lorannDownRight, lorannDown, lorannDownLeft, lorannLeft, lorannUpLeft,
			lorannUp, lorannUpRight };
	
	public Lorann(LorannWorld lorannWorld,BehaviorAnimate behaviorAnimate) {
		super("LorannRight",new AnimatedSprite("lorann_u.png", sprite), lorannWorld,behaviorAnimate);
        this.alive = true;
	}

	public ControllerOrder getOrder() {
		return this.direction;
	}

	public void setDirection(ControllerOrder direction) {
		this.direction = direction;
	}


	public boolean animate() {
		this.saveLastPosition();
        if(!isAlive())
            return false;
        switch (direction){
            case UP:
                moveUp();
                System.out.println(direction);
                this.direction = ControllerOrder.STAY;
                break;
            case DOWN:
                moveDown();
                this.direction = ControllerOrder.STAY;
                break;
            case LEFT:
                moveLeft();
                this.direction = ControllerOrder.STAY;

                break;
            case RIGHT:
                moveRight();
                this.direction = ControllerOrder.STAY;

                break;
            case UPLEFT:
                moveLeftUp();
               this.direction = ControllerOrder.STAY;

                break;
            case UPRIGHT:
                moveRightUp();
                this.direction = ControllerOrder.STAY;

                break;
            case DOWNRIGHT:
                moveRightDown();
                this.direction = ControllerOrder.STAY;

                break;
            case DOWNLEFT:
                moveLeftDown();
                
                this.direction = ControllerOrder.STAY;
                break;
            default:
                this.direction = ControllerOrder.STAY;
                break;
        }
        setDirection(direction);
		return false;
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

    /**
     * Get the score of hero
     * @return
     * The score
     */

    public Integer getScore() {
        return score;
    }
    /**
     * Set The score of hero
     * @param score
     * The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }


    
}
