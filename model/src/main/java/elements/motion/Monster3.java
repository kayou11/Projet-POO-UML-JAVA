package elements.motion;


import contract.ILorannWorld;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster3.
 */
public class Monster3 extends Monster{

	/**
	 * Instantiates a new monster 3.
	 *
	 * @param lorannWorld the lorann world
	 */
	public Monster3(ILorannWorld lorannWorld) {
		super("Monster3",new Sprite("monster_3.png"),lorannWorld,new Aggressive());
	}

	

}
