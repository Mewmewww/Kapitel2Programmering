import java.util.Scanner;

public class Opgave2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Water: kg");
        System.out.println("Initial temp: fahrenheit");
        System.out.println("Final temp");

        double water = input.nextDouble();
        double starttemp = input.nextDouble();
        double finaltemp = input.nextDouble();

        double energy = water * (finaltemp - starttemp) * 4184;

        System.out.println("The required energy is: " + energy);
    }
}
