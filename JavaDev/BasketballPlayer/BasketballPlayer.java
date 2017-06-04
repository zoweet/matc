import java.util.Scanner;

 public class BasketballPlayer {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerName;
        int heightInInches, points, games;
        double avgPtsPerGame;
        System.out.printf("Enter Basketball Player's Name: ");
        playerName = input.nextLine();
		
		System.out.printf("Enter %s's Height in inches:  " , playerName); 
		heightInInches = input.nextInt ();
		int heightInFeet = heightInInches / 12;
		int remainingInches = heightInInches % 12;
		
		System.out.printf("Enter total points: " );
        points = input.nextInt ();
		
		System.out.printf("Enter total games:"  );
		games= input.nextInt ();
		
		avgPtsPerGame = points / games;
		
		System.out.printf(
		"%s is %d inches %d inches tall average %f points per game. \n",
		playerName,
		heightInFeet,
		remainingInches,
		avgPtsPerGame
		);
	        
		}
		
 }
 