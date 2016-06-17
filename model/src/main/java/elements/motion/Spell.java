package elements.motion;

import elements.Position;
import elements.Sprite;

public class Spell extends MotionElements{

	static Sprite spellGreen = new Sprite(9);
	static Sprite spellBlue = new Sprite(10);
	static Sprite spellPurple = new Sprite(11);
	static Sprite spellRed = new Sprite(12);
	static Sprite spellYellow = new Sprite(13);
	
	
	static Sprite spell [] = {spellGreen, spellBlue, spellPurple, spellRed, spellYellow};

	
	public Spell() {
		super("SpellBlue",new Sprite("fireball_1"));
	}
	
	public static Sprite changeSprite(){
		
		for(int i = 0 ; i < spell.length ; i++){
			return spell[i];
		}
		return null;
		

	

}
