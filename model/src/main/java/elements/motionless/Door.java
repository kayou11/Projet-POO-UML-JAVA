package elements.motionless;

import elements.Sprite;

import java.awt.Image;

import contract.BehaviorElements;
import contract.IDoor;
import contract.ISprite;
import contract.Permeability;

public class Door extends MotionlessElement implements IDoor{
    protected boolean unlocked;
    protected ISprite unlockedSprite;
	

	public Door(){
		super("ClosedDoor", new Sprite("gate_closed.png"), Permeability.BLOCKING);
		this.behaviorElements = BehaviorElements.DEATH;
		this.unlocked = false;
		this.unlockedSprite = new Sprite("gate_open.png");
	}

	
	@Override
	public ISprite getSprite(){
		 if(this.unlocked) {
	            return this.unlockedSprite;
	        } else {
	            return super.getSprite();
	        }
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
