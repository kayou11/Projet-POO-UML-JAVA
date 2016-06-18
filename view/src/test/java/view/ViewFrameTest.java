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
public class ViewFrameTest {
	private View testView;
	private static ViewFrame testFrame;
	private static KeyEvent e;
	private static int key;
	private IModel model;
	private IController testController;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testFrame = new ViewFrame();
		e = new KeyEvent(testFrame,KeyEvent.KEY_PRESSED,System.currentTimeMillis(),0,KeyEvent.VK_E,'e');
		key = KeyEvent.VK_E;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKeyTyped() {
		testFrame.keyTyped(e);
		assertEquals(key, e.getKeyCode());
	}

	@Test
	public void testKeyPressed() {
		//testFrame.keyPressed(e);
		assertEquals(key, e.getKeyCode());
		
	}

	@Test
	public void testKeyReleased() {
		testFrame.keyReleased(e);
		assertEquals(key, e.getKeyCode());
	}

}
