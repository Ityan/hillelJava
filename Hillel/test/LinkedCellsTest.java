import com.hillel.java.oopBasics.LinkedCells;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ITyan on 17.04.2015.
 */
public class LinkedCellsTest {
    @Test
    public void addTest() {
        LinkedCells list = new LinkedCells();
        System.out.println("Empty list: " + list);

        list.add("A");
        System.out.println("One element list: " + list);

        list.add("B");
        System.out.println("Two element list: " + list);

    }
}
