package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewTest.
 */
public class ViewTest {
	
	/** The test view. */
	private View testView;
	
	/** The key. */
	private int key;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test key code to controller order.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testKeyCodeToControllerOrder() {
		
		key = KeyEvent.VK_UP;
		assertEquals(ControllerOrder.UP, this.testView.keyCodeToControllerOrder(key));
	}

}