package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.BehaviorAnimate;
import contract.BehaviorElements;
import contract.ControllerOrder;
import contract.ILocation;
import contract.ILorann;
import contract.ILorannWorld;
import contract.ISprite;
import contract.Permeability;
import elements.motion.Lorann;

// TODO: Auto-generated Javadoc
/**
 * The Class LorannWorldTest.
 */
public class LorannWorldTest {
	
	/** The test loran. */
	private static LorannWorld testLoran;
	
	/** The test loran. */
	private static ILorann lorann;
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testLoran = new LorannWorld(1);
		lorann = new ILorann() {
			
			public void setPermeability(Permeability permeability) {
				// TODO Auto-generated method stub
				
			}
			
			public ISprite getSprite() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public ILocation getLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public BehaviorElements getBehaviorElements() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void setY(int y) {
				// TODO Auto-generated method stub
				
			}
			
			public void setX(int x) {
				// TODO Auto-generated method stub
				
			}
			
			public void setLorannWorld(ILorannWorld lorannWorld, int x, int y) {
				// TODO Auto-generated method stub
				
			}
			
			public void saveLastPosition() {
				// TODO Auto-generated method stub
				
			}
			
			public void moveTo(int x, int y) {
				// TODO Auto-generated method stub
				
			}
			
			public boolean isMovePossible(int x, int y) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public int getY() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public int getX() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public Permeability getPermeability() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public BehaviorAnimate getBehaviorGetAnimate() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void setScore(Integer score) {
				// TODO Auto-generated method stub
				
			}
			
			public void setDirection(ControllerOrder direction) {
				// TODO Auto-generated method stub
				
			}
			
			public void setAlive(boolean alive) {
				// TODO Auto-generated method stub
				
			}
			
			public void moveUp() {
				// TODO Auto-generated method stub
				
			}
			
			public void moveRightUp() {
				// TODO Auto-generated method stub
				
			}
			
			public void moveRightDown() {
				// TODO Auto-generated method stub
				
			}
			
			public void moveRight() {
				// TODO Auto-generated method stub
				
			}
			
			public void moveLeftUp() {
				// TODO Auto-generated method stub
				
			}
			
			public void moveLeftDown() {
				// TODO Auto-generated method stub
				
			}
			
			public void moveLeft() {
				// TODO Auto-generated method stub
				
			}
			
			public void moveDown() {
				// TODO Auto-generated method stub
				
			}
			
			public boolean isAlive() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public Integer getScore() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public ControllerOrder getOrder() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean animate() {
				// TODO Auto-generated method stub
				return false;
			}
		};
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
	 * Test get motionless elements.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionlessElements() {
		for(int i =0; i < this.testLoran.getWidth(); i++){
			for( int y = 0; y < this.testLoran.getHeight(); y++){
				assertNotNull(this.testLoran.getMotionlessElements());
			}
		}
	}


	/**
	 * Test get width.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetWidth() {
		final int expected = 22;
		assertEquals(expected, this.testLoran.getWidth());
	}

	/**
	 * Test get height.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetHeight() {
		final int expected = 16;
		assertEquals(expected, this.testLoran.getHeight());
	}
	
	/**
	 * Test get motion elements.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionElements() {
		assertNotNull(this.testLoran.getMotionElements());
			
	}
	
	/**
	 * Test get lorann.
	 */
	@Test
	public void testGetLorann() {
		this.testLoran.setLorann(lorann);
		assertNotNull(this.testLoran.getLorann());
	}

}
