package elements.motionless;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Permeability;


public class MotionlessElementTest {
	private static MotionlessElement testmotionlessElement;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testmotionlessElement = new MotionlessElement("",null, Permeability.BLOCKING);
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
	public void testGetPermeability() {
		assertEquals(Permeability.BLOCKING, testmotionlessElement.getPermeability());
	}

}
