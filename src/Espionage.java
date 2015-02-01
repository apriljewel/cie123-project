/**
 * @author - April Domingo and Charles Lee
 * @since - 2014/01/23
 * @version - branch - Espionage Version 1.0
 */

import java.util.Random;
import java.util.Scanner;

public class Espionage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		do{
			if(pass(rollDice())){
				Player.heal(1);
			}else{
				Player.takeDamage(1);
			}
			
			Player.getHP();
		}while(Player.isAlive() && !"die".equals(input.nextLine()));
	}
	
	public static int rollDice(){
		Random rand = new Random();
		int number = rand.nextInt(6)+1;
		
		System.out.println("Dice Roll: "+number);
		
		return number;
	}
	
	public static boolean pass(int roll){
		if(roll > 4){
			return true;
		}
		
		return false;
	}
}
