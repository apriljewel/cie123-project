/**
 * @author - April Domingo and Charles Lee
 * @since - 2014/01/23
 * @version - branch - Espionage Version 1.0
 */

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
								System.out.println("You outsmart the assassin and face a battle with him.")
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
									System.out.println("You wait for your turn which turns "
											+ "into a shoot off.");
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
								}
							
						} else if (d == "2"){
							String e;
							player.takeDamage(1);
							System.out.println("You quickly remember the direction the mischievous man "
									+ "earlier had taken and follow it. To make sure, you ask passersby "
									+ "if they've seen a man you've described and are propitiously "
									+ "directed the right way. Do you 1) try to track down the assassin "
									+ "or 2) try to involve a bigger team on the mission?");
							e = in.nextLine();
							
								if (e == "1"){
									player.takeDamage(1);
									System.out.println("The direction given was pointless. The assassin "
											+ "took a circular route. You and your ally encounter a "
											+ "shoot off with him.");
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
								} else if (e == "2"){
									player.takeDamage(1);
									System.out.println("The mission remains unsolved.");
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
								}
						}
				}
				
			} 	else if (b == "2") {
				String c;
				player.takeDamage(3);
				System.out.println("The other end rings but no one picks up. Do you "
						+ "1) keep trying or 2) enter the building?");
				c = in.nextLine();
				
				if (c == "1") {
					String d;
					player.takeDamage(2);
					System.out.println("The call is answered by another person. He summons you "
							+ "to enter the building to save your partner. Do you 1) follow the instructions "
							+ "or 2) try to call someone else?");
					d = in.nextLine();
					
					if (d == "1"){
						String e;
						player.takeDamage(1);
						System.out.println("You cautiously re-enter the building and head to your office. "
								+ "The mischievous man stood behind your friend. He asks for top secret "
								+ "information but that is against your service. Do you 1) shoot first or"
								+ "2) give him false information.");
						e = in.nextLine();
							
							if (e == "1"){
								player.takeDamage(2);
								System.out.println("You hit the man, but unfortunately he shoots your friend too.");
								espionage.encounter(player.getSkill(0));
								System.out.println("The end.");
							
							} else if (e == "2"){
								player.takeDamage(2);
								System.out.println("The man plays along but senses the deception. He shoots the "
										+ "both of you.");
								espionage.encounter(player.getSkill(0));
								System.out.println("The end.");
							}
						
					} else if (d == "2") {
						String e;
						player.takeDamage(2);
						System.out.println("Surprisingly, the assassin got a hold of this number too. "
								+ "Do you 1) call a third number just to make sure or 2) follow his previous "
								+ "instructions?");
						e = in.nextLine();
						
							if (e == "1"){
								player.takeDamage(2);
								System.out.println("You've underestimated the criminal when he answers for the "
										+ "third time. But another chance is not given. He shoots your friend. And "
										+ "he aims at you through the window.");
								espionage.encounter(player.getSkill(0));
								System.out.println("The end.");
							
							} else if (e == "2"){
								player.takeDamage(2);
								System.out.println("You cautiously re-enter the building and head to your office. "
								+ "The mischievous man stood behind your friend. He asks for top secret "
								+ "information but that is against your service. You face a shoot off.");
								espionage.encounter(player.getSkill(0));
								System.out.println("The end.");
							}
					}
				} else if (c == "2") {
					String d;
					player.takeDamage(1);
					System.out.println("You try to ask the people rushing out what has happened, but "
							+ "no one hears you as they sprint to the exits. Do you 1) follow everyone "
							+ "back outside or 2) follow the urge to serve your job?");
					d = in.nextLine();
						
						if (d == "1"){
							String e;
							player.takeDamage(1);
							System.out.println("As you near the exit, you hear shots just behind "
									+ "the group of people trying to escape. There are more pushing and shoving. "
									+ " Do you 1) try to shoot back or 2) run with the crowd? ");
							e = in.nextLine();
							
								if (e == "1"){
									player.takeDamage(2);
									System.out.println("As you have a hard time trying to aim in the midst "
											+ "of chaos, the assassin sees you and shoots in your "
											+ "direction.");
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
									
								} else if (e == "2"){
									player.heal(1);
									System.out.println("At this point the assassin only wants to get out of the building "
											+ "as quickly as possible. He shoots whoever's in his way. Including you.");
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
								}
							
						} else if (d == "2"){
							String e;
							player.takeDamage(2);
							System.out.println("You cautiously examine each floor. As you reach the third, "
									+ "you hear mumbling voices in a room. You sneak through the door and "
									+ "see the mischievous man from earlier with someone else in "
									+ "similar clothes. As they vigorously go through private files do you "
									+ "1) shoot at them or 2) call for help?");
							e = in.nextLine();
							
								if (e == "1"){
									player.takeDamage(2);
									System.out.println("Mission accomplished!");
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
								
								} else if (e == "2"){
									player.takeDamage(2);
									System.out.println("They hear you before your help arrives. You face a shoot off. "
											+ "Two against one. ");
									espionage.encounter(player.getSkill(0));
									System.out.println("The end.");
								}
						}
				}
			}
			
		} else if (a == "2" ){
			String b;
			player.takeDamage(3);
			System.out.println("You ignored your gut feeling. He was in fact a "
					+ "mischievous man. He quietly follows and stabs you from behind.");
			espionage.encounter(player.getSkill(0));
			System.out.println("The end.");
			
}