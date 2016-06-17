package elements.motion;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import elements.Sprite;

public class LorannTest {
	
	private Sprite sprite;
	private static final Lorann Lorann = new Lorann();
	int oneKey;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		int oneKey = KeyEvent.VK_UP;
	
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
	public void testLorann() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeLorann() {
		

		
		for(int i = 1 ; i < 8 ; i++){
			assertNotNull(this.Lorann.changeLorann(i, oneKey));
		}
	}

}
