package elements.motionless;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Permeability;


// TODO: Auto-generated Javadoc
/**
 * The Class MotionlessElementTest.
 */
public class MotionlessElementTest {
	
	/** The testmotionless element. */
	private static MotionlessElement testmotionlessElement;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testmotionlessElement = new MotionlessElement("Purse",null, Permeability.BLOCKING);
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
	 * Test get permeability.
	 */
	@Test
	public void testGetPermeability() {
		assertEquals(Permeability.BLOCKING, testmotionlessElement.getPermeability());
	}
	/**
	 * Test get permeability.
	 */
	@Test
	public void testGetName() {
		assertEquals("Purse", testmotionlessElement.getName());
	}

}
