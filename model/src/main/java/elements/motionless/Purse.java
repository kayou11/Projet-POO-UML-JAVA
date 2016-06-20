package elements.motionless;

import contract.BehaviorElements;
import contract.IValuable;
import contract.Permeability;
import elements.Sprite;

public class Purse extends MotionlessElement implements IValuable{
	
	public Purse(){
		
		super("Purse", new Sprite("purse.png"), Permeability.PENETRABLE);
        this.behaviorElements = BehaviorElements.MOREPOINT;
	}
	
    public int getValue() {
        return 100;
    }
}
