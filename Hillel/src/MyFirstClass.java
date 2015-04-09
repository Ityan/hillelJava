import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Ityan on 03.04.2015.
 */
public class MyFirstClass {
    public static void main(String[] params) {

      /*  greetings();
        age();
        long i = 1233213213213213L;
        double height = 172;
        double weight = 71;
        double ratio = weight / height;
*/
        //    System.out.println(String.format("%04.2f", 2.222222222));


        mathOperationsExample();

        xorExample();

        scanerExample();

        ifElseExample();

        switchCaseExample();

        ternaryOperator();

        floatComparison();

        arraysExample();

        changeArrayValues();

        whileLoop();

        doWhileLoop();

        generateRandomNumber();
    }

    private static void mathOperationsExample() {
        int i = 5;

        i++;
        int b = 5 + i++;

        System.out.println(b);

        i += 4;

        i = 10 % 2;
    }

    private static void scanerExample() {
        Scanner scanner = new Scanner(System.in);
        int inputedInt = scanner.nextInt();
    }

    private static void xorExample() {
        int r = 455;

        int result = r ^ 20;
        System.out.println(result);
        result = result ^ 20;
        System.out.println(result);
    }

    private static void ifElseExample() {

        boolean attendJavaCources = true;
        boolean isWendsdayTooday = false;

        if (attendJavaCources() | (isWendsdayTooday() & true)) {
            System.out.println("Im gonna to go on my lectures");
        } else {
            System.out.println("nothing to do today");
        }


        if (true) {
            System.out.println("in if");
        }
        if (attendJavaCources()) {
            System.out.println("in else");
        }
        if (false) {

        } else {

        }
    }

    private static void switchCaseExample() {
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 5:
                System.out.println("may");
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("wrong month");
        }

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            default:
                System.out.println("wrong month");
        }
        System.out.println("out of switch");
    }

    private static void ternaryOperator() {
        boolean iNeedEven = true;

        int oddOrEven = iNeedEven && true ? true ? 123 : 34 : 1;

        if (iNeedEven) {
            oddOrEven = 2;
        } else {
            oddOrEven = 1;
        }

        System.out.println(oddOrEven);
    }

    private static void floatComparison() {
        float difference = (1.1f + 2.2f) - 3.3f;
        float sigma = 0.01f;
        if (Math.abs(difference) <= sigma) {
            System.out.println("equal");
        }


        if (1.1f + 2.2f == 3.3f) {
            System.out.println("it is obvious");
        } else {
            System.out.println("i should study java harder");
        }
        System.out.println(1.1f + 2.2f);
    }

    private static void arraysExample() {
        int[] intArray = {1, 2, 3, 4, 5};
        intArray = new int[5];
        intArray = new int[10];

        intArray = Arrays.copyOf(intArray, 20);

        int[] newIntArray = {1, 2, 3, 4, 5};

        int i = newIntArray[0];

        System.out.println(i);

        newIntArray[0] = 10;

        i = newIntArray[0];

        System.out.println(i);

        System.out.println(Arrays.toString(newIntArray));

        System.out.println(newIntArray.length);

        System.out.println("before for");

        for (int j = 0; j <= newIntArray.length - 1; j++) {
            if (j == 3) {
                continue;
            }

            int element = newIntArray[j];

            System.out.println(element);

            newIntArray[j] = newIntArray[j] * 2;
        }
        System.out.println(Arrays.toString(newIntArray));
    }

    private static void changeArrayValues() {
        boolean[] boolArray = {true, true, false};
        for (boolean element : boolArray) {
            element = false;
            System.out.println(element);
        }
    }

    private static void whileLoop() {
        Scanner scanner = new Scanner(System.in);


        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int input = scanner.nextInt();
        System.out.println("in: " + input);
    }

    private static void doWhileLoop() {

        do {
            System.out.println("this message will be printed at least once");
        } while (generateRandomBoolean());
    }

    public static boolean generateRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }


    private static void generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
    }

    public static boolean attendJavaCources() {
        System.out.println("in first method");
        return true;
    }

    public static boolean isWendsdayTooday() {
        System.out.println("in second method");
        return true;
    }

    public static void age() {
        int age = 30;

        int i = 1;

        System.out.println(" is my age " + (age + i));
    }

    public static void greetings() {
        //commented text

        /*
         some other text
         */

        String a = "Hello World!";

        System.out.println(a);

        String greeting = "My name is ";
        String name = "Max";

        String result = greeting + name;

        System.out.println(result);
    }

}