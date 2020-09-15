import java.util.Scanner;

public class Opgave2_1 {
    public static void main(String[] args) {
        System.out.println("Enter a mile");
        Scanner input = new Scanner (System.in);
        double mile = input.nextDouble();
        System.out.println(mile + "miles = " + milestokm(mile) + "km");
    }
    // Laver en metode, som tager inputtet mile og ganger det med konveteringen fra mile til KM.
    public static double milestokm(double mile) {
        return mile * 1.609344;
    }
}
