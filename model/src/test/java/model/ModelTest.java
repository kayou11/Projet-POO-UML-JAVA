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

import elements.Elements;
import elements.Sprite;

/**
 * The Class ModelTest.
 *
 * @author Jean-Aymeric Diet
 */
public class ModelTest {
	private Model model;
	private DBConnection dBConnection;
	private Sprite sprite;
	private Elements elements;
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

	@Test
	public void testOpenDatabase(){
		
		Assert.assertEquals(true, this.dBConnection.open());
		
	}


}
