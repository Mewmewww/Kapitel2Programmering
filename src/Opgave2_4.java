import java.util.Scanner;

public class Opgave2_4 {
    public static void main(String[] args) {
        System.out.println("Enter arbitrary square meter");
        Scanner input = new Scanner (System.in);
        double squaremeter = input.nextDouble();
        System.out.println(squaremeter + "squaremeter = " + sqrtmetertoping(squaremeter) + "ping");
    }
    // Laver en metode, som tager inputtet sqrtmeter og konverterer det til ping.
    public static double sqrtmetertoping(double squaremeter) {
        return squaremeter * 0.3025;
    }
}
