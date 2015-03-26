package main;

import static org.junit.Assert.*;

import org.junit.*;

public class TestEspionage {
	
	@Test
	public void testRollDice() {
		assertTrue(Espionage.rollDice() > 0);
		assertTrue(Espionage.rollDice() <= 6);
		assertNotNull(Espionage.rollDice());
	}

	@Test
	public void testPass() {
		assertFalse(Espionage.pass(10));
		assertFalse(Espionage.pass(0));
		assertTrue(Espionage.pass(6));
		assertFalse(Espionage.pass(1));
		assertNotNull(Espionage.pass(500));
	}

	@Test
	public void testEncounter() {
		//assertNotNull(Espionage.encounter(5));
		assertTrue(true);
	}

	@Test
	public void testBattle() {
		assertFalse(Espionage.battle(0, 0, 0, 0));
		assertTrue(Espionage.battle(1, 0, 0, 0));
	}

	@Test
	public void testClose() {
		assertTrue(true);
	}

}
