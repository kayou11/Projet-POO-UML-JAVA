package elements.motion;

import contract.BehaviorElements;
import contract.ILorannWorld;
import contract.ISpell;
import elements.AnimatedSprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Spell.
 */
public class Spell extends MotionElements implements ISpell {

	/** The spell green. */
	static String spellGreen = "fireball_1.png";
	
	/** The spell blue. */
	static String spellBlue ="fireball_2.png";
	
	/** The spell purple. */
	static String spellPurple = "fireball_3.png";
	
	/** The spell red. */
	static String spellRed ="fireball_4.png";
	
	/** The spell yellow. */
	static String spellYellow = "fireball_5.png";
	
	
	/** The spell. */
	static String spell [] = {spellGreen, spellBlue, spellPurple, spellRed, spellYellow};

	
	/**
	 * Instantiates a new spell.
	 *
	 * @param lorannWorld the lorann world
	 */
	public Spell(ILorannWorld lorannWorld) {
		super("SpellGreen",new AnimatedSprite("fireball_1.png",spell),lorannWorld,new BehaviorSpell());
        this.behaviorElements = BehaviorElements.SPELL;
	}	
	
}
