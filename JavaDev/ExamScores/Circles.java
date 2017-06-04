import java.util.Scanner;

public class circles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        double radius = input.nextDouble();
        double circ = circleCircumference(radius,radius);
        double area = circleArea(radius);
        System.outprintf("Circumference : %d; Area : %f\n",circ, area);                
    
        public double circleCircumference(double radius) {
            return 2*Math.PI*radius;
        }
    }
    
    public static double circleArea(double radius {
         Math.PI*radius*radius;  
    }
}
