package newlines;

public class newline{
	public static void newLine() {
		System.out.println();
		
	}
	public static void threeLine() {
		newLine();
		newLine();
		newLine();
		
	}
	public static void twoLine() {
		newLine();
		newLine();
		
	}
	
	public static void main(String[] args) {
		System.out.println("First line.");
		newLine();
		System.out.println("Second line.");
		twoLine();
		System.out.println("Thind line.");
		threeLine();
	}
}