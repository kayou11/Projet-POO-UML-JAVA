package elements.motionless;

import contract.ISprite;
import contract.ITem;
import contract.Permeability;
import elements.Elements;

// TODO: Auto-generated Javadoc
/**
 * The Class Item.
 */
public class Item extends Elements implements ITem {
    
    /**
     * location and image Item.
     *
     * @param name the name
     * @param sprite the sprite
     * @param permeability the permeability
     */
    public Item(String name, ISprite sprite, Permeability permeability) {
        super(name,sprite, permeability);
    }
}