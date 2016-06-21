package elements;

import contract.ILocation;

// TODO: Auto-generated Javadoc
/**
 * A class representing the location of an element.
 */
public class Location implements ILocation {
    
    /**  The X position. */
    private int x;
    
    /**  The Y position. */
    private int y;

    /**
     * Instantiate the class.
     *
     * @param x the X position
     * @param y The Y position
     */
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETTER & SETTER //

    /**
     * Get The Y position.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Set a new Y position.
     *
     * @param y The new Y position
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Get the X position.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Set a new X position.
     *
     * @param x The new X position
     */
    public void setX(int x) {
        this.x = x;
    }
}
