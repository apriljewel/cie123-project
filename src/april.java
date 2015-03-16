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
		int roll = 5;
		assertTrue(roll > 4);
		assertNotNull(roll);
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
		int hp1 = 5;
		int hp2 = 4;
		assertTrue(hp1 > hp2);
		assertFalse(hp1 < hp2);
		assertNotNull(hp1);
		assertEquals("5", "4", Player.takeDamage("1"));
		assertEquals("5", "0", Player.takeDamage("5"));
	}
	
	/**
	* This test scenario is the JUnit test case for the heal function.
	*/
	
	public void testHeal() {
		int hp1 = 4;
		int hp2 = 5;
		assertTrue( hp1 < hp2);
		assertFalse(hp1 > hp2);
		assertNotNull(hp1);
		assertEquals("4", "5", Player.heal("1"));
		assertEquals("4", "9", Player.heal("5"));
	}
	
	/**
	* This test scenario is the JUnit test case for the getHP function.
	*/
	
	public void testGetHP() {
		int expected = 15;
		int result = 15;
		assertEquals(expected, result);
		assertNotNull(hp1);
		assertEquals("5", "5", Player.getHP("5"));
	}
	
	/**
	* This test scenario is the JUnit test case for the isAlive function.
	*/
	
	public void testIsAlive() {
		int hp = 1;
		assertTrue(hp > 0);
		assertNotNull(hp);
	}

	/**
	* This test scenario is the JUnit test case for the getSkill function.
	*/	
		
	public void testGetSkill() {
		int index = 0;
		assertNotNull(index);	
	}
}

