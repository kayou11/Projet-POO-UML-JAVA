package controller;

import contract.IDoor;
import contract.IElement;
import contract.ILocation;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IModel;
import contract.IOtherElements;

public class ElementsInteractions {
	 private static ElementsInteractions ourInstance;
	    private IModel model;

	    static ElementsInteractions getInstance() {
	        if(ourInstance == null)
	            System.err.println("Move manager not initialized");
	        return ourInstance;
	    }

	    static void init(IModel model){
	        ourInstance = new ElementsInteractions(model);
	    }

	    private ElementsInteractions(IModel model) {
	        this.model = model;
	    }
	    
	    IElement hasCollision(IElement element){
	        ILocation elementLocation = element.getLocation();
	        for(IOtherElements otherElement: this.model.getLorannWorld().getOtherElements()){
	            if(elementLocation.getX() == otherElement.getLocation().getX() && elementLocation.getY() == otherElement.getLocation().getY() && element != otherElement){
	                return otherElement;
	            }
	        }
	        return this.model.getLorannWorld().getMotionlessElements()[elementLocation.getY()][elementLocation.getX()];
	    }
	    
	    /**
	     * All the collision of the game
	     * @param element
	     * @param other
	     */
	    void performCollision(IElement element, IElement other){
	        if(element.getBehaviorElements() == null)
	            return;
	        switch (element.getBehaviorElements()){
	            case DEATH:
	                //(element,other);
	                break;
	            case MOREPOINT:
	               // performMorePoint(element,other);
	                break;
	            case END:
	                performEnd(element,other);
	                break;
	            case UNLOCK:
	                performUnlock(element,other);
	                break;
	            case SPELL:
	               // performSpell(element,other);
	                break;
	            default:
	                System.err.println("Not implemented behavior "+element.getBehaviorElements().toString());
	                break;
	        }
	        //if(element instanceof IItem && other instanceof IHero){
	          //  this.model.getLevel().destroyElement(element);
	        //}
	    }
	    
	    void performCrossedCollision(IElement element, IElement other){
	        if(element.getBehaviorElements() != null)
	            this.performCollision(element,other);
	        if(other.getBehaviorElements() != null)
	            this.performCollision(other,element);
	    }
	    
	    void performUnlock(IElement element, IElement other){
	        if(other instanceof ILorann) {
	            ILorannWorld lorannWorld = this.model.getLorannWorld();
	            for (int y = 0; y < lorannWorld.getHeight(); y++) {
	                for (int x = 0; x < lorannWorld.getWidth(); x++) {
	                    IElement element2 = lorannWorld.getMotionlessElements(x, y);
	                    if (element2 instanceof IDoor) {
	                        ((IDoor) element2).setUnlocked(true);
	                    }
	                }
	            }
	        }
	    }
	    
	    void performEnd(IElement element, IElement other){
	        if(other instanceof ILorann){
	            if(!this.model.getLorannWorld().isFinished()) {
	                this.model.getLorannWorld().setFinished(true);
	                //ILorann lorann = this.model.getLevel().getHero();
	                //lorann.setScore(lorann.getScore() + this.model.getLevel().getValue());
	            } else {
	                this.model.loadNextLevel();
	            }
	        }
	    }

}
