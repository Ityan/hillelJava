package lesson_6.shapeAndColor.shapes;

/**
 * Created by Igor on 23.04.2015.
 */
public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea() {
        return a * b;
    }

    public String toString() {
        String result = "Rectangle: a = " + a + ", b = " + b
                + "\nArea = " + getArea() + "\nColor: " + color.getColor()
                + ", spent on painting: " + getSpentPaint();
        return result;
    }
}
