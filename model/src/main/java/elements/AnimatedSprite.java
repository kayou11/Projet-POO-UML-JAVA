package elements;

import javax.imageio.ImageIO;

import contract.IAnimatedSprites;

import java.awt.*;
import java.io.File;
import java.io.IOException;


public class AnimatedSprite extends Sprite implements IAnimatedSprites{
	/**
	 * make a list of sprite for an object that will appear on screen
	 */
    private Image images[];

    
    /**
     * define the the current animation status
     */
    private int step;
    
    
    /**
     * the constructor of this class
     */
    public AnimatedSprite(String defaultImage, String[] images) {
        super(defaultImage);
        this.images = new Image[images.length];
        for(int i = 0; i<images.length; i++){
    		try {
    			this.images[i] = ImageIO.read(new File("sprites/" + images[i]));
    			
    		} catch (final IOException e) {
                System.err.println("Can't load " + images[i]);
    			e.printStackTrace();
    		}
        }
        this.step = 0;
    }

    /**
     * initiate the next step of the animation sequence
     */
    public void nextStep()
    {
        this.step++;
        if(this.step >= this.images.length){
            this.step = 0;
        }
    }

    @Override
    public Image getImage() {
        return this.images[this.step];
    }
}