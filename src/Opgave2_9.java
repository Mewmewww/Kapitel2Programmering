import java.util.Scanner;

public class Opgave2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Velocity 1: m/s");
        System.out.println("Velocity 2: m/s");
        System.out.println("Time in total");

        double V0 = input.nextDouble();
        double V1 = input.nextDouble();
        double t = input.nextDouble();

        double acceleration = ((V1 - V0) / t);

        System.out.println("The average acceleration is: " + acceleration);
    }
}
