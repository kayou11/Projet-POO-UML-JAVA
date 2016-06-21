package elements.motion;


import contract.ILorannWorld;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster4.
 */
public class Monster4 extends Monster{

	/**
	 * Instantiates a new monster 4.
	 *
	 * @param lorannWorld the lorann world
	 */
	public Monster4(ILorannWorld lorannWorld) {
		super("Monster4",new Sprite("monster_4.png"),lorannWorld,new Stupid());
	}
	

}
