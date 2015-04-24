package lesson_6.shapeAndColor.shapes;

/**
 * Created by Igor on 23.04.2015.
 */
public class Triangle extends Shape {

    private int a;
    private int b;
    private int c;
    private int p;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getArea() {
        p = a + b + c;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String toString() {
        String result = "Triangle: a = " + a + ", b = " + b + ", c = " + c
                + "\nArea = " + getArea() + "\nColor: " + color.getColor()
                + ", spent on painting: " + getSpentPaint();
        return result;
    }
}
