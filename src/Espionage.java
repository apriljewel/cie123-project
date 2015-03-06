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
		Player player = new Player(10, 3, 3, 3, 3, 3, 3);
		
		System.out.println("Encounter using Guns Skill of "+player.getSkill(1));
		encounter(player.getSkill(1));
	}
	
	/**
	 * This function generates a random number between 1 to 6, used for gauging successful or unsuccessful encounters.
	 * @return	random number between 1 and 6
	 */
	
	public static int rollDice(){
		Random rand = new Random();
		int number = rand.nextInt(6)+1;
		
		System.out.print("Dice Roll: "+number);
		
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
	
	/**
	 * This function determines the outcome of an encounter.
	 * @param	skill	the skill needed for the encounter
	 * @return	true if encounter is successful, false if not
	 */
	
	public static boolean encounter(int skill){
		Scanner input = new Scanner(System.in);
		
		for(int i = skill; i > 0; i--){
			input.nextLine();
			System.out.print(i+": ");
			if(pass(rollDice())){
				System.out.println("\nYou passed!");
				return true;
			}
		}
		
		System.out.println("\nYou failed!");
		return false;
	}
}
