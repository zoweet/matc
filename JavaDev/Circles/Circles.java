import java.util.Scanner;

public class Circles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        double radius = input.nextDouble();
        double circ = circleCircumference(radius);
        double area = circleArea(radius);
        System.out.println("Circumference :" + circ);  
		System.out.println("Area : " + area);
		input.close();
    }
        public static double circleCircumference(double radius) {
            return 2*Math.PI*radius;
        }
    
    
    public static double circleArea(double radius) {
         return Math.PI*radius*radius;  
    }
}
