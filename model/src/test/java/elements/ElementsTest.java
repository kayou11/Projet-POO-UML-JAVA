package elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IElement;
import contract.Permeability;
import elements.motionless.Door;
import elements.motionless.MotionlessElement;

public class ElementsTest {

	private static IElement elements;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		elements = new Door();
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

	@SuppressWarnings("static-access")
	@Test
	public void testGetSprite() {
		assertNotNull(this.elements.getSprite());
	}

}
