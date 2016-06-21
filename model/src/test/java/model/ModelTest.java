/**
 *
 */
package model;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelTest.
 *
 * @author Jean-Aymeric Diet
 */
public class ModelTest {
	
	/** The model. */
	private Model model;
	
	/** The dBconnection. */
	private DBConnection dBConnection;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception
	 *           the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception
	 *           the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *           the exception
	 */
	@Before
	public void setUp() throws Exception {
		this.model = new Model();
		this.dBConnection = DBConnection.getInstance();
		
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *           the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test get lorannWorld.
	 */
	@Test
	public void testGetLorannWorld() {
		Assert.assertNotNull(this.model.getLorannWorld());
	}
	
	/**
	 * Test open database.
	 */
	@Test
	public void testOpenDatabase(){
		
		Assert.assertEquals(true, this.dBConnection.open());
		
	}


}
