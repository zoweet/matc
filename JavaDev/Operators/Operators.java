import java.util.Scanner;
public class Operators{
	public static void main(String[] args) {
		String fruit1 = "Apple";
		String fruit2 = "Apple";
		System.out.println(fruit1.equals(fruit2));
		
		Scanner input = new Scanner(System.in);
		int x = 8;
		System.out.println("Enter a number here");
		x=input.nextInt();
		if(x > 0 && x % 2 ==0){
			System.out.println("x is a positive number");
			
		if (x % 2 ==0){
			System.out.println("x is even");
		}else{
			System.out.println("x is odd");
			
			if (x > 0){
				System.out.println("x is positive");
			}else if (x < 0) {
				System.out.println("x is negative");
			}else{
				System.out.println("x is zero");
				
				
			}
			
			}
		}	
		}	
			
		
			}
		
		
	



// !(x <= 1 || y==5) is the same as x >=1 

