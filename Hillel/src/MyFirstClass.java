import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ITyan on 03.04.2015.
 */
public class MyFirstClass {
    public static void main(String[] args) {
       /*
        LESSON 1

        System.out.printf("%.2f", 2.22222222);
        greetings();

        double height = 172;
        double weight = 71;

        double ratio = weight / height;
        System.out.println(ratio);
        */

        /*
        LESSON 2


        byte b = (byte) 127;
        System.out.println(b);
        int i = 5;
        System.out.println(i);

        int k = 5 + ++i;
        System.out.println(k);

        i += 4; //i = i + 4
        i = 10 % 2; // остаток от деления
        System.out.println(i);

        if ((12 == 22) || (12 <= 22) && (12 >= 22)) {}

        boolean attendJavaCources = true;
        boolean isWednesdayToday = true;
        if (attendJavaCources() && isWednesdayToday()) {
            System.out.println("I gonna to go on my lectures");
        }else {
            System.out.println("Nothing to do today");
        }

        int r = 455;
        int result = r ^ 20;
        System.out.println(result);
        result = result ^ 20;
        System.out.println(result);

        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) { // проверка на ввод именно того типа
            int inputedInt = in.nextInt();
        }

        int month = 5;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 5:
                System.out.println("feb");
                break;
            case 12:
                System.out.println("nov");
                break;
            default:
                System.out.println("wrong month");
                break;
        }


        boolean iNeedEven = true;
        int oddOrEven = iNeedEven ? 2 : 1;
        System.out.println(oddOrEven);


        if (1.1f + 2.2f == 3.3f) {
            System.out.println("it is obvious");
        } else {
            System.out.println("i should study java harder");
        }


        int[] intArray = new int[5];
        intArray = Arrays.copyOf(intArray, 20); //теперь его размер 20
        int[] newIntArray = {1, 2, 3, 4, 5};
        int i = newIntArray[0];
        System.out.println(i);
        newIntArray[0] = 10;
        i = newIntArray[0];
        System.out.println(i);
        System.out.println(Arrays.toString(newIntArray));//метод для вывода массива
        System.out.println(newIntArray.length);
        for (int j = 0; j < newIntArray.length; j++) {
            int element = newIntArray[j];
            System.out.println(element);
        }

        for (int element : newIntArray) {
            System.out.println(element);
        }


        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {//проверка на ввод типа int
            in.next();
        }
        do {
            //some code
        } while (true);
         */

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10);
        System.out.println(randomNumber);
    }

    public static boolean attendJavaCourses() {
        System.out.println("In first method");
        return false;
    }

    public static boolean isWednesdayToday() {
        System.out.println("It second method");
        return true;
    }

    public static void greetings() {
        String a = "Hello, World!";
        String b = " LOL";

        System.out.println(a);
        System.out.println(a + b);
    }
}
