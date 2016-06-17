package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.IElement;
import contract.IMotionElement;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	private final ArrayList<? extends IMotionElement> motionElements;
	private final IElement motionlessElements[][];
	private final int width;
	private final int height;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame, final ArrayList<? extends IMotionElement> motionElements, final IElement motionlessElements[][], final int width, final int height) {
		this.setViewFrame(viewFrame);
		this.motionElements = motionElements;
		this.motionlessElements = motionlessElements;
		viewFrame.getModel().getObservable().addObserver(this);
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
		for(int y = 0; y < 14; y++)
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
		for(final IMotionElement h : this.motionElements)
		{
			graphics.drawImage(h.getSprite().getImage(), h.getX()*32, h.getY()*32, null);
		}
	}
}
