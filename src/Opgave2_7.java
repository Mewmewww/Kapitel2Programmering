import java.util.Scanner;

public class Opgave2_7 {
    public static void main(String[] args) {
        // Firstly, define conditions that if met - will allow the continuation of the program - if not, break it.
        System.out.println("Enter a value in minutes");
        Scanner input = new Scanner(System.in);
        long minutes = input.nextLong();

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = (minutes/525600);
            System.out.println(years + "years");

            long days = (minutes % 525600);
            days = (days / 1440);
            System.out.println(days + "days");

            System.out.println(minutes + "minutter" + " = " + years + "år" + "og" + days + "dage");
        }
    }
}
