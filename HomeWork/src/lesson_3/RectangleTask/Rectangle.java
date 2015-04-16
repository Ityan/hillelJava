package lesson_3.RectangleTask;

/**
 * @author ITyan on 14.04.2015.
 */
public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        String result = "Size of the rectangle:";
        result += "\nWidth = " + width;
        result += "\nHeight = " + height;
        return result;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Rectangle)) {
            return false;
        }
        Rectangle otherRect = (Rectangle) other;
        if (this.width != otherRect.width) {
            return false;
        }
        if (this.height != otherRect.height) {
            return false;
        }
        return true;
    }
}
