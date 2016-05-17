import java.awt.Color;
import java.util.Scanner;
public class TicTacToe
	{
		static String name;
		static String ticArray [] [] = new String [3][3];
		static String playerMove;
		static String move;
		static String aiMove;
		static int row =0;
		static int col=0;
		static int aiRow=0;
		static int aiCol=0;	
		static boolean gameContinues;
		static boolean a1;
		static boolean a2;
		static boolean a3;
		static boolean b1;
		static boolean b2;
		static boolean b3;
		static boolean c1;
		static boolean c2;
		static boolean c3;
		public static void main(String[] args)
			{
				greetPlayer();
				fillBlanks();
					{
						gameContinues = true;
						while(gameContinues)
							{
								playerMove();
								checkForOwnOpenSpace();
								aiMove();
							
							}
						if (gameContinues = false)
							{
								System.out.println("Good game!!!!");
								System.exit(0);
							}
					}
			}
		public static String greetPlayer()
		{
			System.out.println("Hi what's your name?");
			Scanner userInput= new Scanner(System.in);
			name = userInput.nextLine();
			System.out.println("Hi"+ " " + name + "!"+ " "+ "Time to play some tic tac toe");
			return name;
		}
//		public static void makeBoard()
//			{
//				ticArray[0][0]ticArray[0][1]+ticArray[0][2];
//			
//				ticArray[1][0] ticArray[1][1] ticArray[1][2]
//			
//				ticArray[2][0]ticArray[2][1]ticArray[2][2]
//	
//			}
		public static void  fillBlanks()
		{
			for (int i = 0;i<3;i++)
				{
				System.out.println("");
				for(int p= 0;p<3;p++)
					{
				System.out.print(ticArray[i][p]="");
					}
				}
			System.out.println("You are X's");
		}
		public static String playerMove()
		{
			System.out.println();
			System.out.println(" Where would you like to move?");
			Scanner move= new Scanner(System.in);
			playerMove = move.nextLine();
			switch(playerMove.substring(0,1))
			{
				case "A":
				case "a":
						{
					row = 0;
					break;
						}
				case "B":
				case "b":
				{
					row=1;
					break;
				}
				case "C":
				case "c":
				{
					row=2;
					break;
				}
			}
			col = Integer.parseInt(playerMove.substring(1))-1;
			System.out.println();
			return playerMove;
		}
		public static void checkForOwnOpenSpace()
		{
			if(ticArray[row][col].equals("X"))
				{
					System.out.println("Invalid Move.");
					playerMove();
				}
			else if(ticArray[row][col].equals("O"))
				{
					System.out.println("Invalid Move.");
					playerMove();
				}
			else
				{
					
					doYourMove();
					
				}
		}
		public static void doYourMove()
		{
			
			if(ticArray[row][col] == ticArray [0][0])
				{
					playerMove= "X";
					ticArray[row][col]=playerMove;
					 a1 = true;
					 TicCanvas.repaint();
				}
			 else if(ticArray[row][col] == ticArray [0][1])
				 {
					 
				 }
				

	
		}
		public static void aiMove()
		{
			aiMove="O";
			aiRow=(int)(Math.random()*3);
			aiCol=(int)(Math.random()*3);
		}
	
//		public static void checkWinConditions()
//			{
//				if(		
//					(ticArray[0][0].equals( ticArray[0][1].equals(( ticArray[0][2]))) && !ticArray[0][0].equals(" ")) ||
//					(ticArray[1][0].equals( ticArray[1][1].equals(( ticArray[1][2]))) && !ticArray[0][0].equals(" ")) ||
//					(ticArray[2][0].equals( ticArray[2][1].equals(( ticArray[2][2]))) && !ticArray[0][0].equals(" ")) ||
//					(ticArray[0][0].equals( ticArray[1][0].equals(( ticArray[2][0]))) && !ticArray[0][0].equals(" ")) ||
//					(ticArray[0][1].equals( ticArray[1][1].equals(( ticArray[2][1]))) && !ticArray[0][0].equals(" ")) ||
//					(ticArray[0][2].equals( ticArray[1][2].equals(( ticArray[2][2]))) && !ticArray[0][0].equals(" ")) ||
//					(ticArray[0][0].equals( ticArray[1][1].equals(( ticArray[2][2]))) && !ticArray[0][0].equals(" ")) ||
//					(ticArray[0][2].equals( ticArray[1][1].equals(( ticArray[2][0]))) && !ticArray[0][0].equals(" "))
//							)
//					{
//						System.out.println(" You Have won!!!!");	
//						System.exit(0);
//					}
//	
//						
//			}

	
	}
