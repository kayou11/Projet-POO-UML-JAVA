package elements;

import contract.Direction;
import contract.IOtherElements;
import contract.ISprite;
import contract.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class OtherElements.
 */
public abstract class OtherElements extends Elements implements IOtherElements {


    /** Direction of the entity. */
    protected Direction direction;

    /**
     * Localisation and image entity.
     *
     * @param name the name
     * @param sprite the sprite
     */

    public OtherElements(String name,ISprite sprite) {
        super(name,sprite, Permeability.BLOCKING);
        this.direction = Direction.UP;
    }

    /**
     * Get the direction of the Entity.
     *
     * @return The direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Set a new direction to the Entity.
     *
     * @param direction The new direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }


}