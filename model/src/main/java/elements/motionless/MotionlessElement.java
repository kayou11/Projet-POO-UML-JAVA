package elements.motionless;

import elements.Elements;
import elements.Sprite;
import elements.Permeability;
import elements.Position;

public abstract class MotionlessElement extends Elements {

	public MotionlessElement(final Position position,final String pathElement, final Permeability permeability) {
		super(position, pathElement, permeability);
	}
} 