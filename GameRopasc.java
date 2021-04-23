/*
Name: Raul Rivera Ortiz
Course: CSC 122 001
Project #3
Project description:
		I made a game to allow a user to play Rock, Paper and Sissors against the Computer. The user could write rock or paper or scissors and will be able
		to see the opponent move. Also, the user will see a record of how many games, wins, losses and ties in each game. The user can play as many times as 
		he wants and to exit the user has to write quit. At the end the user will se a a message if he won more times to lost, 
		lost more times to won or won and lost equal number of games.
Purpose:
	1. Become familiar importing Scanner class for create a input.
	2. Become familiar with while loops.
	3. Become familiar geting string inputs.
	4. Become familiar with if, else if and else Statements.
	5. Entertain the user.
	
What the program does?:
	The program print:
		Welcome to Rock, Paper, Scissors!
		What is your move? To make a move, enter rock, paper, or scissors.
		To quit the game, enter quit.
	If the user writes any letter or word that is not rock, paper or scissors, it will give the following message:
		Your move isn't valid!
	And it will show you an update of the number of games, wons, losses, ties and it will invite you to continue playing showing:
		What is your move? To make a move, enter rock, paper, or scissors.
		To quit the game, enter quit.
	Then, if the user write rock, paper or scissors, it will show after each game:
		Opponent choice
		Number of games played
		Number of wins
		Number of losses
		Number of ties
	The user can play as many times as he wants and to exit the user has to write quit.
	Then, if the user write quit, it will show a message depending of the score:
		You won more games than you lost! or
		You lost more games than you won! or
		You won and lost an equal number of games!
	And the final message:
		Thanks for playing Rock, Paper, Scissors!
		
How you tested the program:
	First, I wrote my code on a Notepad.
	Then, I save the file in a folder that I made and call it Java-projects.
	Then, I opened the Command Prompt and moved it to the same Path with the command: cd
	Then I compiled the file with the command: javac GameRopasc.java and
	a new file was created with the same name but with the class extension.
	Then I ran the program with the command: java GameRopasc 
	NOTE: 
		I use the package java.util.Scanner to import the Scanner class and make inputs.		
		I create a main method to handle loops and statements.
		I use in.nextLine(), to able to get string inputs.
		I use while so that the user can play as many times as he wants.
		I create and if, else if and else conditions for eliminate the limitacions.
		
Limitations if any in the program:
	No limitations.
*/

import java.util.Scanner; //Import the Scanner class.

public class GameRopasc { //Open class GameRopasc.
  public static void main(String[] args) { //Start main method.  
		
		Scanner in = new Scanner(System.in); //Initialize the Scanner.
		System.out.println("\nWelcome to Rock, Paper, Scissors!\n"); //Print a welcome message.
		
		int count = 0; //Create a count variable to show the numbers of games.
		int wins = 0; //Create a wins variable to show the number of wins.
		int losses = 0; //Create a losses variable to show the number of losses.
		int ties = 0; //Create a ties variable to show the number of ties.
				
		while(true) { //Use a while(true) loop and only break the loop if the user wants to quit.	
			
			System.out.print("What is your move? To make a move, enter rock, paper, or scissors. \nTo quit the game, enter quit. "); //Print a question for start the game.
			String myMove = in.nextLine(); //Create a String variable myMove and get the user's move through user input.
			
			if(myMove.equals("quit")) { //Check if the user wants to quit the game.
				break; //Finish thw while loop.
			} //Close if statement.
		
			if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) { //Check if the user's move is valid (rock, paper, or scissors).
				System.out.println("\nYour move isn't valid!"); //Print your move isn't valid!
			} else { //Else.
				
				int rand = (int)(Math.random()*3); //Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2.							
				String opponentMove = ""; //Convert the random number to a string using conditionals and print the opponent's move.
				
				if(rand == 0) { //Check if rand is equal to 0.
					opponentMove = "rock"; //Assign variable opponentMove to the string rock.
				} else if(rand == 1) { //Else if check rand is equal to 1.
					opponentMove = "paper"; //Assign variable opponentMove to the string paper.
				} else { //Else.
					opponentMove = "scissors"; //Assign variable opponentMove to the string scissors.
				} //Close else statement.
				System.out.println("Opponent move: " + opponentMove); //Print Opponent move.
					
				//Print the results of the game: tie, lose, win
				if(myMove.equals(opponentMove)) { //Check if myMove is equal to the opponentMove.
					System.out.println("\nIt's a tie!"); //Print It's a tie!
					ties++; //Increments the value of the variable ties by one.
					count++; //Increments the value of the variable count by one.
				} else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
				//Else check if myMove is rock and the opponentMove is scissors or myMove is scissors and the opponentMove is paper or myMove is paper and the opponentMove is rock.
					System.out.println("\nYou won!"); //Print you won!
					wins++; //Increments the value of the variable wins by one.
					count++; //Increments the value of the variable count by one.
				} else { //Else.
					System.out.println("\nYou lost!"); //Print you lost!
					losses++; //Increments the value of the variable losses by one.
					count++; //Increments the value of the variable count by one.
				} //Close else statement.
			} //Close else statemnt.
						
