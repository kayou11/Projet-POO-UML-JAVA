package elements.motion;


import contract.ILorannWorld;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster1.
 */
public class Monster1 extends Monster {

	/**
	 * Instantiates a new monster 1.
	 *
	 * @param lorannWorld the lorann world
	 */
	public Monster1(ILorannWorld lorannWorld) {
		super("Monster1",new Sprite("monster_1.png"), lorannWorld, new Normal());
	}
}