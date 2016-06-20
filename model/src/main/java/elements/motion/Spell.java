package elements.motion;

import contract.ILorannWorld;
import contract.ISpell;
import elements.AnimatedSprite;

public class Spell extends MotionElements implements ISpell {

	static String spellGreen = "fireball_1.png";
	static String spellBlue ="fireball_2.png";
	static String spellPurple = "fireball_3.png";
	static String spellRed ="fireball_4.png";
	static String spellYellow = "fireball_5.png";
	
	
	static String spell [] = {spellGreen, spellBlue, spellPurple, spellRed, spellYellow};

	
	public Spell(ILorannWorld lorannWorld) {
		super("SpellGreen",new AnimatedSprite("fireball_1.png",spell),lorannWorld,new BehaviorSpell());
	}	
	
}
