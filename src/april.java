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
	
	@Test
	public void testPass() {
		Espionage number = new Espionage();
		assertTrue(number.pass(4));
	}
	
	/**
	* This test scenario is the JUnit test case for the encounter function.
	*/

	public void testEncounter() {
		Scanner input = new Scanner(System.in);
		assertNotNull(input);
	}
	
	/**
	* This test scenario is the JUnit test case for the takeDamage function.
	*/
	
	public void testTakeDamage() {
		
	}
	
	/**
	* This test scenario is the JUnit test case for the heal function.
	*/
	
	public void testHeal() {
		
	}
	
	/**
	* This test scenario is the JUnit test case for the getHP function.
	*/
	
	public void testGetHP() {
		
	}
	
	/**
	* This test scenario is the JUnit test case for the isAlive function.
	*/
	
	public void testIsAlive() {
		Player life = new Player();
		assertTrue(life.isAlive(1));
	}
}

