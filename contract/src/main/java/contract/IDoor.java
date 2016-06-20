package contract;

import java.awt.Image;

// TODO: Auto-generated Javadoc
/**
 * The Interface IDoor.
 */
public interface IDoor extends IMotionlessElement {
    
    /**
     * Checks if is unlocked.
     *
     * @return true, if is unlocked
     */
    boolean isUnlocked();
    
    /**
     * Gets the image.
     *
     * @return the image
     */
    public Image getImage();
    
    /**
     * Sets the unlocked.
     *
     * @param unlocked the new unlocked
     */
    void setUnlocked(boolean unlocked);
}