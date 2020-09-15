import java.util.Scanner;

public class Opgave2_5 {
    public static void main(String[] args) {
        System.out.println("Enter an arbitrary subtotal amount");
        System.out.println("Enter an arbitrary gratuity amount");

        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        // Divide gratuity with 100 and times that divided value with subtotal.
        double subgratuity = subtotal * (gratuity / 100);

        // Find the total between those two values.
        double totalvalue = subtotal + subgratuity;

        System.out.println("Gratuity is : $" + subgratuity + " and total is : $" + totalvalue);
    }
}
