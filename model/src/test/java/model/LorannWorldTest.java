package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class LorannWorldTest.
 */
public class LorannWorldTest {
	
	/** The test loran. */
	private static LorannWorld testLoran;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testLoran = new LorannWorld(1);
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
	 * Test get motionless elements.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionlessElements() {
		for(int i =0; i < this.testLoran.getWidth(); i++){
			for( int y = 0; y < this.testLoran.getHeight(); y++){
				assertNotNull(this.testLoran.getMotionlessElements());
			}
		}
	}

	/**
	 * Test get motion elements.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionElements() {
		assertNotNull(this.testLoran.getMotionElements());
			
	}

}
