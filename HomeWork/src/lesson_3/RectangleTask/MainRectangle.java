package lesson_3.RectangleTask;


/**
 * @author ITyan on 14.04.2015.
 */
public class MainRectangle {
    public static void main(String[] args) {
        RectangleTask rectTask1 = new RectangleTask(40, 25);
        RectangleTask rectTask2 = new RectangleTask(40, 25);
        RectangleTask rectTask3 = new RectangleTask(16, 15);

        Rectangle rect1 = rectTask1.getRectangle();
        Rectangle rect2 = rectTask2.getRectangle();
        Rectangle rect3 = rectTask3.getRectangle();

//        Rectangle rect1 = new Rectangle(5, 4);
//        Rectangle rect2 = new Rectangle(4, 5);
//        Rectangle rect3 = new Rectangle(5, 5);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect1.equals(rect3));


    }
}
