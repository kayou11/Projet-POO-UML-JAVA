package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LorannWorldTest {
	private static LorannWorld testLoran;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testLoran = new LorannWorld();
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
	public void testGetWidth() {
		final int expected = 1;
		assertEquals(expected, this.testLoran.getWidth());
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetHeight() {
		final int expected = 10;
		assertEquals(expected, this.testLoran.getHeight());
	}


	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionlessElements() {
		for(int i =0; i < this.testLoran.getWidth(); i++){
			for( int y = 0; y < this.testLoran.getHeight(); y++){
				assertNotNull(this.testLoran.getMotionlessElements());
			}
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionElements() {
		assertNotNull(this.testLoran.getMotionElements());
			
	}

}
