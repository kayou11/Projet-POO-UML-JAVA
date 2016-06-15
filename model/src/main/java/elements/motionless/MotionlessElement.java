package elements.motionless;

import elements.Elements;
import elements.ISprite;
import elements.Permeability;

public abstract class MotionlessElement extends Elements {

	public MotionlessElement(final ISprite sprite, final Permeability permeability, final char fileSymbol) {
		super(sprite, permeability);
	}
}