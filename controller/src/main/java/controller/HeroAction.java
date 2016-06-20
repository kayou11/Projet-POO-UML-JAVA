package controller;

import contract.ILorann;
import contract.IModel;
import contract.IMotionElement;
import contract.ISpell;

public class HeroAction {
    private static HeroAction ourInstance;
    private IModel model;

    public static HeroAction getInstance() {
        if(ourInstance == null)
            System.err.println("HeroAction not initialized");
        return ourInstance;
    }

    public static void init(IModel model){
        ourInstance = new HeroAction(model);
    }

    private HeroAction(IModel model) {
        this.model = model;
    }

    /**
     * Spell of the hero
     */
    public void sendSpell(){
    	ILorann lorann = this.model.getLorannWorld().getLorann();
    	
        if(!lorann.isAlive()) {
            return;
        }
        
        int spellX = lorann.getX();        
        int spellY = lorann.getY();
        
	        switch(lorann.getDirection()){
	            case UP:
	                spellY--;

	                break;
	            case DOWN:
	                spellY++;

	                break;
	            case LEFT:
	                spellX--;

	                break;
	            case RIGHT:
	                spellX++;

	                //lorann.getSpell().moveTo(spellX++, spellY);
	                break;
	            default:
	                System.err.println("Not valid direction spell");
	                break;
	        }
	        
	        if(lorann.isSpellPossible(spellX, spellY)){
	        	lorann.addSpell(spellX, spellY, lorann.getDirection());
	
	        }
        } 
}