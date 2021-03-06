package main;

import java.sql.SQLException;

import controller.Controller;
import model.Model;
import view.View;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args          the arguments
	 * @throws Exception the exception
	 */
	public static void main(final String[] args) throws Exception {
		final Model model = new Model();
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
		controller.control();
	}
}