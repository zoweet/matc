import java.util.Random;

public class GuessStarter {
	
		public static void main (String[] args) {
			//pick random number
			Random test = new Random() ;
			int number = test.nextInt(100) + 1;
			Random best = new Random();
			int two = test.nextInt(100) + 1;
			System.out.println(number);
			System.out.print(two);
		}
}