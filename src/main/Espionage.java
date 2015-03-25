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
		final int SCENARIO = 0, CHOICE = 1, TEST = 3, SEEK = 4, READ = 5;
		int state = READ;
		
		Player player = new Player(10, 3, 3, 3, 3, 3, 3);
		Scanner storyline = null;
		String filename = "Storyline.txt";
		
		try {
			storyline = new Scanner(new BufferedReader(new FileReader("src/"+filename)));
			String storyLine = "";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
			
			List<String> choices = new ArrayList<String>();
			
			String scenarioHash = "";
			String choice = "";
			
			boolean gameOver = false;
			
			while(!gameOver) {
				if(!storyline.hasNextLine()) {
					storyline.close();
					storyline = new Scanner(new BufferedReader(new FileReader("src/"+filename)));
				}
				
				switch(state) {
					case SCENARIO:
						if(storyLine.contains("[")) {
							state = CHOICE;
						} else if(storyLine.contains("<")) {
							state = TEST;
						} else {
							System.out.println(storyLine);
							storyLine = storyline.nextLine();
						}
						break;
					case CHOICE:
						if(storyLine.contains("[")) {
							String choiceHash = storyLine.substring(storyLine.indexOf("[")+1, storyLine.indexOf("]"));
							if(choiceHash.equals("END")) {
								System.out.println("THE END");
								gameOver = true;
							} else {
								choices.add(choiceHash);
								storyLine = "\t<"+choices.size()+"-"+choiceHash+"> "+storyLine.substring(storyLine.indexOf("]")+1);
								System.out.println(storyLine);
								storyLine = storyline.nextLine();
							}						
						} else {
							System.out.print("----> ");
							choice = input.nextLine();
							try {
								if(Integer.parseInt(choice)-1 >= 0 && Integer.parseInt(choice)-1 < choices.size()){
									choice = choices.get(Integer.parseInt(choice)-1);
									System.out.println("You chose "+choice);
									choices.clear();
									state = SEEK;
								} else {
									System.out.print("Not a choice ");
								}
							} catch (NumberFormatException e) {
								System.out.print("Not a choice ");
							}
						}
						break;
					case TEST:
						if(storyLine.contains("<")) {
							String skill = storyLine.substring(storyLine.indexOf("<")+1, storyLine.indexOf(">"));
							System.out.println("~~~~~");
							System.out.print("Skill test: "+skill+" = "+player.getSkill(player.getSkillIndex(skill)));
							if(encounter(player.getSkill(player.getSkillIndex(skill)))) {
								choice = "PASS";
							} else {
								choice = "FAIL";
							}
							state = SEEK;
							System.out.println("~~~~~");
						}
						break;
					case READ:
						storyLine = storyline.nextLine();
						if(storyLine.contains("(")) {
							state = SCENARIO;
							storyLine = storyline.nextLine();
						}
						break;
					case SEEK:
						storyLine = storyline.nextLine();
						if(storyLine.contains("(")) {
							scenarioHash = storyLine.substring(storyLine.indexOf("(")+1, storyLine.indexOf(")"));
							if(scenarioHash.equals(choice)) {
								state = SCENARIO;
								storyLine = storyline.nextLine();
							}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
						}
						break;
				}
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
