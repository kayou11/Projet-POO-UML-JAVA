package model;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class DAOLorannWorldTest.
 */
public class DAOLorannWorldTest {
	
	/** The test DAO. */
	private static DAOLorannWorld testDAO;
	
	/** The connection. */
	private static Connection connection;
	
	/** The test lorann. */
	private static LorannWorld testLorann;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testDAO = new DAOLorannWorld(connection);
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
	 * Test create lorann world.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testCreateLorannWorld() {
		assertTrue(this.testDAO.create(testLorann));
	}

	/**
	 * Test delete lorann world.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testDeleteLorannWorld() {
		assertTrue(this.testDAO.delete(testLorann));
	}

	/**
	 * Test update lorann world.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testUpdateLorannWorld() {
		assertTrue(this.testDAO.update(testLorann));
	}
}
