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
				String d;
				player.heal(5);
				System.out.println("You rush back towards the building and see the "
						+ "same man quickly turning on the next block. Do you 1) chase "
						+ "after him or 2) call your partner in the building?");
				
				d = in.nextLine();
				
				if (d == "1"){
					String h;
					player.heal(2);
					System.out.println("");
					
				} else if (d == "2") {
					String i;
					player.takeDamage(2);
					System.out.println("");
				
				}
				
			} else if (b == "2") {
				String e;
				player.takeDamage(3);
				System.out.println("The other end rings but no one picks up. Do you "
						+ "1) keep trying or 2) enter the building?");
				
				e = in.nextLine();
				
				if (e == "1") {
				
				} else if (e == "2") {
				
				}
			}
			
		} else if (a == "2" ){
			String c;
			player.takeDamage(3);
			System.out.println("You get inside your car and notice you forgot some "
					+ "important papers. You go back to the building, ride "
					+ "the elevator, and as you near your office you see the place"
					+ "completely demolished with everything turned over and bodies "
					+ "on the floor. Do you 1) look for the assassins or 2) get an ally?");
			
			c = in.nextLine();
			
			if (c == "1") {
				player.heal(3);
				System.out.println("");
				
			} else if (c == "2") {
				player.takeDamage(1);
				System.out.println("");
			}
		}
		
	}

}
