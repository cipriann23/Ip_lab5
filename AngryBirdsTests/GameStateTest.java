package angrybirds;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameStateTest {

	@Test
	public void NextFrameHasCollision() {
		GameState gameState = new GameState(100,100);
		Bird bird = new Bird(3,4,5);
		Pig pig = new Pig(3,4,4);
		gameState.pigs.add(pig);
		gameState.birds.add(bird);
		gameState.nextFrame();
		AssertEquals(pig.health,pig.health-bird.damage);
	}
	@Test
	public void NextFramePigDiedThenRemovedPig() {
		GameState gameState = new GameState(100,100);
		Bird bird = new Bird(3,4,5);
		Pig pig = new Pig(3,4,5);
		int beforeDeath = gameState.pigs.size();
		
		gameState.pigs.add(pig);
		gameState.birds.add(bird);
		gameState.nextFrame();
		
		int afterDeath = gameState.pigs.size();
		
		AssertEquals(beforeDeath-1,afterDeath);
	}

}
