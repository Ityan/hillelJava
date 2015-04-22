package lesson_5.linkedList;

/**
 * Created by Igor on 22.04.2015.
 */
public class Test {
    public static void main(String[] args) {
        LinkedCells linkedCells = new LinkedCells();

        linkedCells.add("A");
        linkedCells.add("B");
        linkedCells.add("C");

        linkedCells.add(0, "X");
        System.out.println(linkedCells);
    }
}
