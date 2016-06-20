package elements.motionless;

import contract.IMotionlessElement;
import contract.ISprite;
import contract.Permeability;
import elements.Elements;

public class MotionlessElement extends Elements implements IMotionlessElement{

	public MotionlessElement(String name,final ISprite sprite, final Permeability permeability) {
		super(name, sprite, permeability);
	}
} 