package main;
/**
 * This class contains the player attributes and functions.
 */

 public class Player{
	private int hp, attack;
	private int[] skill = new int[6];
	public static final int GUNS = 0, LOCKPICK = 1, MEDICINE = 2, PERCEPTION = 3, SNEAK = 4, SPEECH = 5;
	public static String[] skillNames = {"GUNS", "LOCKPICK", "MEDICINE", "PERCEPTION", "SNEAK", "SPEECH"};
	
	Player(int hp, int attack, int guns, int lockpick, int medicine, int perception, int sneak, int speech) {
		this.hp = hp;
		this.attack = attack;
		skill[0] = guns;
		skill[1] = lockpick;
		skill[2] = medicine;
		skill[3] = perception;
		skill[4] = sneak;
		skill[5] = speech;
	}
	
	/**
	 * This function returns the health points of the player.
	 * @return	the player's health points
	 */
	
	public int getHP(){
		return hp;
	}
	
	public int getAttack() {
		return attack;
	}
	
	/*
	 * This function is used to get the amount of dice roll tries a player has for a specified skill
	 * @param	index	the index of the skill
	 * @return	the value of the skill at the specified index
	 */
	
	public int getSkill(int index){
		if(index < 0 || index >= skill.length) {
			System.out.println("Skill doesn't exist.");
			return 0;
		} else {
			return skill[index];
		}
	}
	
	/*
	 * This function is used to get the index of a skill by its name.
	 * @param	skillName	the name of the skill
	 * @return	the index of the skill, -1 if the skill doesn't exist 
	 */
	
	public int getSkillIndex(String skillName) {
		for(int i = 0; i < skillNames.length; ++i) {
			if(skillName.equals(skillNames[i])) {
				return i;
			}
		}
		return -1;
	}
}