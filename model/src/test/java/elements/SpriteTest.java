package elements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class SpriteTest.
 */
public class SpriteTest {
	
	/** The test sprite. */
	private static Sprite testSprite;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testSprite = new Sprite("noimage.jpg");
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
	 * Test get sprite.
	 */
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
