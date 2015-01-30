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
			System.out.print("Dice Roll: "+rollDice());
		}while(!"/".equals(input.nextLine()));
	}
	
	public static int rollDice(){
		Random rand = new Random();
		int number = rand.nextInt(6)+1;
		return number;
	}
}
