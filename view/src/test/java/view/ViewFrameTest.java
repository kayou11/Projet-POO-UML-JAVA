package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Observable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ILorannWorld;
import contract.IModel;


public class ViewFrameTest {
	private static ViewFrame testFrame;
	private static KeyEvent e;
	private static int key;
	private static IModel testmodel;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testFrame = new ViewFrame(testmodel = new IModel() {
			
			public void setMobileHasChanged() {
				// TODO Auto-generated method stub
				
			}
			
			public void loadLevel(int level) {
				// TODO Auto-generated method stub
				
			}
			
			public Observable getObservable() {
				// TODO Auto-generated method stub
				return new Observable();
			}
			
			public int getLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			public ILorannWorld getLorannWorld() {
				// TODO Auto-generated method stub
				return null;
			}
		});
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
