package elements;

import contract.Direction;
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
import elements.motionless.DeathFace;
import elements.motionless.Door;
import elements.motionless.EnergyBall;
import elements.motionless.Kneecap;
import elements.motionless.MotionlessElement;
import elements.motionless.Purse;
import model.LorannWorld;

public abstract class FactoryElements {
	static ILorannWorld lorannWorld;
	
	public static final MotionlessElement BONEH = new BoneH();
	public static final MotionlessElement BONEV = new BoneV();
	public static final MotionlessElement DEATHFACE = new DeathFace();
	public static final MotionlessElement DOOR = new Door();
	public static final MotionlessElement ENERGYBALL = new EnergyBall();
	public static final MotionlessElement KNEECAP = new Kneecap();
	public static final MotionlessElement PURSE = new Purse();
	
	public static MotionlessElement motionlessElements [] = {BONEH, BONEV, DEATHFACE,DOOR,ENERGYBALL,KNEECAP,PURSE};
	
	public static final MotionElements MONSTER1 = new Monster1(lorannWorld);
	public static final MotionElements MONSTER2 = new Monster2(lorannWorld);
	public static final MotionElements MONSTER3 = new Monster3(lorannWorld);
	public static final MotionElements MONSTER4 = new Monster4(lorannWorld);

	public static MotionElements motionElements [] = {MONSTER1, MONSTER2, MONSTER3,MONSTER4};

	public static IMotionlessElement getFromName(final String name) {
		for (MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getName().equals(name)) {
				return motionlessElement;
			}
		}
		
		return null;
	}
	
	public static ILorann getfromNameLorann(final String name,LorannWorld lorannWorld)
	{
		ILorann lorann = new Lorann(lorannWorld,null);
		if(lorann.getName().equals(name)) {
			return lorann;
		}
		return null;
	}
	
	public static ISpell getfromNameSpell(final String name,ILorannWorld lorannWorld)
	{
		ISpell spell = new Spell(lorannWorld,null);
		if(spell.getName().equals(name)) {
			return spell;
		}
		return null;
	}
	
	
	public static IMotionElement getFromNameMotion(final String name) {
		for (MotionElements motionElement : motionElements) {
			if (motionElement.getName().equals(name)) {
				return motionElement;
			}
		}
		return null;
	}
}
