import java.util.Scanner;

public class Opgave2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Velocity: m/s");
        System.out.println("Acceleration: m/s");

        double vel = input.nextDouble();
        double a = input.nextDouble();

        double length = ((vel*vel) / (a * 2));

        System.out.println("Minimum runway length is: " + length);
    }
}
