package elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpriteTest {
	private static Sprite testSprite;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testSprite = new Sprite("noimage.jpg");
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
	public void testGetSprite() {
		assertNotNull(this.testSprite.getImage());
	}
	
	/**
	 * Test method for {@link model.Model#loadSprite(int)}.
	 */
	/*@Test
	public void testGetSprite() {
		
		Assert.assertEquals("sprites/lorann_u.png", this.sprite.loadSprite(1));
		/*this.elements.loadSprite(2);
		Assert.assertEquals(2, this.elements.getSprite());
		this.elements.loadSprite(3);
		Assert.assertEquals(3, this.elements.getSprite());
		this.elements.loadSprite(4);
		Assert.assertEquals(4, this.elements.getSprite());
		
	}
	
	*/
}
