package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IController;
import contract.IModel;
// TODO: Auto-generated Javadoc

/**
 * The Class ViewFrameTest.
 */
public class ViewFrameTest {
	
	/** The test view. */
	private View testView;
	
	/** The test frame. */
	private static ViewFrame testFrame;
	
	/** The e. */
	private static KeyEvent e;
	
	/** The key. */
	private static int key;
	
	/** The model. */
	private IModel model;
	
	/** The test controller. */
	private IController testController;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testFrame = new ViewFrame();
		e = new KeyEvent(testFrame,KeyEvent.KEY_PRESSED,System.currentTimeMillis(),0,KeyEvent.VK_E,'e');
		key = KeyEvent.VK_E;
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
	 * Test key typed.
	 */
	@Test
	public void testKeyTyped() {
		testFrame.keyTyped(e);
		assertEquals(key, e.getKeyCode());
	}

	/**
	 * Test key pressed.
	 */
	@Test
	public void testKeyPressed() {
		//testFrame.keyPressed(e);
		assertEquals(key, e.getKeyCode());
		
	}

	/**
	 * Test key released.
	 */
	@Test
	public void testKeyReleased() {
		testFrame.keyReleased(e);
		assertEquals(key, e.getKeyCode());
	}

}
