package elements;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMotionlessElement;
import elements.motion.Lorann;
import elements.motion.MotionElements;
import elements.motionless.BoneH;
import elements.motionless.BoneV;
import elements.motionless.DeathFace;
import elements.motionless.Door;
import elements.motionless.EnergyBall;
import elements.motionless.Kneecap;
import elements.motionless.MotionlessElement;
import elements.motionless.Purse;

public abstract class FactoryElements {
	public static final MotionlessElement BONEH = new BoneH();
	public static final MotionlessElement BONEV = new BoneV();
	public static final MotionlessElement DEATHFACE = new DeathFace();
	public static final MotionlessElement DOOR = new Door();
	public static final MotionlessElement ENERGYBALL = new EnergyBall();
	public static final MotionlessElement KNEECAP = new Kneecap();
	public static final MotionlessElement PURSE = new Purse();
	
	public static MotionlessElement motionlessElements [] = {BONEH, BONEV, DEATHFACE,DOOR,ENERGYBALL,KNEECAP,PURSE};
	public static ILorann lorann;
	
	
	public static IMotionlessElement getFromName(final String name) {
		for (MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getName().equals(name)) {
				return motionlessElement;
			}
		}
		
		return null;
	}
	
	public static ILorann getfromNameLorann(final String name)
	{
		System.out.println(lorann.getName());
		if(lorann.getName().equals(name)) {
			return new Lorann();
		}
		return null;
	}

}
