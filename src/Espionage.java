/**
 * @author - April Domingo and Charles Lee
 * @since - 2014/01/23
 * @version - branch - Espionage Version 1.0
 */

import java.util.Random;
import java.util.Scanner;

/**
 * This class contains the main program and the main functions.
 */

 public class Espionage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Player player = new Player();
		
		do{
			if(pass(rollDice())){
				player.heal(1);
			}else{
				player.takeDamage(1);
			}
			
			player.getHP();
		}while(player.isAlive() && !"die".equals(input.nextLine()));
	}
	
	/**
	 * This function generates a random number between 1 to 6, used for gauging successful or unsuccessful encounters.
	 * @return	random number between 1 and 6
	 */
	
	public static int rollDice(){
		Random rand = new Random();
		int number = rand.nextInt(6)+1;
		
		System.out.println("Dice Roll: "+number);
		
		return number;
	}
	
	/**
	 * This function determines whether a dice roll is successful or not.
	 * @param	roll	the dice roll
	 * @return	true if roll is successful, false if not
	 */
	
	public static boolean pass(int roll){
		if(roll > 4){
			return true;
		}
		
		return false;
	}
}
