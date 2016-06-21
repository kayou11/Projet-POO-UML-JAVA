package elements;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ISprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Sprite.
 */
public class Sprite implements ISprite {
	
	/** The image. */
	private Image image;
	
	/**
	 * Instantiates a new sprite.
	 *
	 * @param sprites the sprites
	 */
	public Sprite(final String sprites) {
	
		try {
			this.image = ImageIO.read(new File("sprites/" + sprites));
			
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see contract.ISprite#getImage()
	 */
	public Image getImage() {
		return this.image;
	}

}
