package elements.motion;


import contract.ILorannWorld;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster2.
 */
public class Monster2 extends Monster{

	/**
	 * Instantiates a new monster 2.
	 *
	 * @param lorannWorld the lorann world
	 */
	public Monster2(ILorannWorld lorannWorld) {
		super("Monster2",new Sprite("monster_2.png"),lorannWorld,new Smart());
	}	
}
