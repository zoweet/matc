import java.util.Random;

public class RollTheDice {

    public static void main(String[] args) {
        // TODO: Roll two dice, check for doubles, print die values, and total
        int d1, d2;
        d1 = roll();
        d2 = roll();
		d3 = roll();
		d4 = roll();
		d5 = roll();
		d6 = roll();
        String dbl = doubles(d1,d2);
        System.out.printf("Dice Roll : %d,%d; %s total==%d\n", d1,d2,dbl, d1+d2);
    }
    
    public static int roll() {
        // TODO: Generate a random number between 1 and 6
        Random g = new Random();
        return g.nextInt(6)+1;
    }
    
    public static String doubles(int d1, int d2) {
        // TODO: Return "doubles" if same die number for d1 and d2
        return d1==d2 ? "doubles" : "";
    }
}