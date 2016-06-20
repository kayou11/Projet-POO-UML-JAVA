package model;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DAOLorannWorldTest {
	private static DAOLorannWorld testDAO;
	private static Connection connection;
	private static LorannWorld testLorann;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testDAO = new DAOLorannWorld(connection);
		testLorann = new LorannWorld(1);
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
	public void testCreateLorannWorld() {
		assertTrue(this.testDAO.create(testLorann));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testDeleteLorannWorld() {
		assertTrue(this.testDAO.delete(testLorann));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testUpdateLorannWorld() {
		assertTrue(this.testDAO.update(testLorann));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testFindInt() throws Exception {
		assertNotNull(this.testDAO.find(1));
	}

}
