import java.util.Scanner;


public class Statements {

	
		public static void main(String[] args) {
				Scanner input =  new Scanner(System.in);
				System.out.print("Ender your grade, a number between 0 and 100");
				int grade = input.nextInt();
				
				if (grade >=0 && grade <=100){
					if (grade <70) {
						System.out.println("You're not a very bright student!");
					} else {
						System.out.printf("%d is a nice grade!\n", grade);
						
					}
				} else {
					System.out.printf("The value %d is outside the range 0 to 100. \n", grade);
				
				}
						
		}
}
