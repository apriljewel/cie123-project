package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayer {
	Player player = new Player(0, 1, 2, 3, 4, 5, 6, 7);
	
	@Test
	public void testGetHP() {
		assertEquals(0, player.getHP());
		assertNotNull(player.getHP());
		assertNotEquals(1, player.getHP());
	}

	@Test
	public void testGetAttack() {
		assertEquals(1, player.getAttack());
		assertNotNull(player.getAttack());
		assertNotEquals(2, player.getHP());
	}

	@Test
	public void testGetSkill() {
		assertEquals(2, player.getSkill(0));
		assertNotEquals(2, player.getSkill(1));
		assertEquals(3, player.getSkill(1));
		assertEquals(4, player.getSkill(player.getSkillIndex("MEDICINE")));
		assertEquals(5, player.getSkill(Player.PERCEPTION));
		assertNotNull(player.getSkill(0));
		assertNotNull(player.getSkill(10));
		assertEquals(0, player.getSkill(10));
	}

	@Test
	public void testGetSkillIndex() {
		assertNotNull(player.getSkillIndex("HUMOUR"));
		assertEquals(-1, player.getSkillIndex("ACROBATICS"));
		assertEquals(Player.SPEECH, player.getSkillIndex("SPEECH"));
		assertEquals(3, player.getSkillIndex(Player.skillNames[3]));
		assertNotEquals(6, player.getSkillIndex(Player.skillNames[1]));
	}

}
