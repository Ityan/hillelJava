import lesson_5.StringArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ITyan on 20.04.2015.
 */
public class StringArrayTest {
    @Test
    public void removeTest() {
        StringArray array = new StringArray();

        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");

        String removedElement = array.remove(1);

        assertEquals("B", removedElement);

        assertEquals(4, array.size());

        assertEquals("A", array.get(0));
        assertEquals("C", array.get(1));
        assertEquals("D", array.get(2));

        System.out.println(array);
    }

    @Test
    public void addTest() {
        StringArray array = new StringArray();

        array.add("A");
        array.add("C");
        array.add("D");
        array.add(1, "B");
        array.add(4, "E");

        assertEquals(5, array.size());
        assertEquals("B", array.get(1));
        assertEquals("D", array.get(3));
        assertEquals("E", array.get(4));

        System.out.println(array);
    }
}
