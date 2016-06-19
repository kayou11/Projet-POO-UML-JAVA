package elements.motion;

import contract.ILorannWorld;
import contract.ISpell;
import elements.Sprite;

public class Spell extends MotionElements implements ISpell{

	static Sprite spellGreen = new Sprite("fireball_1.png");
	static Sprite spellBlue = new Sprite("fireball_2.png");
	static Sprite spellPurple = new Sprite("fireball_3.png");
	static Sprite spellRed = new Sprite("fireball_4.png");
	static Sprite spellYellow = new Sprite("fireball_5.png");
	
	
	static Sprite spell [] = {spellGreen, spellBlue, spellPurple, spellRed, spellYellow};

	
	public Spell(ILorannWorld lorannWorld) {
		super("SpellBlue",new Sprite("fireball_1"),lorannWorld);
	}
	
	public static Sprite changeSprite(){
		
		for(int i = 0 ; i < spell.length ; i++){
			return spell[i];
		}
		return null;
	}

	public void animate() {
		// TODO Auto-generated method stub
		
	}

}
