package elements;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IMotionlessElement;
import contract.ISpell;
import elements.motion.Lorann;
import elements.motion.Monster1;
import elements.motion.Monster2;
import elements.motion.Monster3;
import elements.motion.Monster4;
import elements.motion.MotionElements;
import elements.motion.Spell;
import elements.motionless.BoneH;
import elements.motionless.BoneV;
import elements.motionless.Door;
import elements.motionless.EnergyBall;
import elements.motionless.Kneecap;
import elements.motionless.MotionlessElement;
import elements.motionless.Purse;
import model.LorannWorld;

// TODO: Auto-generated Javadoc
/**
 * The Class FactoryElements.
 */
public abstract class FactoryElements {
	
	/** The lorann world. */
	static ILorannWorld lorannWorld;
	
	/** The Constant BONEH. */
	public static final MotionlessElement BONEH = new BoneH();
	
	/** The Constant BONEV. */
	public static final MotionlessElement BONEV = new BoneV();
	
	/** The Constant DOORCLOSED. */
	public static final MotionlessElement DOORCLOSED = new Door();
	
	/** The Constant ENERGYBALL. */
	public static final MotionlessElement ENERGYBALL = new EnergyBall();
	
	/** The Constant KNEECAP. */
	public static final MotionlessElement KNEECAP = new Kneecap();
	
	/** The Constant PURSE. */
	public static final MotionlessElement PURSE = new Purse();
	
	/** The motionless elements. */
	public static MotionlessElement motionlessElements [] = {BONEH, BONEV, DOORCLOSED,ENERGYBALL,KNEECAP,PURSE};
	
	/** The Constant MONSTER1. */
	public static final MotionElements MONSTER1 = new Monster1(lorannWorld);
	
	/** The Constant MONSTER2. */
	public static final MotionElements MONSTER2 = new Monster2(lorannWorld);
	
	/** The Constant MONSTER3. */
	public static final MotionElements MONSTER3 = new Monster3(lorannWorld);
	
	/** The Constant MONSTER4. */
	public static final MotionElements MONSTER4 = new Monster4(lorannWorld);
	
	/** The Constant SPELL. */
	public static final MotionElements SPELL = new Spell(lorannWorld);

	/** The motion elements. */
	public static MotionElements motionElements [] = {MONSTER1, MONSTER2, MONSTER3,MONSTER4};

	/**
	 * Gets the from name.
	 *
	 * @param name the name
	 * @return the from name
	 */
	public static IMotionlessElement getFromName(final String name) {
		for (MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getName().equals(name)) {
				return motionlessElement;
			}
		}
		
		return null;
	}
	
	/**
	 * Gets the from name lorann.
	 *
	 * @param name the name
	 * @param lorannWorld the lorann world
	 * @return the from name lorann
	 */
	public static ILorann getfromNameLorann(final String name,LorannWorld lorannWorld)
	{
		ILorann lorann = new Lorann(lorannWorld,null);
		if(lorann.getName().equals(name)) {
			return lorann;
		}
		return null;
	}
	
	/**
	 * Gets the from name spell.
	 *
	 * @param name the name
	 * @param lorannWorld the lorann world
	 * @return the from name spell
	 */
	public static ISpell getfromNameSpell(final String name,LorannWorld lorannWorld)
	{
		ISpell spell = new Spell(lorannWorld);
		if(spell.getName().equals(name)) {
			return spell;
		}
		return null;
	}
	
	
	/**
	 * Gets the from name motion.
	 *
	 * @param name the name
	 * @return the from name motion
	 */
	public static IMotionElement getFromNameMotion(final String name) {
		for (MotionElements motionElement : motionElements) {
			if (motionElement.getName().equals(name)) {
				return motionElement;
			}
		}
		return null;
	}
}
