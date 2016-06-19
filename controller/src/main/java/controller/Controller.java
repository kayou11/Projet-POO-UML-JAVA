package controller;

import org.omg.CORBA.SystemException;

import contract.ControllerOrder;
import contract.Direction;
import contract.IController;
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
				this.model.getLorannWorld().getLorann().animate(Direction.UP);
				break;
			case DOWN:
				this.model.getLorannWorld().getLorann().animate(Direction.DOWN);
				break;
			case LEFT:
				this.model.getLorannWorld().getLorann().animate(Direction.LEFT);
				break;
			case RIGHT:
				this.model.getLorannWorld().getLorann().animate(Direction.RIGHT);
				break;
			case UPRIGHT:
				this.model.getLorannWorld().getLorann().animate(Direction.UPRIGHT);
				break;
			case DOWNRIGHT:
				this.model.getLorannWorld().getLorann().animate(Direction.DOWNRIGHT);
				break;
			case UPLEFT:
				this.model.getLorannWorld().getLorann().animate(Direction.UPLEFT);
				break;
			case DOWNLEFT:
				this.model.getLorannWorld().getLorann().animate(Direction.DOWNLEFT);
				break;
			case SPELL:
				
			case STAY:
			default:
				break;
		}
	}
}
