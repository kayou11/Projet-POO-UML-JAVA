package elements.motionless;

import contract.BehaviorElements;
import contract.Permeability;
import elements.Position;
import elements.Sprite;

public class Door extends MotionlessElement {
	
    protected boolean unlocked;
    


	public Door(){
		
		super("OpenedDoor", new Sprite("gate_open.png"), Permeability.BLOCKING);
		this.behaviorElements = BehaviorElements.DEATH;
	}
	
	public boolean isUnlocked() {
		return unlocked;
	}

	public void setUnlocked(boolean unlocked) {
		this.unlocked = unlocked;
	}
	
    @Override
    public BehaviorElements getBehaviorElements() {
        if(this.unlocked)
            this.behaviorElements = BehaviorElements.END;
        else
            this.behaviorElements = BehaviorElements.DEATH;
        return this.behaviorElements;
    }
}