package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOtherElements.
 */
public interface IOtherElements extends IElement{
    
    /**
     * Gets the location.
     *
     * @return the location
     */
    ILocation getLocation();
   
    
    /**
     * Move to.
     *
     * @param x the x
     * @param y the y
     */
    void moveTo(int x, int y);
}
