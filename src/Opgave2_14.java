import java.util.Scanner;

public class Opgave2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Weight: Kg");
        System.out.println("Height: CM");

        double weight = input.nextDouble();
        double weight_pound = weight * 0.45359237;
        double height = input.nextDouble();
        double height_inches = height * 0.0254;

        double BMI = weight_pound / (height_inches * height_inches);

        System.out.println("The required energy is: " + BMI);
    }
}
