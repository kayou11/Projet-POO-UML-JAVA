package elements.motionless;

import contract.BehaviorElements;
import contract.IValuable;
import contract.Permeability;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Purse.
 */
public class Purse extends MotionlessElement implements IValuable{
	
	/**
	 * Instantiates a new purse.
	 */
	public Purse(){
		
		super("Purse", new Sprite("purse.png"), Permeability.PENETRABLE);
        this.behaviorElements = BehaviorElements.MOREPOINT;
	}
	
    /* (non-Javadoc)
     * @see contract.IValuable#getValue()
     */
    public int getValue() {
        return 100;
    }
}
