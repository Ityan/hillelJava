import com.hillel.java.oopBasics.StringArray;
import org.junit.Test;

/**
 * Created by ITyan on 17.04.2015.
 */
public class StringArrayTest {

    public static void main(String[] args) {
        StringArray array = new StringArray();
        System.out.println("Empty array: " + array);
        System.out.println("Empty array size: " + array.size());

        array.add("first");
        System.out.println("One element: " + array);
        System.out.println("One array size: " + array.size());

        array.add("second");
        System.out.println("Two element: " + array);
        System.out.println("Two array size: " + array.size());

        System.out.println("First element: " + array.get(0));
        System.out.println("Second element: " + array.get(1));

        System.out.println("Third element: " + array.get(2));
    }

    @Test
    public void asd() {
        System.out.println("test is running");
    }
}
