/**
 * Created by ITyan on 03.04.2015.
 */
public class MyFirstClass {
    public static void main(String[] args) {
        //commented text

        /*
         * some other text
         */

        greetings();

        double height = 172;
        double weight = 71;

        double ratio = weight / height;
        System.out.println(ratio);
    }

    public static void greetings() {
        String a = "Hello, World!";
        String b = " LOL";

        System.out.println(a);
        System.out.println(a + b);
    }
}
