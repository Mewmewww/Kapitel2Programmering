import java.util.Scanner;

public class Opgave2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x1: ");
        System.out.print("y1: ");
        System.out.print("x2: ");
        System.out.print("y2: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double equation = (Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));

        System.out.println("Distance between two points is " + equation);
    }
}
