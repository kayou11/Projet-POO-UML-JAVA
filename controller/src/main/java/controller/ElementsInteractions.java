package controller;

import contract.IDoor;
import contract.IElement;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IModel;
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
	               // performSpell(element,other);
	                break;
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
	        if(other instanceof ILorann){
	            ((ILorann) other).setAlive(false);
	        	System.out.println("alive : "+this.model.getLorannWorld().getLorann().isAlive());
	            //this.model.getLorannWorld().destroyElement(other);
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
			                   lorannWorld.destroyElement(element);
			                }
	                	}
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
	                //Lorann lorann = this.model.getLevel().getHero();
	                //lorann.setScore(lorann.getScore() + this.model.getLevel().getValue());
	            } else {
	                this.model.loadNextLevel();
	            }
	        }
	    }

}
