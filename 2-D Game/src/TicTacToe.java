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
		public static void main(String[] args)
			{
				greetPlayer();
				fillBlanks();
				makeBoard();
				playerMove();
				doYourMove();
					{
						boolean gameContinues = true;
						while(gameContinues)
							{
								aiMove();
								playerMove();
								checkForOwnOpenSpace();
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
		public static void makeBoard()
			{
				
				System.out.println("  1   2    3");
				System.out.println(" ------------");
				System.out.println("A| "+ ticArray[0][0]+" | "+ ticArray[0][1]+" | "+ ticArray[0][2]+" |");
				System.out.println(" ------------");
				System.out.println("B| "+ ticArray[1][0]+" | "+ ticArray[1][1]+" | "+ ticArray[1][2]+" |");
				System.out.println(" ------------");
				System.out.println("C| "+ ticArray[2][0]+" | "+ ticArray[2][1]+" | "+ ticArray[2][2]+" |");
				System.out.println(" ------------");
			}
		public static void  fillBlanks()
		{
			for (int i = 0;i<3;i++)
				{
				System.out.println(" ");
				for(int p= 0;p<3;p++)
					{
				System.out.print(ticArray[i][p]=" ");
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
					checkWinConditions();
				}
		}
		public static void doYourMove()
		{
			playerMove= "X";
			ticArray[row][col]=playerMove;
			checkWinConditions();
			makeBoard();
		}
		public static void aiMove()
		{
			aiMove="O";
			aiRow= (int)(Math.random()*2)+1;
			aiCol=(int)(Math.random()*2)+1;
			
				if(aiMove.equals(" "))
					{
						ticArray[aiRow][aiCol]=aiMove;
						makeBoard();
						checkWinConditions();
					}
				else
					{
						checkWinConditions();
						aiMove();
						
					}
		}
		public static void checkWinConditions()
			{
				for(int col = 0 ; col < ticArray.length ; col++)
					{
						if(ticArray[0][col].equals("X"))
							{
								if(ticArray[1][col].equals("X"))
									{
										if(ticArray[2][col].equals("X"))
											{
												gameContinues = false;
											}
									}
							}
					}
				for(int row = 0 ; row < ticArray.length ; row++)
					{
						if(ticArray[row][0].equals("X"))
							{
								if(ticArray[row][1].equals("X"))
									{
										if(ticArray[row][2].equals("X"))
											{
												gameContinues = false;
											}
									}
							}
					}
			}
	
	}