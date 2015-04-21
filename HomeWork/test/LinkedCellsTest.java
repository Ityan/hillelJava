import lesson_5.linkedList.LinkedCells;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ITyan on 21.04.2015.
 */
public class LinkedCellsTest {

    @Test
    public void addTest() {
        LinkedCells linkedCells = new LinkedCells();

        linkedCells.add("A");
        linkedCells.add("B");
        linkedCells.add("C");

        assertEquals(3, linkedCells.size());
        assertEquals("A", linkedCells.get(0));
        assertEquals("B", linkedCells.get(1));
        assertEquals("C", linkedCells.get(2));

        linkedCells.add(1, "Z");

        assertEquals(4, linkedCells.size());
        assertEquals("A", linkedCells.get(0));
        assertEquals("Z", linkedCells.get(1));
        assertEquals("B", linkedCells.get(2));
        assertEquals("C", linkedCells.get(3));
    }

    @Test
    public void removeTest() {
        LinkedCells linkedCells = new LinkedCells();

        linkedCells.add("A");
        linkedCells.add("B");
        linkedCells.add("C");
        linkedCells.add("D");

        String removedElement = linkedCells.remove(1);

        assertEquals("B", removedElement);
        System.out.println(linkedCells);
        assertEquals(3, linkedCells.size());
        assertEquals("A", linkedCells.get(0));
        assertEquals("C", linkedCells.get(1));
        assertEquals("D", linkedCells.get(2));
    }

    @Test
    public void isEmptyTest() {
        LinkedCells linkedCells = new LinkedCells();
        assertEquals(true, linkedCells.isEmpty());

        linkedCells.add("A");
        assertEquals(false, linkedCells.isEmpty());
    }

    @Test
    public void toStringTest() {
        LinkedCells linkedCells = new LinkedCells();

        String text = linkedCells.toString();
        assertEquals("[]", text);

        linkedCells.add("A");
        linkedCells.add("B");
        text = linkedCells.toString();
        assertEquals("[A, B]", text);
    }

    @Test
    public void equalsTest() {
        LinkedCells linkedCells1 = new LinkedCells();
        LinkedCells linkedCells2 = new LinkedCells();

        assertEquals(true, linkedCells1.equals(linkedCells1));

        assertEquals(true, linkedCells1.equals(linkedCells2));

        linkedCells1.add("A");
        assertEquals(false, linkedCells1.equals(linkedCells2));

        linkedCells2.add("A");
        assertEquals(true, linkedCells1.equals(linkedCells2));
    }
}
