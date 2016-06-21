package controller;

import contract.IDoor;
import contract.IElement;
import contract.IEnergyBall;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IModel;
import contract.IMonster;
import contract.IMotionElement;
import contract.IOtherElements;
import contract.IValuable;
import contract.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class ElementsInteractions.
 */
public class ElementsInteractions {
	 
 	/** The our instance. */
 	private static ElementsInteractions ourInstance;
	    
    	/** The model. */
    	private IModel model;

	    /**
    	 * Gets the single instance of ElementsInteractions.
    	 *
    	 * @return single instance of ElementsInteractions
    	 */
    	static ElementsInteractions getInstance() {
	        if(ourInstance == null)
	            System.err.println("Move manager not initialized");
	        return ourInstance;
	    }

	    /**
    	 * Inits the.
    	 *
    	 * @param model the model
    	 */
    	static void init(IModel model){
	        ourInstance = new ElementsInteractions(model);
	    }

	    /**
    	 * Instantiates a new elements interactions.
    	 *
    	 * @param model the model
    	 */
    	private ElementsInteractions(IModel model) {
	        this.model = model;
	    }
	    
	    /**
    	 * Check if a collision append between the element and an other.
    	 *
    	 * @param lorann the lorann
    	 * @return The other element in collision or null if no collision
    	 */
	    IElement hasCollision(ILorann lorann){
	        int lorannX = lorann.getX();
	        int lorannY = lorann.getY();
	        for(IOtherElements otherElement: this.model.getLorannWorld().getOtherElements()){
	            if(lorannX == otherElement.getLocation().getX() && lorannY == otherElement.getLocation().getY() && lorann != otherElement){

	            	return otherElement;
	            }
	        }
	       return this.model.getLorannWorld().getMotionlessElements()[lorannX][lorannY];
	    }
	    
	    /**
    	 * All the collision of the game.
    	 *
    	 * @param element the element
    	 * @param other the other
    	 */
	    void performCollision(IElement element, IElement other){
	        if(element.getBehaviorElements() == null)
	            return;
	        switch (element.getBehaviorElements()){
	            case DEATH:
	            	performDeath(element,other);
	                break;
	            case MOREPOINT:
	            	performMorePoint(element,other);
	                break;
	            case END:
	                performEnd(element,other);
	                break;
	            case UNLOCK:
	                performUnlock(element,other);
	                break;
	            case SPELL:
	                performSpell(element,other);
	                break;
	                
	            case LIVE:
	            default:
	                System.err.println("Not implemented behavior "+element.getBehaviorElements().toString());
	                break;
	        }
	 
	    }
	    
	    /**
    	 * Perform death.
    	 *
    	 * @param element the element
    	 * @param other the other
    	 */
	    void performDeath(IElement element, IElement other){
            System.out.println("element : "+(IMonster) element);
	        if(other instanceof ILorann && element instanceof IMotionElement) {
	            ((ILorann) other).setAlive(false);
	            this.model.getLorannWorld().destroyElement(element);
	        }
	    }
	    
	    /**
    	 * Perform more point.
    	 *
    	 * @param element the element
    	 * @param other the other
    	 */
    	public void performMorePoint(IElement element, IElement other){
	    	ILorannWorld lorannWorld = this.model.getLorannWorld();
	        if(other instanceof ILorann && element instanceof IValuable){
	            ((ILorann) other).setScore(((ILorann) other).getScore()+((IValuable) element).getValue());
	            lorannWorld.destroyElement(element);
	        }
	    }
	    
        /**
         * The spell destroy the monster
         * @param element
         * Spell which destroy the element
         * @param other
         * Spell which destroy other
         */
        private void performSpell(IElement element, IElement other){
            if(other instanceof ILorann){
                this.model.getLorannWorld().destroyElement(element);
            } else if(other instanceof IMonster){
            	this.model.getLorannWorld().destroyElement(other);
                ILorann lorann = this.model.getLorannWorld().getLorann();
                lorann.setScore(lorann.getScore() + ((IMonster) other).getValue());
            }
        }
        
	    /**
    	 * Perform crossed collision.
    	 *
    	 * @param element the element
    	 * @param other the other
    	 */
    	public void performCrossedCollision(IElement element, IElement other){
	        if(element.getBehaviorElements() != null)
	            this.performCollision(element,other);
	        if(other.getBehaviorElements() != null)
	            this.performCollision(other,element);
	    }
	    
	    /**
    	 * Perform unlock.
    	 *
    	 * @param element the element
    	 * @param other the other
    	 */
    	public  void performUnlock(IElement element, IElement other){
	        if(other instanceof ILorann) {
	            ILorannWorld lorannWorld = this.model.getLorannWorld();
	            for (int y = 0; y < lorannWorld.getHeight(); y++) {
	                for (int x = 0; x < lorannWorld.getWidth(); x++) {	                	
	                	IElement elementmap = lorannWorld.getMotionlessElements(x, y);
	                	if(elementmap != null){
			                if (elementmap.getName().equals("ClosedDoor")) {
			                   ((IDoor) elementmap).setUnlocked(true);
			                   ((IDoor) elementmap).setPermeability(Permeability.PENETRABLE);
			                   this.model.getLorannWorld().destroyElement(elementmap);
			                }
			                
	                	}
	                }
	                if(element instanceof IValuable) {
	                    ILorann lorann = this.model.getLorannWorld().getLorann();
	                    lorann.setScore(lorann.getScore()+((IValuable) element).getValue());
	                }
	            }
	        }
	    }
	    
	    /**
    	 * Perform end.
    	 *
    	 * @param element the element
    	 * @param other the other
    	 */
    	void performEnd(IElement element, IElement other){
	        if(other instanceof ILorann){
	            if(!this.model.getLorannWorld().isFinished()) {
	                this.model.getLorannWorld().setFinished(true);
	                ILorann lorann = this.model.getLorannWorld().getLorann();
	                lorann.setScore(lorann.getScore() + this.model.getLorannWorld().getValue());
	            } else {
	                this.model.loadNextLevel();
	            }
	        }
	    }

}
