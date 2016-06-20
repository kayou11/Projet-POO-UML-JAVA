package elements.motionless;

import contract.ISprite;
import contract.ITem;
import contract.Permeability;
import elements.Elements;

public class Item extends Elements implements ITem {
    /**
     * location and image Item
     * @param x
     * @param y
     * @param image
     */
    public Item(String name, ISprite sprite, Permeability permeability) {
        super(name,sprite, permeability);
    }
}