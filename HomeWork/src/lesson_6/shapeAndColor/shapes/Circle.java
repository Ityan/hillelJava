package lesson_6.shapeAndColor.shapes;

/**
 * Created by Igor on 23.04.2015.
 */
public class Circle extends Shape {

    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * (radius * radius));
    }

    public String toString() {
        String result = "Circle: radius = " + radius
                + "\nArea = " + getArea() + "\nColor: " + color.getColor()
                + ", spent on painting: " + getSpentPaint();
        return result;
    }
}
