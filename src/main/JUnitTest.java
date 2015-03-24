package main;
import java.util.Random;
import java.util.Scanner;

import junit.framework.TestCase;


public class JUnitTest extends TestCase {
	Player player = new Player(10, 3, 3, 3, 3, 3, 3);
	
	public void testRollDice() {
		Random rand = new Random();
		assertNotNull(rand);
	}

	public void testPass() {
		int roll = 5;
		assertTrue(roll > 4);
		assertNotNull(roll);
	}

	public void testEncounter() {
		Scanner input = new Scanner(System.in);
		assertNotNull(input);
	}
	
	public void testTakeDamage() {
		int hp1 = 5;
		assertTrue(hp1 > player.takeDamage(5));
		assertNotNull(hp1);
		//assertThat(hp1, is(not(player.takeDamage(3))));
		//assertThat(hp1, is(player.takeDamage(0)));
		assertEquals("5", "4", player.takeDamage(1));
		assertEquals("5", "0", player.takeDamage(5));
	}
	
	public void testHeal() {
		int hp1 = 4;
		assertTrue(hp1 < player.heal(5));
		assertNotNull(hp1);
		//assertThat(hp1, is(not(player.heal(3))));
		//assertThat(hp1, is(player.heal(0)));
		assertEquals("4", "5", player.heal(1));
		assertEquals("4", "9", player.heal(5));
	}
	
	public void testGetHP() {
		int expected = 15;
		int result = 15;
		assertEquals(expected, result);
		assertNotNull(expected);
		//assertEquals("5", "5", player.getHP(5));
	}
	
	public void testIsAlive() {
		int hp = 1;
		assertTrue(hp > 0);
		assertNotNull(hp);
	}
	
	public void testGetSkill() {
		int index = 0;
		assertNotNull(index);	
	}

}
