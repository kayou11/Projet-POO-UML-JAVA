package elements.motion;

import contract.BehaviorAnimate;
import contract.ILorannWorld;
import contract.IMotionElement;

public class Stupid implements BehaviorAnimate{

	/* (non-Javadoc)
	 * @see model.Normal#animate()
	 */
	public void animate(IMotionElement motionElement, ILorannWorld lorannWorld) {
		
		int diffX = motionElement.getX() - lorannWorld.getLorann().getX();
		int diffY = motionElement.getY() - lorannWorld.getLorann().getY();
		
		if (lorannWorld.getLorann().getY()<motionElement.getY() && lorannWorld.getLorann().getX()<motionElement.getX() ){
			if( Math.abs(diffX) < Math.abs(diffY) ) {
				motionElement.moveUp();
			}
			if( Math.abs(diffX) == Math.abs(diffY) ) {
				motionElement.moveLeftUp();
			}
			if( Math.abs(diffX) > Math.abs(diffY) ) {
				motionElement.moveLeft();
			}
		}
		if (lorannWorld.getLorann().getY()<motionElement.getY() && lorannWorld.getLorann().getX()>motionElement.getX()){
			if( Math.abs(diffX) < Math.abs(diffY) ) {
				motionElement.moveUp();
			}
			if( Math.abs(diffX) == Math.abs(diffY) ) {
				motionElement.moveRightUp();
			}
			if( Math.abs(diffX) > Math.abs(diffY) ) {
				motionElement.moveRight();
			}
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY() && lorannWorld.getLorann().getX()<motionElement.getX() ){
			if( Math.abs(diffX) < Math.abs(diffY) ) {
				motionElement.moveDown();
			}
			if( Math.abs(diffX) == Math.abs(diffY) ) {
				motionElement.moveLeftDown();
			}
			if( Math.abs(diffX) > Math.abs(diffY) ) {
				motionElement.moveLeft();
			}
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY() && lorannWorld.getLorann().getX()>motionElement.getX()){
			if( Math.abs(diffX) < Math.abs(diffY) ) {
				motionElement.moveDown();
			}
			if( Math.abs(diffX) == Math.abs(diffY) ) {
				motionElement.moveRightDown();
			}
			if( Math.abs(diffX) > Math.abs(diffY) ) {
				motionElement.moveRight();
			}
		}
		if (lorannWorld.getLorann().getY()==motionElement.getY() && lorannWorld.getLorann().getX()<motionElement.getX()){
			motionElement.moveLeft();
		}
		if (lorannWorld.getLorann().getY()==motionElement.getY() && lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.moveRight();
		}
		if (lorannWorld.getLorann().getY()<motionElement.getY() && lorannWorld.getLorann().getX()==motionElement.getX()){
			motionElement.moveUp();
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY() && lorannWorld.getLorann().getX()==motionElement.getX()){
			motionElement.moveDown();
		}	
	}
	
}
