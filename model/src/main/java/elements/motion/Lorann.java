package elements.motion;


import contract.BehaviorAnimate;
import contract.BehaviorElements;
import contract.ControllerOrder;
import contract.ILorann;
import elements.AnimatedSprite;
import model.LorannWorld;

// TODO: Auto-generated Javadoc
/**
 * The Class Lorann.
 */
public class Lorann extends MotionElements implements ILorann{

	/*static Sprite lorannUp = new Sprite("lorann_u.png");
	static Sprite lorannDown = new Sprite("lorann_b.png");
	static Sprite lorannRight= new Sprite("lorann_r.png");
	static Sprite lorannLeft = new Sprite("lorann_l.png");
	static Sprite lorannUpRight = new Sprite("lorann_ur.png");
	static Sprite lorannUpLeft = new Sprite("lorann_ul.png");
	static Sprite lorannDownRight = new Sprite("lorann_br.png");
	static Sprite lorannDownLeft = new Sprite("lorann_bl.png");*/
	

	/** The lorann up. */
	static String lorannUp ="lorann_u.png";
	
	/** The lorann down. */
	static String lorannDown = "lorann_b.png";
	
	/** The lorann right. */
	static String lorannRight= "lorann_r.png";
	
	/** The lorann left. */
	static String lorannLeft = "lorann_l.png";
	
	/** The lorann up right. */
	static String lorannUpRight = "lorann_ur.png";
	
	/** The lorann up left. */
	static String lorannUpLeft = "lorann_ul.png";
	
	/** The lorann down right. */
	static String lorannDownRight = "lorann_br.png";
	
	/** The lorann down left. */
	static String lorannDownLeft = "lorann_bl.png";
	
	/** The direction. */
	private ControllerOrder direction = ControllerOrder.STAY;
    
    /**  The score of the player. */
	private Integer score = 0;
	
	/** The alive. */
	public boolean alive;
	
	/** The sprite. */
	static String sprite[] = {lorannRight, lorannDownRight, lorannDown, lorannDownLeft, lorannLeft, lorannUpLeft,
			lorannUp, lorannUpRight };
	
	/**
	 * Instantiates a new lorann.
	 *
	 * @param lorannWorld the lorann world
	 * @param behaviorAnimate the behavior animate
	 */
	public Lorann(LorannWorld lorannWorld,BehaviorAnimate behaviorAnimate) {
		super("LorannRight",new AnimatedSprite("lorann_u.png", sprite), lorannWorld,behaviorAnimate);
        this.alive = true;
        this.behaviorElements = BehaviorElements.LIVE;
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#getOrder()
	 */
	public ControllerOrder getOrder() {
		return this.direction;
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#setDirection(contract.ControllerOrder)
	 */
	public void setDirection(ControllerOrder direction) {
		this.direction = direction;
	}


	/* (non-Javadoc)
	 * @see contract.ILorann#animate()
	 */
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
    /* (non-Javadoc)
     * @see elements.Elements#getBehaviorElements()
     */
    @Override
    public BehaviorElements getBehaviorElements() {
        if(!this.isAlive()){
        	System.out.println("alive : "+isAlive());
            this.behaviorElements = BehaviorElements.DEATH;
        }
        else{
            this.behaviorElements = BehaviorElements.LIVE;
        }
        return this.behaviorElements;
    }
	/* (non-Javadoc)
	 * @see elements.motion.MotionElements#moveUp()
	 */
	@Override
	public void moveUp() {
		super.moveUp();
	}

	/* (non-Javadoc)
	 * @see elements.motion.MotionElements#moveLeft()
	 */
	@Override
	public void moveLeft() {
		super.moveLeft();
	}

	/* (non-Javadoc)
	 * @see elements.motion.MotionElements#moveDown()
	 */
	@Override
	public void moveDown() {
		super.moveDown();
	}

	/* (non-Javadoc)
	 * @see elements.motion.MotionElements#moveRight()
	 */
	@Override
	public void moveRight() {
		super.moveRight();
	}
	
	/* (non-Javadoc)
	 * @see elements.motion.MotionElements#moveLeftUp()
	 */
	@Override
	public void moveLeftUp() {
		super.moveLeftUp();
	}

	/* (non-Javadoc)
	 * @see elements.motion.MotionElements#moveLeftDown()
	 */
	@Override
	public void moveLeftDown() {
		super.moveLeftDown();
	}

	/* (non-Javadoc)
	 * @see elements.motion.MotionElements#moveRightDown()
	 */
	@Override
	public void moveRightDown() {
		super.moveRightDown();
	}

	/* (non-Javadoc)
	 * @see elements.motion.MotionElements#moveRightUp()
	 */
	@Override
	public void moveRightUp() {
		super.moveRightUp();
	}
	
	
    /**
     * Boolean if hero is alive or not.
     *
     * @return alive
     */
	public boolean isAlive() {
		return this.alive;
	}

	/**
	 * Set alive.
	 *
	 * @param alive the new alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

    /**
     * Get the score of hero.
     *
     * @return The score
     */

    public Integer getScore() {
        return score;
    }
    
    /**
     * Set The score of hero.
     *
     * @param score The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }


    
}
