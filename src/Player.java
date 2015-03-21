/**
 * This class contains the player attributes and functions.
 */

 public class Player{
	private int hp;
	private int[] skill = new int[6];
	
	Player(int hp, int guns, int lockpick, int medicine, int science, int sneak, int speech){
		this.hp = hp;
		
		skill[0] = guns;
		skill[1] = lockpick;
		skill[2] = medicine;
		skill[3] = science;
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
	
	public int getSkill(int index){
		return skill[index];
	}
}