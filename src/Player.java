/**
 * This class contains the player attributes and functions.
 */

 public class Player{
	private static int HP = 15;
	public static int GUNS = 2, LOCKPICK = 4, MEDICINE = 4, SCIENCE = 4, SNEAK = 4, SPEECH = 4;
	
	/**
	 * This function decreases the health points of the player.
	 * @param	damage	the amount to subtract from the player's health points
	 * @return	the modified health points
	 */
	 
	public static int takeDamage(int damage){
		HP -= damage;
		
		return HP;
	}
	
	/**
	 * This function increases the health points of the player.
	 * @param	regen	the amount to add to the player's health points
	 * @return	the modified health points
	 */
	 
	public static int heal(int regen){
		HP += regen;
		
		return HP;
	}
	
	/**
	 * This function returns the health points of the player.
	 * @return	the player's health points
	 */
	
	public static int getHP(){
		System.out.println("HP: "+HP);
		return HP;
	}
	
	/**
	 * This function determines whether the player's health points is still greater than 0 or not.
	 * @return	true if the player is alive, false if dead
	 */
	 
	public static boolean isAlive(){
		if(HP > 0){
			return true;
		}
		
		System.out.println("You are dead.");
		HP = 0;
		return false;
	}
}