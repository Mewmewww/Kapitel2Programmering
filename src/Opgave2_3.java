import java.util.Scanner;

public class Opgave2_3 {
    public static void main(String[] args) {
        System.out.println("Enter an arbitrary meter");
        Scanner input = new Scanner (System.in);

        double meters = input.nextDouble();
        System.out.println(meters + "meters = " + meterstofeet(meters) + "feet");
    }
    // Laver en metode, som tager inputtet meters og konverterer det til feet.
    public static double meterstofeet(double meters) {
        return meters * 3.2808;
    }
}
