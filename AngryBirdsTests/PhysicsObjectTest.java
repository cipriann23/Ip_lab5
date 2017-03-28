package angrybirds;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhysicsObjectTest {

	@Test
	public void testDensity() {
		PhysicsObject pig = new Pig(5, 10, 1, 1, 1);
		
		
		int result = pig.computeDensity();
		
		AssertEquals(1, result);
	}

}
