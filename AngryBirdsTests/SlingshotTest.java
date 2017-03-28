package angrybirds;

import org.junit.Test;

import junit.*;
import junit.framework.TestCase;

public class SlingshotTest extends TestCase {

	@Test
	public void testLaunchOnBadArguments() {
		Slingshot sling = new Slingshot();
		Bird bird = new Bird();

		boolean result = sling.launch(1000000, 123123, bird);

		assertEquals(result, false);
	}

	@Test
	public void testLaunchGoodArguments() {
		Slingshot sling = new Slingshot(5, 5);
		Bird bird = new Bird(10, 11);

		boolean result = sling.launch(3, 2, bird);

		assertEquals(true, result);
	}

	@Test
	public void testLaunchGoodArgumentsPositionX() {
		Slingshot sling = new Slingshot(5, 5);
		Bird bird = new Bird(10, 11);

		assertEquals(bird.vX, (float)3-sling.posX);
	}
	
	@Test
	public void testLaunchGoodArgumentsPositionY() {
		Slingshot sling = new Slingshot(5, 5);
		Bird bird = new Bird(10, 11);

		assertEquals(bird.vY, (float)2-sling.posY);
	}
	
}
