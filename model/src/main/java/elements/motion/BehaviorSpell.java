package elements.motion;

import contract.BehaviorAnimate;
import contract.ControllerOrder;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class BehaviorSpell.
 */
public class BehaviorSpell implements BehaviorAnimate{

	/** The order. */
	private ControllerOrder order;
	
	/* (non-Javadoc)
	 * @see contract.BehaviorAnimate#animate(contract.IMotionElement, contract.ILorannWorld)
	 */
	public void animate(IMotionElement motionElement, ILorannWorld lorannWorld) {
    	
		int heroX = lorannWorld.getLorann().getX();
		int heroY = lorannWorld.getLorann().getY();
		int spellX = heroX;
		int spellY = heroY;
		int diffX = spellX - heroX;
		int diffY = spellY - heroY;
		order = lorannWorld.getLorann().getOrder();
	
		if (!lorannWorld.isSpellLaunched()) {
			motionElement.setX(heroX);
			motionElement.setY(heroY);

		} else if (lorannWorld.isSpellLaunched() && lorannWorld.isAttractSpell()) {

			attractSpell(motionElement, lorannWorld, heroX, heroY, spellX, spellY, diffX, diffY);
			//spellAttract(motionElement, spellX, spellY, heroX, heroY,diffX,diffY);
		} else {
			
			motionElement.moveDown();
		}
		
		if ((spellX == heroX) && (spellY == heroX)) {
			lorannWorld.setSpellLaunched(false);
			System.out.println("launched3 : " +lorannWorld.isSpellLaunched());
		}		
	}
	
	/**
	 * Attract spell.
	 *
	 * @param motion the motion
	 * @param lorannWorld the lorann world
	 * @param heroX the hero X
	 * @param heroY the hero Y
	 * @param spellX the spell X
	 * @param spellY the spell Y
	 * @param diffX the diff X
	 * @param diffY the diff Y
	 */
	public void attractSpell(final IMotionElement motion, final ILorannWorld lorannWorld, final int heroX, final int heroY,final int spellX, final int spellY, final int diffX, final int diffY) {
		if ((spellX == heroX) && (spellY > heroY)) {
			motion.moveUp();
		}
		if ((spellX == heroX) && (spellY < heroY)) {
			motion.moveDown();
		}
		if ((spellX > heroX) && (spellY == heroY)) {
			motion.moveLeft();
		}
		if ((spellX < heroX) && (spellY == heroY)) {
			motion.moveRight();
		}
		if ((spellX < heroX) && (spellY < heroY)) {
			if (Math.abs(diffX) < Math.abs(diffY)) {
				motion.moveDown();
			}
			if (Math.abs(diffX) == Math.abs(diffY)) {
				motion.moveRightDown();
			}
			if (Math.abs(diffX) > Math.abs(diffY)) {
				motion.moveRight();
			}
		}
		if ((spellX > heroX) && (spellY < heroY)) {
			if (Math.abs(diffX) < Math.abs(diffY)) {
				motion.moveDown();
			}
			if (Math.abs(diffX) == Math.abs(diffY)) {
				motion.moveLeftDown();
			}
			if (Math.abs(diffX) > Math.abs(diffY)) {
				motion.moveLeft();
			}
		}
		if ((spellX < heroX) && (spellY > heroY)) {
			if (Math.abs(diffX) < Math.abs(diffY)) {
				motion.moveUp();
			}
			if (Math.abs(diffX) == Math.abs(diffY)) {
				motion.moveRightUp();
			}
			if (Math.abs(diffX) > Math.abs(diffY)) {
				motion.moveRight();
			}
		}
		if ((spellX > heroX) && (spellY > heroY)) {
			if (Math.abs(diffX) < Math.abs(diffY)) {
				motion.moveUp();
			}
			if (Math.abs(diffX) == Math.abs(diffY)) {
				motion.moveLeftUp();
			}
			if (Math.abs(diffX) > Math.abs(diffY)) {
				motion.moveLeft();
			}
		}

		lorannWorld.setAttractSpell(false);
	}
			
}
