package main;
/**
 * This class contains the player attributes and functions.
 */

 public class Player{
	private int hp;
	private int[] skill = new int[6];
	public static final int GUNS = 0, LOCKPICK = 1, MEDICINE = 2, PERCEPTION = 3, SNEAK = 4, SPEECH = 5;
	public static String[] skillNames = {"GUNS", "LOCKPICK", "MEDICINE", "PERCEPTION", "SNEAK", "SPEECH"};
	
	Player(int hp, int guns, int lockpick, int medicine, int perception, int sneak, int speech) {
		this.hp = hp;
		skill[0] = guns;
		skill[1] = lockpick;
		skill[2] = medicine;
		skill[3] = perception;
		skill[4] = sneak;
		skill[5] = speech;
	}
	
	/**
	 * This function decreases the health points of the player.
	 * @param	damage	the amount to subtract from the player's health points
	 * @return	the modified health points
	 */
	 
	public int takeDamage(int damage){
		hp -= damage;
		
		return hp;
	}
	
	/**
	 * This function increases the health points of the player.
	 * @param	regen	the amount to add to the player's health points
	 * @return	the modified health points
	 */
	 
	public int heal(int regen){
		hp += regen;
		
		return hp;
	}
	
	/**
	 * This function returns the health points of the player.
	 * @return	the player's health points
	 */
	
	public int getHP(){
		System.out.println("HP: "+hp);
		return hp;
	}
	
	/**
	 * This function determines whether the player's health points is still greater than 0 or not.
	 * @return	true if the player is alive, false if dead
	 */
	 
	public boolean isAlive(){
		if(hp > 0){
			return true;
		}
		
		System.out.println("You are dead.");
		hp = 0;
		return false;
	}
	
	/*
	 * This function is used to get the amount of dice roll tries a player has for a specified skill
	 * @param	index	the index of the skill
	 * @return	the value of the skill at the specified index
	 */
	
	public int getSkill(int index){
		return skill[index];
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