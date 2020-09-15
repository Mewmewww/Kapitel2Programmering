import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Opgave2_6 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000");
        Scanner input = new Scanner(System.in);

        int value = input.nextInt(); // Breaking the mathematical equation in 3 defined variables and changing them
        // One a a time.
        int value1 = 1 + (value-100) / 100;
        int value2 = (1 + (value-10) / 10) % 10;
        int value3 = value % 10;

        int totalvalue = value1 * value2 * value3;

        System.out.println(totalvalue);
    }
}
