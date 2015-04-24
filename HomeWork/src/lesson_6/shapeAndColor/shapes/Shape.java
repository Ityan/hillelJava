package lesson_6.shapeAndColor.shapes;

import lesson_6.shapeAndColor.colors.Color;

/**
 * Created by Igor on 23.04.2015.
 */
public abstract class Shape {

    public abstract int getArea();

    protected Color color;

    public String getColor() {
        return color.getColor();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSpentPaint() {
        return getArea() * color.paintOnMeter;
    }
}
