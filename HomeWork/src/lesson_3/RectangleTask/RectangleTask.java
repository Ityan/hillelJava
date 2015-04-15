package lesson_3.RectangleTask;

/**
 * @author ITyan on 14.04.2015.
 */
public class RectangleTask {
    double perimeter;
    double area;

    public RectangleTask(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;

    }

    //counting discriminant
    public double getDiscriminant() {
        double discriminant = Math.pow((perimeter / 2), 2) - 4 * area;
        return discriminant;
    }

    /**
     * Checks on the possibility of solving equation
     * in the method getRectangle()
     *
     * @return true if a solution is possible
     */
    public boolean hasSolution() {

        return getDiscriminant() >= 0;
    }

    /**
     * Method solves the quadratic equation
     * x^2 - ((perimeter / 2) * x) + area = 0
     *
     * @return a new object of class Rectangle
     */
    public Rectangle getRectangle() {
        if (hasSolution()) {
            //counting the height and width through the quadratic equation
            double width = ((perimeter / 2) + Math.sqrt(getDiscriminant())) / 2;
            double height = ((perimeter / 2) - Math.sqrt(getDiscriminant())) / 2;

            return new Rectangle(width, height);
        } else {
            return null;
        }
    }
}
