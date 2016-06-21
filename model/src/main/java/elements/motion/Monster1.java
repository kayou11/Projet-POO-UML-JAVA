package elements.motion;


import contract.BehaviorElements;
import contract.ILorannWorld;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster1.
 */
public class Monster1 extends Monster {
	
	 /** The number of points won by the player when he kills this monster */
    private int value;
    
	/**
	 * Instantiates a new monster 1.
	 *
	 * @param lorannWorld the lorann world
	 */
	public Monster1(ILorannWorld lorannWorld) {
		super("Monster1",new Sprite("monster_1.png"), lorannWorld, new Normal());
		this.behaviorElements = BehaviorElements.DEATH;
		this.value = 200;
	}
	
    public int getValue(){
        return this.value;
    }

}