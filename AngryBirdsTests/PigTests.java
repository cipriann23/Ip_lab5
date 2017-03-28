package angrybirds;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigTests {

	@Test
	public void WhenDieShouldOutputText() {
		Pig pig = new Pig(1,2,3);
		
		String output = "Pig of health " + pig.health + " died.";
		
		AssertEquals(output,pig.message);
	}

}
