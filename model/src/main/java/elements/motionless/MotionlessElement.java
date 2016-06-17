package elements.motionless;

import contract.IMotionlessElement;
import contract.Permeability;
import elements.Elements;
import elements.Sprite;
import elements.Position;

public abstract class MotionlessElement extends Elements implements IMotionlessElement{

	public MotionlessElement(String name,final Sprite sprite, final Permeability permeability) {
		super(name, sprite, permeability);
	}
} 