package Game;

import java.util.Scanner;

public class Main {
	public static boolean playerTurn = true;
	public static boolean player1 = false;
	public static boolean player2 = false;
	public static boolean playing = true;
	public static boolean playAgain = false;
	
	public static Scanner scan = new Scanner(System.in);
	
	public static tictactoe board = new tictactoe();
	
	public static void main(String[] args) {
		
			if(board.isVisible() == false) {
				board.setVisible(true);
				
		}
	}
	
	public static void checkforwin() {
		if(board.button1.getText().equals("X")) {
			if(board.button2.getText().equals("X")) {
				if(board.button3.getText().equals("X")) {					
					player1 = true;					
					System.out.println("Winner Player 1!");							
				}
			}			
		}	
		if(board.button4.getText().equals("X")) {
			if(board.button5.getText().equals("X")) {
				if(board.button6.getText().equals("X")) {					
					player1 = true;					
					System.out.println("Winner Player 1!");					
				}
			}			
		}
		if(board.button7.getText().equals("X")) {
			if(board.button8.getText().equals("X")) {
				if(board.button9.getText().equals("X")) {
					player1 = true;					
					System.out.println("Winner Player 1!");					
				}
			}			
		}	
		if(board.button1.getText().equals("X")) {
			if(board.button4.getText().equals("X")) {
				if(board.button7.getText().equals("X")) {
					player1 =true;					
					System.out.println("Winner Player 1!");					
				}
			}			
		}	
		if(board.button2.getText().equals("X")) {
			if(board.button5.getText().equals("X")) {
				if(board.button8.getText().equals("X")) {
					player1 =true;					
					System.out.println("Winner Player 1!");					
				}
			}			
		}	
		if(board.button3.getText().equals("X")) {
			if(board.button6.getText().equals("X")) {
				if(board.button9.getText().equals("X")) {
					player1 =true;					
					System.out.println("Winner Player 1!");					
				}
			}			
		}	
		if(board.button1.getText().equals("X")) {
			if(board.button5.getText().equals("X")) {
				if(board.button9.getText().equals("X")) {
					player1 =true;					
					System.out.println("Winner Player 1!");					
				}
			}			
		}	
		if(board.button3.getText().equals("X")) {
			if(board.button5.getText().equals("X")) {
				if(board.button7.getText().equals("X")) {
					player1 =true;					
					System.out.println("Winner Player 1!");					
				}
			}			
		}
		//
		if(board.button1.getText().equals("O")) {
			if(board.button2.getText().equals("O")) {
				if(board.button3.getText().equals("O")) {					
					player2 = true;
					System.out.println("Winner Player 2!");					
				}
			}			
		}	
		if(board.button4.getText().equals("O")) {
			if(board.button5.getText().equals("O")) {
				if(board.button6.getText().equals("O")) {					
					player2 = true;
					System.out.println("Winner Player 2!");					
				}
			}			
		}
		if(board.button7.getText().equals("O")) {
			if(board.button8.getText().equals("O")) {
				if(board.button9.getText().equals("O")) {					
					player2 = true;
					System.out.println("Winner Player 2!");					
				}
			}			
		}	
		if(board.button1.getText().equals("O")) {
			if(board.button4.getText().equals("O")) {
				if(board.button7.getText().equals("O")) {					
					player2 = true;
					System.out.println("Winner Player 2!");					
				}
			}			
		}	
		if(board.button2.getText().equals("O")) {
			if(board.button5.getText().equals("O")) {
				if(board.button8.getText().equals("O")) {					
					player2 = true;
					System.out.println("Winner Player 2!");					
				}
			}			
		}	
		if(board.button3.getText().equals("O")) {
			if(board.button6.getText().equals("O")) {
				if(board.button9.getText().equals("O")) {					
					player2 = true;
					System.out.println("Winner Player 2!");					
				}
			}			
		}	
		if(board.button1.getText().equals("O")) {
			if(board.button5.getText().equals("O")) {
				if(board.button9.getText().equals("O")) {					
					player2 = true;
					System.out.println("Winner Player 2!");					
				}
			}			
		}	
		if(board.button3.getText().equals("O")) {
			if(board.button5.getText().equals("O")) {
				if(board.button7.getText().equals("O")) {					
					player2 = true;
					System.out.println("Winner Player 2!");					
				}
			}			
		}
		if(player1 == true || player2 == true) {
			
			System.out.println("Would you like to play again? true or false");
			playAgain = scan.nextBoolean();
			if (playAgain == true){
				board.setVisible(false);
				board.button1.setText("");
				board.button2.setText("");
				board.button3.setText("");
				board.button4.setText("");
				board.button5.setText("");
				board.button6.setText("");
				board.button7.setText("");
				board.button8.setText("");
				board.button9.setText("");
				playerTurn = true;
				player1 = false;
				player2 = false;
				board.setVisible(true);
				
			} else {
				System.out.println("Thanks for playing...");
			}
			
			}
	}
}//https://www.youtube.com/watch?v=BP4RI6BWCDc
