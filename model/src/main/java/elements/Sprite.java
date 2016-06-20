package elements;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ISprite;

public class Sprite implements ISprite {
	private Image image;
	
	public Sprite(final String sprites) {
	
		try {
			this.image = ImageIO.read(new File("sprites/" + sprites));
			
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
	
	public Image getImage() {
		return this.image;
	}

}
