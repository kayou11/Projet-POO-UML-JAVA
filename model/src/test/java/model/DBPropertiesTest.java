package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DBPropertiesTest {
	private static DBProperties testDB;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testDB = new DBProperties();
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
	public void testGetUrl() {
	
		String expected = "jdbc:mysql://localhost:3309/jpublankproject?autoReconnect=true&useSSL=false";
		assertEquals(expected, DBPropertiesTest.testDB.getUrl());
	}

	@Test
	public void testGetLogin() {
		String expected = "root";
		assertEquals(expected, DBPropertiesTest.testDB.getLogin());
	}

	@Test
	public void testGetPassword() {
		String expected = "root";
		assertEquals(expected, DBPropertiesTest.testDB.getPassword());
	}

}
