package lesson_2;

import java.util.Scanner;

/**
 * @author ITyan on 09.04.2015.
 */
public class SuperXORCrypt {
    public static void main(String[] args) {
        //text encryption
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to encrypt: ");
        String text = in.nextLine();

        //encryption key
        char[] key = {0, 1, 2};

        //encrypted text
        String cryptText = crypt(text, key);
        System.out.println("This is your encrypted text: " + cryptText);

        //decrypt of text
        System.out.print("Do you want to decrypt the text? (y/n): ");
        String yesNo = in.nextLine();
        if (yesNo.equalsIgnoreCase("y")) {
            String normalText = crypt(cryptText, key);
            System.out.println("This is your normal text: " + normalText);
        } else {
            System.out.println("Ok...");
        }
    }

    public static String crypt(String text, char[] key) {
        char[] textToCharArray = text.toCharArray();
        int j;
        for (int i = 0; i < textToCharArray.length; i++) {
            j = i % key.length;
            textToCharArray[i] ^= key[j];
        }

        return String.copyValueOf(textToCharArray);
    }
}
