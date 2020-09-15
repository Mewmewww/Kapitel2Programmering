import java.util.Scanner;

public class Opgave2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the sides and height of the Triangle");
        double length = input.nextDouble();

        double area = (Math.sqrt(3)/4) * (length*length);
        double volume = area * length;

        System.out.println("Area is " + area);
        System.out.println("Volume of Triangle is " + volume);

    }
}
