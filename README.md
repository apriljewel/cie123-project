#Espionage

Espionage is a Java-based text-based desktop application for an interactive role-playing game with mechanics inspired by games such as *The Game of Life* in its storytelling and *Dungeons & Dragons* in its usage of abilities.

*The Game of Life*, or simply just *LIFE*, is a board game originally created in 1860 by Milton Bradley. The game simulates a person's travels through his or her life, from college to retirement, with jobs, marriage, and possible children along the way. As the player moves along the game, he or she gets to choose which path to take. Similarly, as the story progesses, players of Espionage will get to choose which action to take, and these choices determine the ending of the story.

*Dungeons & Dragons*, or *D&D* or *DnD* for short, is a fantasy tabletop rope-playing game originally designed by Gary Gygax and Dave Anderson, and first published in 1974 by Tactical Studies Rules, Inc. (TSR) and has been published by Wizards of the Coast (a subsidiary of Hasbro) since 1997. A player determines his or her character's ability scores, which consists of Strenth, Constitution, Dexterity, Intelligence, Wisdom, and Charisma. The outcome of some skill-dependent actions are determined by rolling dice.

For this version of *Espionage*, a player's ability scores, referred to as skills, are all preset to 3. The abilties consist of Speech, Perception, Guns, Sneak, Medicine, and Lockpick. These skills were inspired by the skills in the *Fallout* series of games created by Interplay Entertainment. The player's hit points and attack power are preset to 10 and 1 respectively. A passing dice roll is also preset to 5 and above.

######Purpose

This document describes the function and requirements needed for the text-based software *Espionage*. It is intended primarily for the team members who will be developing, testing and documenting the project.

######Scope

*Espionage* will be a text-based role-playing game in which players use text commands to control their character and influence the environment and are given choices that affect the game as it is played. It is intended for the entertainment of the user and for anyone who is interested in playing a text-based adventure game.

######Definitions, Acronyms, and Abbreviations

* *Interactive Game*: a game where the output relies on the input of the user.
* *Role-playing Game*: a video game genre where the player controls the actions of a protagonist (or several adventuring party members) immersed in some well-defined world.
* *Skill*: an attribute or piece of data that describes to what extent a fictional character in a role-playing game possesses a specific natural, in-born characteristic common to all characters in the game, and specifically determines the maximum number of dice rolls a player can make to pass an encounter.

######Product Perspective and Functions

*Espionage* is a Java-based text-based software product which will have mechanics based on the board game *The Game of Life* and *Dungeons & Dragons*. Otherwise, it does not interface with other products of projects. The game will be played by one player. The user interface will include the mouse and the keyboard. The player will determine the movement of their chosen character within the game. A scenario based on the player’s character’s position in the game will be randomly selected for them. Dice rolls using random numbers will determine the outcomes of every scenario. Life points may be added or deducted from the player’s character. The game will end if the player’s character loses all of its life points or after a set amount of turns. The game must be easy to use and understand, yet challenging to play.

######User Characteristics

*Espionage* will have one primary user class who are the players of the game. The users will need basic computer skills and are able to understand game rules. Familiarity with the mechanics of *The Game of Life* and *Dungeons & Dragons* may help but is not required.

######General Constraints

Time constraint may limit the features and options that may be implemented in the game. The text-based software product must be completed and releasable and tested thoroughly by the end of the semester. Also, the team members are not highly skilled with the Java programming language. This may add constraints to the development of the features and functionality of the game.

######Assumptions and Dependencies

It is assumed that the Java programming language can be used to create and develop this text-based software product. It is also assumed that the user class will have the minimum user characteristics and will have access to a computer and the game. The development of the project is dependent on GitHub for its Git repository hosting service and source code management functionality. The project relies on its features such as task management, bug tracking and feature requests.
