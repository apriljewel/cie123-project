import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class TestCase {

	/**
	* This test scenario is the JUnit test case for the rollDice function.
	*/	

	@Test
	public void testRollDice() {
		Random rand = new Random();
		assertNotNull(rand);
	}
	
	/**
	* This test scenario is the JUnit test case for the pass function.
	*/
	
	public void testPass() {
		
	}
	
	/**
	* This test scenario is the JUnit test case for the encounter function.
	*/

	public void testEncounter() {
		Scanner input = new Scanner(System.in);
		assertNotNull(input);
	}
}

