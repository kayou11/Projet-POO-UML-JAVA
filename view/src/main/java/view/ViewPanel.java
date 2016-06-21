package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.IElement;
import contract.ILorann;
import contract.IModel;
import contract.IMotionElement;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	private IModel model;

	/** The view frame. */
	private ViewFrame					viewFrame;
	
	/** The motion elements. */
	private final ArrayList<? extends 	IMotionElement> motionElements;
	
	/** The motionless elements. */
	private final IElement 				motionlessElements[][];
	
	/** The width. */
	private final int 					width;
	
	/** The height. */
	private final int 					height;
	
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame          the view frame
	 * @param motionElements the motion elements
	 * @param motionlessElements the motionless elements
	 * @param width the width
	 * @param height the height
	 */
	public ViewPanel(final ViewFrame viewFrame, final ArrayList<? extends IMotionElement> motionElements, final IElement motionlessElements[][], final int width, final int height) {
		this.setViewFrame(viewFrame);
		this.motionElements = motionElements;
		this.motionlessElements = motionlessElements;
		viewFrame.getModel().getLorannWorld().getObservable().addObserver(this);
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.width, this.height);
		for(int y = 0; y < 16; y++)
		{
			for(int x = 0; x < 22; x++)
			{
				if(this.motionlessElements[x][y]!=null) {
				
					graphics.drawImage(this.motionlessElements[x][y].getSprite().getImage(), x*32, y*32, null);
				} else {
					graphics.setColor(new Color(0,0,0));
					graphics.fillRect(x*32, y*32, 32, 32);
				}
			}
		}
		
		for(final IMotionElement motionElement : this.motionElements){
			graphics.drawImage(motionElement.getSprite().getImage(), motionElement.getX()*32, motionElement.getY()*32, null);
		}

		graphics.setColor(Color.YELLOW);
		if(!viewFrame.getModel().getLorannWorld().getLorann().isAlive()) 
		{
			graphics.drawString("GAME OVER", 16, 22);
		}
		
		graphics.setColor(new Color(255,0,0));
		graphics.drawString("Score : "+this.viewFrame.getModel().getLorannWorld().getLorann().getScore(), 22, 16);

	}
}
