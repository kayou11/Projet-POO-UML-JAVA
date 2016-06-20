package controller;

import contract.IDoor;
import contract.IElement;
import contract.ILocation;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IModel;
import contract.IMotionlessElement;
import contract.IOtherElements;
import contract.IValuable;
import contract.Permeability;

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
	    
	    /**
	     * Check if a collision append between the element and an other
	     * @return
	     * The other element in collision or null if no collision
	     */
	    IElement hasCollision(ILorann lorann){
	        int lorannX = lorann.getX();
	        int lorannY = lorann.getY();
	        for(IOtherElements otherElement: this.model.getLorannWorld().getOtherElements()){
	    		//System.out.println("element : "+element);
	            if(lorannX == otherElement.getLocation().getX() && lorannY == otherElement.getLocation().getY() && lorann != otherElement){

	            	return otherElement;
	            }
	        }
	       return this.model.getLorannWorld().getMotionlessElements()[lorannX][lorannY];
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
	    
	    public void performMorePoint(IElement element, IElement other){
	    	ILorannWorld lorannWorld = this.model.getLorannWorld();
	        if(other instanceof ILorann && element instanceof IValuable){
	            ((ILorann) other).setScore(((ILorann) other).getScore()+((IValuable) element).getValue());
	            lorannWorld.destroyElement(element);
	        }
	    }
	    
	    public void performCrossedCollision(IElement element, IElement other){
	        if(element.getBehaviorElements() != null)
	            this.performCollision(element,other);
	        if(other.getBehaviorElements() != null)
	            this.performCollision(other,element);
	    }
	    
	    public  void performUnlock(IElement element, IElement other){
	        if(other instanceof ILorann) {
	            ILorannWorld lorannWorld = this.model.getLorannWorld();
	            for (int y = 0; y < lorannWorld.getHeight(); y++) {
	                for (int x = 0; x < lorannWorld.getWidth(); x++) {	                	
	                	IElement elementmap = lorannWorld.getMotionlessElements(x, y);
	                	if(elementmap != null)
			                if (elementmap.getName().equals("ClosedDoor")) {
			                   ((IDoor) elementmap).setUnlocked(true);
			                   ((IDoor) elementmap).setPermeability(Permeability.PENETRABLE);
			                }
	                }
	                
	            }
	        }
	    }
	    
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
