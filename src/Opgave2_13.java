import java.util.Scanner;

public class Opgave2_13 {
    public static void main(String[] args) {
        // Initializing the final monthly interest rate
        final double monthlyrate = 0.003125;
        // Adding a scanner to allow the user to write out an arbitrary amount of money they wish to save.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an arbitrary amount of money you want to save");
        double saving = input.nextDouble(); // saving

        // Calculating what the total monthly interest-rates are.
        double totalrate = 100 * (1 + monthlyrate); // first month

        totalrate = (100 + totalrate) * (1 + monthlyrate); // second month and so forth.
        totalrate = (100 + totalrate) * (1 + monthlyrate); // third month and so forth.
        totalrate = (100 + totalrate) * (1 + monthlyrate); // fourth month and so forth.
        totalrate = (100 + totalrate) * (1 + monthlyrate); // fifth month and so forth.
        totalrate = (100 + totalrate) * (1 + monthlyrate); // sixth month and so forth.

        System.out.println("Monthly savings-amount: " + saving + " will equal " + totalrate + " after 6 months");


    }
}