			System.out.println("You play "+count+" games!"); //Print the number of games.
			System.out.println("You have won "+wins+" games!"); //Print the number of wins.
			System.out.println("You have lost "+losses+" games!"); //Print the number of losses.
			System.out.println("You have tie "+ties+" games!\n"); //Print the number of ties.
		} //Close while loop.
				
		if(wins > losses) { //Check if the user won more games than lost games.
			System.out.println("\nYou won more games than you lost!"); //Print You won more games than you lost!
		} else if(wins < losses) { //Else Check if the user won less games than lost games.
			System.out.println("\nYou lost more games than you won!"); //Print You lost more games than you won!
		} else { //Else.
			System.out.println("\nYou won and lost an equal number of games!"); //Print You won and lost an equal number of games!
		} //Close else statement.
					
		System.out.println("Thanks for playing Rock, Paper, Scissors!"); //Print a final message for the user
  } //Close method main.
} //Close class GameRopasc.

/*

Microsoft Windows [Version 10.0.19041.804]
(c) 2020 Microsoft Corporation. All rights reserved.

C:\Users\Owner>cd C:\Users\Owner\Java-projects

C:\Users\Owner\Java-projects>javac GameRopasc.java

C:\Users\Owner\Java-projects>java GameRopasc

Welcome to Rock, Paper, Scissors!

What is your move? To make a move, enter rock, paper, or scissors.
To quit the game, enter quit. t

Your move isn't valid!
You play 0 games!
You have won 0 games!
You have lost 0 games!
You have tie 0 games!

What is your move? To make a move, enter rock, paper, or scissors.
To quit the game, enter quit. hello

Your move isn't valid!
You play 0 games!
You have won 0 games!
You have lost 0 games!
You have tie 0 games!

What is your move? To make a move, enter rock, paper, or scissors.
To quit the game, enter quit. rock
Opponent move: scissors

You won!
You play 1 games!
You have won 1 games!
You have lost 0 games!
You have tie 0 games!

What is your move? To make a move, enter rock, paper, or scissors.
To quit the game, enter quit. paper
Opponent move: paper

It's a tie!
You play 2 games!
You have won 1 games!
You have lost 0 games!
You have tie 1 games!

What is your move? To make a move, enter rock, paper, or scissors.
To quit the game, enter quit. scissors
Opponent move: scissors

It's a tie!
You play 3 games!
You have won 1 games!
You have lost 0 games!
You have tie 2 games!

What is your move? To make a move, enter rock, paper, or scissors.
To quit the game, enter quit. rock
Opponent move: rock

It's a tie!
You play 4 games!
You have won 1 games!
You have lost 0 games!
You have tie 3 games!

What is your move? To make a move, enter rock, paper, or scissors.
To quit the game, enter quit. paper
Opponent move: scissors

You lost!
You play 5 games!
You have won 1 games!
You have lost 1 games!
You have tie 3 games!

What is your move? To make a move, enter rock, paper, or scissors.
To quit the game, enter quit. quit

You won and lost an equal number of games!
Thanks for playing Rock, Paper, Scissors!

C:\Users\Owner\Java-projects>dir
 Volume in drive C has no label.
 Volume Serial Number is 9242-0A43

 Directory of C:\Users\Owner\Java-projects

02/16/2021  05:10 PM    <DIR>          .
02/16/2021  05:10 PM    <DIR>          ..
08/16/2019  08:34 AM               923 BMI1.java
08/16/2019  08:34 AM             1,991 BMI2.java
08/16/2019  08:34 AM             2,353 BMI3.java
08/16/2019  09:33 AM               395 BMICalculator.java
08/16/2019  09:33 AM               599 BMICalculator2.java
08/16/2019  09:35 AM               118 Bug1.java
08/16/2019  09:35 AM               118 Bug2.java
08/16/2019  09:35 AM               117 Bug3.java
08/16/2019  09:35 AM               112 Bug4.java
08/16/2019  09:35 AM               113 Bug5.java
08/16/2019  09:35 AM               114 Bug6.java
08/16/2019  08:34 AM               143 CauseException.java
08/16/2019  08:34 AM               561 CountLetters.java
08/16/2019  09:33 AM               400 Dashes.java
02/04/2021  12:02 AM             1,279 Diamond.class
02/04/2021  12:06 AM            11,880 Diamond.java
08/16/2019  08:34 AM               624 Doubles.java
08/16/2019  09:35 AM               428 DrawBoxes.java
08/16/2019  09:35 AM               349 DrawBoxes2.java
08/16/2019  09:35 AM               349 DrawBoxes3.java
08/16/2019  09:33 AM               384 DrawCone.java
08/16/2019  09:33 AM               473 DrawCone2.java
08/16/2019  09:33 AM             1,626 DrawFigure.java
08/16/2019  09:33 AM             1,736 DrawFigure2.java
08/16/2019  09:33 AM             1,627 DrawFigure3.java
08/16/2019  09:35 AM             1,243 DrawFigures1.java
08/16/2019  09:35 AM             1,522 DrawFigures2.java
08/16/2019  09:35 AM             1,196 DrawFigures3.java
08/16/2019  09:35 AM             1,258 DrawFigures4.java
01/22/2021  02:49 PM               654 DrawFiveBoxes.class
08/16/2019  09:35 AM               480 DrawFiveBoxes.java
08/16/2019  09:33 AM               381 DrawV.java
08/16/2019  09:33 AM               902 Equal.java
08/16/2019  08:34 AM               600 ExamineInput1.java
08/16/2019  08:34 AM               749 ExamineNumbers1.java
08/16/2019  08:34 AM             1,249 ExamineNumbers2.java
08/16/2019  08:34 AM               264 ExamineNumbers2.log2
01/20/2021  10:09 PM               429 Example.class
01/20/2021  10:15 PM               124 Example.java
08/16/2019  08:34 AM               460 Factorial.java
08/16/2019  08:34 AM               365 Factorial2.java
08/16/2019  08:34 AM               229 Fencepost1.java
01/27/2021  11:06 AM             1,008 Figure.class
01/27/2021  10:57 AM             1,202 Figure.java
08/16/2019  09:35 AM               406 FooBarBazMumble.java
02/16/2021  08:44 PM             2,405 GameRopasc.class        (java compile)
02/16/2021  08:43 PM             7,263 GameRopasc.java         (java file)
02/16/2021  04:49 PM             1,984 GameRps.class
02/16/2021  12:45 AM             3,735 GameRps.java
08/16/2019  08:34 AM               787 Hailstone.java
01/20/2021  10:17 PM               417 Hello.class
08/16/2019  09:35 AM               119 Hello.java
08/16/2019  09:35 AM               124 Hello2.java
08/16/2019  09:35 AM               256 Hello3.java
01/22/2021  06:20 PM               573 HelloWorld.class
01/22/2021  06:18 PM             3,692 HelloWorld.java
08/16/2019  09:35 AM               207 Infinite.java
02/16/2021  05:08 PM             1,831 Main.class
08/16/2019  09:35 AM               129 Marty.java
08/16/2019  09:35 AM               198 MissingSemicolon.java
01/27/2021  08:17 PM                 9 new 1.txt
08/16/2019  09:35 AM               271 NewFun.java
08/16/2019  08:34 AM               683 NumberGuess1.java
08/16/2019  08:34 AM             1,777 NumberGuess2.java
02/14/2021  07:47 PM             2,196 NumberGuess3.class
08/16/2019  08:34 AM             2,597 NumberGuess3.java
08/16/2019  08:34 AM               386 OutOfBoundsExample.java
08/16/2019  08:34 AM               801 Pick2.java
02/15/2021  02:09 PM             1,032 RandomNum.class
02/15/2021  02:08 PM               779 RandomNum.java
08/16/2019  08:34 AM             1,186 Robust.java
08/16/2019  08:34 AM               217 Roundoff.java
08/16/2019  08:34 AM               282 Roundoff2.java
08/16/2019  09:33 AM               253 Sample.java
08/16/2019  09:33 AM               340 ScopeExample.java
08/16/2019  08:34 AM               480 Sentinel.java
01/29/2021  10:59 PM               591 Stars.class
01/29/2021  10:59 PM               274 Stars.java
08/16/2019  09:33 AM               357 Time.java
08/16/2019  09:35 AM                99 Ugly.java
08/16/2019  09:35 AM               119 Ugly2.java
08/16/2019  09:33 AM               366 WriteSquares.java
08/16/2019  09:33 AM               192 WriteSquares2.java
08/16/2019  09:35 AM                27 WrongFileName.java
              84 File(s)         82,567 bytes
               2 Dir(s)  922,165,637,120 bytes free

C:\Users\Owner\Java-projects>

*/