package main;
/**
 * @author - April Domingo and Charles Lee
 * @since - 2014/01/23
 * @version - branch - Espionage Version 1.0
 */

import java.io.*;
import java.util.*;

/**
 * This class contains the main program and the main functions.
 */

public class Espionage {
	static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		//Player player = new Player(10, 3, 3, 3, 3, 3, 3);
		Scanner storyline = null;
		String filename = "Storyline.txt";
		
		try {
			storyline = new Scanner(new BufferedReader(new FileReader("src/"+filename)));
			String storyLine;
			
			List<String> choices = new ArrayList<String>();
			
			String scenarioHash = "";
			String choice = "";
			
			boolean gameOver = false;
			boolean gameStart = true;
			
			while(!gameOver) {
				if(!storyline.hasNextLine()) {
					storyline.close();
					storyline = new Scanner(new BufferedReader(new FileReader("src/Storyline1.txt")));
				}
				storyLine = storyline.nextLine();
				
				if (storyLine.contains("(") || gameStart) {
					if (storyLine.contains("(")) {
						scenarioHash = storyLine.substring(1, storyLine.indexOf(")"));
					}
					
					if(scenarioHash.equals(choice)) {
						if(storyLine.contains("{")) {
							System.out.println("Scenario: "+scenarioHash);
							
							while(!"}".equals(storyLine = storyline.nextLine())) {
								if(storyLine.contains("[")) {
									String choiceHash;
									choiceHash = storyLine.substring(storyLine.indexOf("[")+1, storyLine.indexOf("]"));
									if(choiceHash.equals("END")) {
										gameOver = true;
										storyLine = "\t\tTHE "+choiceHash;
									} else {
										choices.add(choiceHash);
										storyLine = "\t\t<"+choices.size()+"-"+choiceHash+"> "+storyLine.substring(storyLine.indexOf("]", storyLine.indexOf("]")+1)+1);
									}
								}
								
								System.out.println(storyLine);
							}
							
							boolean choiceMade = false;
							
							while(!choiceMade && choices.size() > 0) {
								System.out.print("----> ");
								choice = input.nextLine();
								try {
									if(Integer.parseInt(choice)-1 >= 0 && Integer.parseInt(choice)-1 < choices.size()){
										choiceMade = true;
										choice = choices.get(Integer.parseInt(choice)-1);
										System.out.println("You chose "+choice);
									} else {
										System.out.print("Not a choice ");
									}
								} catch (NumberFormatException e) {
									choiceMade = false;
									System.out.print("Not a choice ");
								}
							}
							
							choices.clear();
							
						}
					}
				}
				
				gameStart = false;
			}
			
			storyline.close();
			close();
			
		} catch(FileNotFoundException e) {
			System.out.println(filename+" not found.");
		}
		
	}
	
	/**
	 * This function generates a random number between 1 to 6, used for gauging successful or unsuccessful encounters.
	 * @return	random number between 1 and 6
	 */
	
	public static int rollDice() {
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
	
	public static boolean pass(int roll) {
		if(roll > 4) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * This function determines the outcome of an encounter.
	 * @param	skill	the skill needed for the encounter
	 * @return	true if encounter is successful, false if not
	 */
	
	public static boolean encounter(int skill) {		
		for(int i = skill; i > 0; i--) {
			input.nextLine();
			System.out.print(i+": ");
			if(pass(rollDice())) {
				System.out.println("\nYou passed!");
				return true;
			}
		}
		
		System.out.println("\nYou failed!");
		return false;
	}
	
	public static void close() {
		input.close();
	}
}
