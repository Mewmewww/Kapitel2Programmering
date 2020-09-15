import java.util.Scanner;

public class Opgave2_11 {
    public static void main(String[] args) {
        // Defining all known variables
        System.out.println("Enter value in years");
        Scanner input = new Scanner(System.in);
        double year = input.nextDouble();
        double birth = 7.0;
        double death = 13.0;
        double immigrant = 45.0;
        double currentpopulation = 312032486;
        // Defining how many seconds there is in a year - as all our previously defined variables are all calculated
        // in seconds.
        double yearlyseconds = (365 * 24 * 60 * 60);
        // Simply divide the yearly seconds with the aforementioned variables.
        double intbirth = (yearlyseconds / birth);
        double intdeath = (yearlyseconds / death);
        double intimmigrant = (yearlyseconds / immigrant);

        // Making a loop, that only calculates from the beginning year to 5 years ahead.
        for (int i = 1; i <= year; i++) {
            currentpopulation += intbirth + intimmigrant - intdeath;
            // Printing out the year, followed up with an value of 1 -> 5 to underline what year it is.
            // Followed up by = and the current population for that year calculated in integers, so that
            // the values aren't shown in E^
            System.out.println("Year" + i + "=" + (int)currentpopulation);
        }
    }
}
