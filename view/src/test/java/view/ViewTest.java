package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;


public class ViewTest {
	private View testView;
	private int key;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testKeyCodeToControllerOrder() {
		
		key = KeyEvent.VK_UP;
		assertEquals(ControllerOrder.UP, this.testView.keyCodeToControllerOrder(key).ordinal());
	}

}