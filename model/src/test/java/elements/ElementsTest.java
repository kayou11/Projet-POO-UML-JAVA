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

// TODO: Auto-generated Javadoc
/**
 * The Class ElementsTest.
 */
public class ElementsTest {

	/** The elements. */
	private static IElement elements;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		elements = new Door();
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
	 * Test get sprite.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetSprite() {
		assertNotNull(this.elements.getSprite());
	}
}
