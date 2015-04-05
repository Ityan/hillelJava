import java.util.Scanner;

/**
 * Created by ITyan on 04.04.2015.
 */
public class HomeWork {
    public static void main(String[] args) {
        double perimeter;
        double area;

        Scanner in = new Scanner(System.in);
        System.out.print("Insert perimeter: ");
        perimeter = in.nextDouble();
        System.out.print("Insert area: ");
        area = in.nextDouble();

        resolve(perimeter, area);
    }

    /**
     * Method solves the quadratic equation
     * x^2 - ((perimeter / 2) * x) + area = 0
     *
     * @param perimeter perimeter of a rectangle
     * @param area      area of a rectangle
     */
    public static void resolve(double perimeter, double area) {
        double width;
        double height;

        //counting discriminant
        double d = Math.pow((perimeter / 2), 2) - 4 * area;

        //counting the height and width through the quadratic equation
        if (d > 0) {
            width = ((perimeter / 2) + Math.sqrt(d)) / 2;
            height = ((perimeter / 2) - Math.sqrt(d)) / 2;
            System.out.println("width = " + width + "\nheight = " + height);
        } else if (d == 0) {
            width = height = (perimeter / 2) / 2;
            System.out.println("width = " + width + "\nheight = " + height);
        } else {
            System.out.println("Equation has no solution!");
        }
    }
}
