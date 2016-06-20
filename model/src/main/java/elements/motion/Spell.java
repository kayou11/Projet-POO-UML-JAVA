package elements.motion;

import contract.BehaviorAnimate;
import contract.Direction;
import contract.ILorann;
import contract.ILorannWorld;
import contract.ISpell;
import elements.FactoryElements;
import elements.Sprite;

public class Spell extends MotionElements implements ISpell {

	static Sprite spellGreen = new Sprite("fireball_1.png");
	static Sprite spellBlue = new Sprite("fireball_2.png");
	static Sprite spellPurple = new Sprite("fireball_3.png");
	static Sprite spellRed = new Sprite("fireball_4.png");
	static Sprite spellYellow = new Sprite("fireball_5.png");
	
	
	static Sprite spell [] = {spellGreen, spellBlue, spellPurple, spellRed, spellYellow};

	
	public Spell(ILorannWorld lorannWorld,BehaviorAnimate behaviorAnimate) {
		super("SpellBlue",new Sprite("fireball_1.png"),lorannWorld,behaviorAnimate);
	}	
	
	public void moveTo(int x,int y){
		
			this.getPosition().setLocation(x, y);
	}
	public void spellAttract(int spellX, int spellY, ILorann lorann) {
		
		int lorannX = lorann.getX();
		int lorannY = lorann.getY();
		int diffX = spellX - lorann.getX();
		int diffY = spellY - lorann.getY();
		
		if(spellX == lorannX && spellY > lorannY) {
			moveUp();
		}
		if(spellX == lorannX && spellY < lorannY) {
			moveDown();
		}
		if(spellX > lorannX && spellY == lorannY) {
			moveLeft();
		}
		if(spellX < lorannX && spellY == lorannY) {
			moveRight();
		}
		if(spellX < lorannX && spellY < lorannY) {
			if( Math.abs(diffX) < Math.abs(diffY) ) {
				moveDown();
			}
			if( Math.abs(diffX) == Math.abs(diffY) ) {
				moveRightDown();
			}
			if( Math.abs(diffX) > Math.abs(diffY) ) {
				moveRight();
			}
		}
		if(spellX > lorannX && spellY < lorannY) {
			if( Math.abs(diffX) < Math.abs(diffY) ) {
				moveDown();
			}
			if( Math.abs(diffX) == Math.abs(diffY) ) {
				moveLeftDown();
			}
			if( Math.abs(diffX) > Math.abs(diffY) ) {
				moveLeft();
			}
		}
		if(spellX < lorannX && spellY > lorannY) {
			if( Math.abs(diffX) < Math.abs(diffY) ) {
				moveUp();
			}
			if( Math.abs(diffX) == Math.abs(diffY) ) {
				moveRightUp();
			}
			if( Math.abs(diffX) > Math.abs(diffY) ) {
				moveRight();
			}
		}
		if(spellX > lorannX && spellY > lorannY) {
			if( Math.abs(diffX) < Math.abs(diffY) ) {
				moveUp();
			}
			if( Math.abs(diffX) == Math.abs(diffY) ) {
				moveLeftUp();
			}
			if( Math.abs(diffX) > Math.abs(diffY) ) {
				moveLeft();
			}
		}
	}

}
