package controller;


import contract.ControllerOrder;
import contract.IController;
import contract.IElement;
import contract.ILorann;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		ElementsInteractions.init(this.model);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		this.model.getLorannWorld().play();
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case UP:
				this.model.getLorannWorld().getLorann().setDirection(ControllerOrder.UP);
				break;
			case DOWN:
				this.model.getLorannWorld().getLorann().setDirection(ControllerOrder.DOWN);
				break;
			case LEFT:
				this.model.getLorannWorld().getLorann().setDirection(ControllerOrder.LEFT);
				break;
			case RIGHT:
				this.model.getLorannWorld().getLorann().setDirection(ControllerOrder.RIGHT);
				break;
			case UPRIGHT:
				this.model.getLorannWorld().getLorann().setDirection(ControllerOrder.UPRIGHT);
				break;
			case DOWNRIGHT:
				this.model.getLorannWorld().getLorann().setDirection(ControllerOrder.DOWNRIGHT);
				break;
			case UPLEFT:
				this.model.getLorannWorld().getLorann().setDirection(ControllerOrder.UPLEFT);
				break;
			case DOWNLEFT:
				this.model.getLorannWorld().getLorann().setDirection(ControllerOrder.DOWNLEFT);
				break;
			case SPELL:
				if (!this.model.getLorannWorld().isSpellLaunched()){
					this.model.getLorannWorld().setSpellLaunched(true);
					System.out.println("launched : " +this.model.getLorannWorld().isSpellLaunched());

				} else {

					this.model.getLorannWorld().setAttractSpell(true);
					System.out.println("attract : "+this.model.getLorannWorld().isAttractSpell());

				}
				break;
			case STAY:
			default:
				break;
		}
		performCollision(this.model.getLorannWorld().getLorann());
	}
	
	/**
	 * Perform the collision depending of the behavior.
	 *
	 * @param element the element
	 */
	private void performCollision(ILorann element){
		ElementsInteractions elementsInteractions = ElementsInteractions.getInstance();
		IElement otherElement = elementsInteractions.hasCollision(element);
		if(otherElement == null)
			return;
		elementsInteractions.performCrossedCollision(element,otherElement);
	}
	
}
