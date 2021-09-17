import java.util.Scanner;

public class MatrixProject
	{
		public static String [][] checkBoard = new String [6][6];
		public static Scanner userIntInput = new Scanner(System.in);
		public static Scanner userStringInput = new Scanner(System.in);
		public static int row;
		public static int col;
		public static int row2;
		public static int col2;

		public static boolean move = true;
	
		public static void main(String[] args)
		{
			fillBoard();
			while(move)
				{
			displayBoard();
			checkersMove();
			checkersMove2();
				}

		}
		public static void fillBoard()
			{
				for (int row = 0; row < checkBoard.length; row++)
					{
						   for (int col = 0; col < checkBoard[0].length; col++)
							   {
								   checkBoard[row][col] = " ";
							   }
					}
				checkBoard[0][0] = "w";
				checkBoard[0][2] = "w";
				checkBoard[0][4] = "w";
				checkBoard[1][1] = "w";
				checkBoard[1][3] = "w";
				checkBoard[1][5] = "w";
				
				checkBoard[5][1] = "b";
				checkBoard[5][3] = "b";
				checkBoard[5][5] = "b";
				checkBoard[4][2] = "b";
				checkBoard[4][4] = "b";
				checkBoard[4][0] = "b";
			
			}
		public static void displayBoard()
		{
			System.out.println("     1     2     3     4     5     6");
			System.out.println("  ------------------------------------");
			System.out.println("A |  " + checkBoard[0][0] + "  |  " + checkBoard [0][1] + "  |  "  + checkBoard [0][2] + "  |  " + checkBoard [0][3] + "  |  " + checkBoard [0][4] + "  |  " + checkBoard [0][5] + "  |  ");
			System.out.println("  -------------------------------------");
			System.out.println("B |  " + checkBoard[1][0] + "  |  " + checkBoard [1][1] + "  |  "  + checkBoard [1][2] + "  |  " + checkBoard [1][3] + "  |  " + checkBoard [1][4] + "  |  " + checkBoard [1][5] + "  |  ");
			System.out.println("  -------------------------------------");
			System.out.println("C |  " + checkBoard[2][0] + "  |  " + checkBoard [2][1] + "  |  "  + checkBoard [2][2] + "  |  " + checkBoard [2][3] + "  |  " + checkBoard [2][4] + "  |  " + checkBoard [2][5] + "  |  ");
			System.out.println("  -------------------------------------");
			System.out.println("D |  " + checkBoard[3][0] + "  |  " + checkBoard [3][1] + "  |  "  + checkBoard [3][2] + "  |  " + checkBoard [3][3] + "  |  " + checkBoard [3][4] + "  |  " + checkBoard [3][5] + "  |  ");
			System.out.println("  -------------------------------------");
			System.out.println("E |  " + checkBoard[4][0] + "  |  " + checkBoard [4][1] + "  |  "  + checkBoard [4][2] + "  |  " + checkBoard [4][3] + "  |  " + checkBoard [4][4] + "  |  " + checkBoard [4][5] + "  |  ");
			System.out.println("  -------------------------------------");
			System.out.println("F |  " + checkBoard[5][0] + "  |  " + checkBoard [5][1] + "  |  "  + checkBoard [5][2] + "  |  " + checkBoard [5][3] + "  |  " + checkBoard [5][4] + "  |  " + checkBoard [5][5] + "  |  ");
			System.out.println("  -------------------------------------");
		}
		public static void checkersMove()
		{
				displayBoard();
				System.out.println("Player 1, you are w's, what piece do you want to move?");
				String gamePiece = userStringInput.nextLine();
				
				switch(gamePiece.substring(0,1))
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
								row = 1;
								break;
							}
					case "C":
					case "c":
							{
								row = 2;
								break;
							}
					case "D":
					case "d":
							{
								row = 3;
								break;
							}
					case "E":
					case "e":
							{
								row = 4;
								break;
							}
					case "F":
					case "f":
							{
								row = 5;
								break;
							}
							
							
				}
			
				col = Integer.parseInt(gamePiece.substring(1)) - 1;
				if((checkBoard[row][col]).equals(" "))
					{
						System.out.println("There is no piece there, you need to pick a different spot");
						checkersMove();
					}
				else
					{
				checkBoard[row][col] = " ";
					}
				System.out.println("Player 1, where do you want to move?");
				String playerMove = userStringInput.nextLine();
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
								row = 1;
								break;
							}
					case "C":
					case "c":
							{
								row = 2;
								break;
							}
					case "D":
					case "d":
							{
								row = 3;
								break;
							}
					case "E":
					case "e":
							{
								row = 4;
								break;
							}
					case "F":
					case "f":
							{
								row = 5;
								break;
							}	
				}
				col = Integer.parseInt(playerMove.substring(1)) - 1;
				if((checkBoard[row][col]).equals("b") || (checkBoard[row][col]).equals("b"))
					{
						System.out.println("There is a piece there, you cannot move there");
						checkersMove();
					}
				
				checkBoard[row][col] = "w";
//				if((checkBoard[row - 1][col - 1]).equals("b"))
//					{
//				checkBoard[row - 1][col + 1] = " ";
//					}
				displayBoard();
		
		}
		public static void checkersMove2()
		{
			System.out.println("Player 2, what piece do you want to move?");
			String game2Piece = userStringInput.nextLine();
			
			switch(game2Piece.substring(0,1))
			{
				case "A":
				case "a":
						{
							row2 = 0;
							break;
						}
				case "B":
				case "b":
						{
							row2 = 1;
							break;
						}
				case "C":
				case "c":
						{
							row2 = 2;
							break;
						}
				case "D":
				case "d":
						{
							row2 = 3;
							break;
						}
				case "E":
				case "e":
						{
							row2 = 4;
							break;
						}
				case "F":
				case "f":
						{
							row2 = 5;
							break;
						}
						
						
			}
		
			col2 = Integer.parseInt(game2Piece.substring(1)) - 1;
			checkBoard[row2][col2] = " ";
			System.out.println("Player 2, where do you want to move?");
			String player2Move = userStringInput.nextLine();
			switch(player2Move.substring(0,1))
			{
				case "A":
				case "a":
						{
							row2 = 0;
							break;
						}
				case "B":
				case "b":
						{
							row2 = 1;
							break;
						}
				case "C":
				case "c":
						{
							row2 = 2;
							break;
						}
				case "D":
				case "d":
						{
							row2 = 3;
							break;
						}
				case "E":
				case "e":
						{
							row2 = 4;
							break;
						}
				case "F":
				case "f":
						{
							row2 = 5;
							break;
						}	
			}
			col2 = Integer.parseInt(player2Move.substring(1)) - 1;
			checkBoard[row2][col2] = "b";
			displayBoard();
		}
	}

