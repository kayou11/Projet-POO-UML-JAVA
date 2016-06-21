package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class DBPropertiesTest.
 */
public class DBPropertiesTest {
	
	/** The test DB. */
	private static DBProperties testDB;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testDB = new DBProperties();
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
	 * Test get url.
	 */
	@Test
	public void testGetUrl() {
	
		String expected = "jdbc:mysql://localhost:3309/jpublankproject?autoReconnect=true&useSSL=false";
		assertEquals(expected, DBPropertiesTest.testDB.getUrl());
	}

	/**
	 * Test get login.
	 */
	@Test
	public void testGetLogin() {
		String expected = "root";
		assertEquals(expected, DBPropertiesTest.testDB.getLogin());
	}

	/**
	 * Test get password.
	 */
	@Test
	public void testGetPassword() {
		String expected = "root";
		assertEquals(expected, DBPropertiesTest.testDB.getPassword());
	}

}
