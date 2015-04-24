import lesson_6.shapeAndColor.colors.GreenColor;
import lesson_6.shapeAndColor.colors.RedColor;
import lesson_6.shapeAndColor.colors.YellowColor;
import lesson_6.shapeAndColor.shapes.Circle;
import lesson_6.shapeAndColor.shapes.Shape;
import lesson_6.shapeAndColor.shapes.Rectangle;
import lesson_6.shapeAndColor.shapes.Triangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Igor on 23.04.2015.
 */
public class ShapeTest {
    @Test
    public void getAreaTest() {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 5);
        Shape triangle = new Triangle(2, 2, 2);

        int circleArea = circle.getArea();
        assertEquals(78, circleArea);

        int squareArea = rectangle.getArea();
        assertEquals(25, squareArea);

        int triangleArea = triangle.getArea();
        assertEquals(19, triangleArea);
    }

    @Test
    public void getSpentPaintTest() {

        Shape circle = new Circle(5);

        circle.setColor(new GreenColor());
        String circleColor = circle.getColor();
        int circleSpend = circle.getSpentPaint();
        assertEquals("GREEN", circleColor);
        assertEquals(156, circleSpend);

        Shape rectangle = new Rectangle(5, 5);

        rectangle.setColor(new YellowColor());
        String rectangleColor = rectangle.getColor();
        int rectangleSpend = rectangle.getSpentPaint();
        assertEquals("YELLOW", rectangleColor);
        assertEquals(50, rectangleSpend);


        Shape triangle = new Triangle(2, 2, 2);
        triangle.setColor(new RedColor());
        String triangleColor = triangle.getColor();
        int triangleSpend = triangle.getSpentPaint();
        assertEquals("RED", triangleColor);
        assertEquals(38, triangleSpend);
    }
}
