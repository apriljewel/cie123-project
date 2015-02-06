/**
 * This class contains the player attributes and functions.
 */

 public class Player{
	private static int hp = 15;
	
	/**
	 * This function decreases the HP of the player.
	 * @param	damage	the amount to subtract from the player's HP
	 * @return	the modified HP
	 */
	 
	public static int takeDamage(int damage){
		hp -= damage;
		
		return hp;
	}
	
	/**
	 * This function increases the HP of the player.
	 * @param	regen	the amount to add to the player's HP
	 * @return	the modified HP
	 */
	 
	public static int heal(int regen){
		hp += regen;
		
		return hp;
	}
	
	/**
	 * This function returns the HP of the player.
	 * @return	the player's HP
	 */
	
	public static int getHP(){
		System.out.println("HP: "+hp);
		return hp;
	}
	
	/**
	 * This function determines whether the player's HP is still greater than 0 or not.
	 * @return	true if the player is alive, false if dead
	 */
	 
	public static boolean isAlive(){
		if(hp > 0){
			return true;
		}
		
		System.out.println("You are dead.");
		hp = 0;
		return false;
	}
}