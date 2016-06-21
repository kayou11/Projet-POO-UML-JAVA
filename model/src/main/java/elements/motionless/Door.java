package elements.motionless;

import elements.Sprite;


import contract.BehaviorElements;
import contract.IDoor;
import contract.ISprite;
import contract.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class Door.
 */
public class Door extends MotionlessElement implements IDoor{
    
    /** The unlocked. */
    protected boolean unlocked;
    
    /** The unlocked sprite. */
    protected ISprite unlockedSprite;
	

	/**
	 * Instantiates a new door.
	 */
	public Door(){
		super("ClosedDoor", new Sprite("gate_closed.png"), Permeability.BLOCKING);
		this.behaviorElements = BehaviorElements.DEATH;
		this.unlocked = false;
		this.unlockedSprite = new Sprite("gate_open.png");
	}

	
	/* (non-Javadoc)
	 * @see elements.Elements#getSprite()
	 */
	@Override
	public ISprite getSprite(){
		 if(this.unlocked) {
	            return this.unlockedSprite;
	        } else {
	            return super.getSprite();
	        }
	}
	
    
	/* (non-Javadoc)
	 * @see contract.IDoor#isUnlocked()
	 */
	public boolean isUnlocked() {
		return unlocked;
	}

	/* (non-Javadoc)
	 * @see contract.IDoor#setUnlocked(boolean)
	 */
	public void setUnlocked(boolean unlocked) {
		this.unlocked = unlocked;
	}
	
    /* (non-Javadoc)
     * @see elements.Elements#getBehaviorElements()
     */
    @Override
    public BehaviorElements getBehaviorElements() {
        if(this.unlocked)
            this.behaviorElements = BehaviorElements.END;
        else
            this.behaviorElements = BehaviorElements.DEATH;
        return this.behaviorElements;
    }
}
