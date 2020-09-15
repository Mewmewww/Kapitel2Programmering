import java.util.Scanner;

public class Opgave2_8 {
    public static void main(String[] args) {
        // De første 3 linjer anvendes for at vi kan indtaste en vilkårig tidszone i terminalen.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter timezone");
        int GMT = input.nextInt();

        // Returns the current time in milliseconds - but dividing it with 1000 to receive the value in seconds.
        long totalsekunder = (System.currentTimeMillis()) / 1000;
        // Finding the current seconds by simply taking the modulus of the total seconds.
        long currentsekunder = (totalsekunder % 60);
        // Finding the current minutes by simply dividing the value of seconds and taking the modulus of that value.
        // This gives us the current amount of minutes.
        long currentminute = totalsekunder / 60 % 60;
        // Finding the current hours by simply dividing the value of minutes and taking the modulus of 24.
        // This gives us the current amount of hours.
        long currenthours = totalsekunder / 3600 % 24;

        System.out.println("The current time is " + (currenthours + GMT) + ":" + currentminute + ":" + currentsekunder);
    }
}
