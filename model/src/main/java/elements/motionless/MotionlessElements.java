package elements.motionless;

import contract.IElement;

public abstract class MotionlessElements {
	public static final MotionlessElement BONEH = new BoneH();
	public static final MotionlessElement BONEV = new BoneV();
	public static final MotionlessElement DEATHFACE = new DeathFace();
	public static final MotionlessElement DOOR = new Door();
	public static final MotionlessElement ENERGYBALL = new EnergyBall();
	public static final MotionlessElement KNEECAP = new Kneecap();
	public static final MotionlessElement PURSE = new Purse();
	
	public static MotionlessElement motionlessElements [] = {BONEH, BONEV, DEATHFACE,DOOR,ENERGYBALL,KNEECAP,PURSE};
	
	public static MotionlessElement getFromName(final String name) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.toString().equals(name)) {
				return motionlessElement;
			}
		}
		return null;
	}

}
