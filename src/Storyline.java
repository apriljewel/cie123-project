/**
 * @author - April Domingo and Charles Lee
 * @since - 2014/01/23
 * @version - branch - Espionage Version 1.0
 */

import java.util.Scanner;

/**
 * This class contains the storyline of Espionage.
 */

public class Storyline {
	public static void main (String[] args){
		String a;
		System.out.println("You've just left the spy agency when you "
				+ "instinctly spot that stranger's face for the third "
				+ "time. You think to yourself, 'Who is this man?' "
				+ "He's got a black hat and sunglasses with a long coat "
				+ "with his hands snuggly placed in his pockets. 'The "
				+ "typical appearance of someone mischievous,' you facetiously "
				+ " think to yourself again. Do you  1) approach the man or  "
				+ "2) walk past him like the previous times?");
		a = in.nextLine();
		
		if (a == "1") {
			player.getSkill(5);
			String b;
			player.heal(5);
			System.out.println("'I've noticed you around before, how may I help "
					+ "you?' you ask. But just before you were able to finish he hastily waves "
					+ " his hand and shrugs as if to say he doesn't want to be "
					+ "bothered and walks away unsteadly. You leave the scene behind and get to your car. "
					+ "As you close the door you notice people rushing out of the agency. "
					+ "Do you 1) get out and see what's going on or 2) call your partner "
					+ "who hasn't left the building?");
			b = in.nextLine();
			
			if (b == "1") {
				String c;
				player.heal(5);
				System.out.println("You rush back towards the building and see the "
						+ "same man quickly turning on the next block. Do you 1) chase "
						+ "after him or 2) call your partner in the building?");
				c = in.nextLine();
				
				if (c == "1"){
					String d;
					player.heal(2);
					System.out.println("You reach the next block as quickly as possible, "
							+ "but as you turn around the corner, you see a door bang "
							+ "close a few meters away. Do you 1) go the same way or "
							+ "2) find an alternative route? ");
					d = in.nextLine();
					
						
					if (d == "1"){
						String e;
						player.heal(1);
						System.out.println("You push the door but it doesn't open. "
								+ "Do you 1) use your gun or 2) use a lockpick?");
						e = in.nextLine();
							
						if (e == "1"){
							player.getSkill(0);
							player.heal(1);
							System.out.println("The lock breaks. You push the door open "
									+ "and find a flight of stairs. You hear someone running up "
									+ "and you point your gun towards the man. You've wasted your "
									+ "last bullet to break the lock. The man aims and shoots you.");
							espionage.encounter(player.getSkill(0));
							System.out.println("The end.");
						} else if (e == "2") {
							player.getSkill(1);
							player.heal(2);
							System.out.println("You wasted around 10 seconds to unlock the door. "
									+ "The man has reached the top of the building and aims his "
									+ "gun at you.");
							espionage.encounter(player.getSkill(0));
							System.out.println("The end.");
						}
					} else if (d == "2"){
						String e;
						player.heal(1);
						System.out.println("You decide to enter the next building through the next "
								+ "door. You reach the rooftop and spot the man still running. Do "
								+ "you 1) try to shoot him or 2) keep chasing him? ");
						e = in.nextLine();
							
							if (e == "1"){
								System.out.println("You face a battle with the assassin.")
								espionage.encounter(player.getSkill(0));
								System.out.println("The end.");
							} else if (e == "2"){
								System.out.println("You outsmart the assin and face a battle with him.")
								espionage.encounter(player.getSkill(0));
								System.out.println("The end.");
							}
					}
					
				} else if (c == "2") {
					String d;
					player.takeDamage(2);
					System.out.println("Your partner answers and you figure out a few "
							+ "men have been shot in your building. The two of you quickly "
							+ "agree to chase the suspect, but as you meet him you see he's been "
							+ "wounded. Do you 1) mend his wound or 2) carry on with your mission?");
					d = in.nextLine();
						if (d == "1"){
							player.getSkill(2);
							player.takeDamage(2);
							String e;
							System.out.println("You re-enter the building to get a medicine kit. "
									+ "Your partner insists on not wasting time and quickly "
									+ "wraps his wound with a roller bandage. Soon after, the two of you "
									+ "are on your way when someone shoots in your direction. Do you 1) "
									+ "shoot back or 2) evade and sneak at the shooter?");
							e = in.nextLine();
								
								if (e == "1"){
									player.takeDamage(1);
									System.out.println("You face a battle with the assassin.")
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
								} else if (e == "2"){
									player.heal(2);
									System.out.println("You wait and ");
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
								}
							
						} else if (d == "2"){
							String e;
							player.takeDamage(1);
							System.out.println("");
							e = in.nextLine();
						}
				}
				
			} else if (b == "2") {
				String c;
				player.takeDamage(3);
				System.out.println("The other end rings but no one picks up. Do you "
						+ "1) keep trying or 2) enter the building?");
				c = in.nextLine();
				
				if (c == "1") {
					String d;
					player.takeDamage(2);
					System.out.println("");
					d = in.nextLine();
				
				} else if (c == "2") {
					String d;
					player.takeDamage(1);
					System.out.println("");
					d = in.nextLine();
				
				}
			}
			
		} else if (a == "2" ){
			String b;
			player.takeDamage(3);
			System.out.println("You ignored your gut feeling. But he was in fact a "
					+ "mischievous man. ");

}
