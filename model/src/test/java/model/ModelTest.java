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

/**
 * The Class ModelTest.
 *
 * @author Jean-Aymeric Diet
 */
public class ModelTest {
	private Model model;
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
	 * Test method for {@link model.Model#getLevel()}.
	 */
	@Test
	public void testGetLevel() {
		Assert.assertEquals(0, this.model.getLevel());
	}

	/**
	 * Test method for {@link model.Model#loadLevel(int)}.
	 */
	@Test
	public void testGetLevelBDD() {
		this.model.loadLevel(1);
		Assert.assertEquals(1, this.model.getLevel());
		this.model.loadLevel(2);
		Assert.assertEquals(2, this.model.getLevel());
		this.model.loadLevel(3);
		Assert.assertEquals(3, this.model.getLevel());
		this.model.loadLevel(4);
		Assert.assertEquals(4, this.model.getLevel());
		
	}
	
	@Test
	public void testOpenDatabase(){
		
		Assert.assertEquals(true, this.dBConnection.open());
		
	}

}
