package lesson_2;

import java.util.Scanner;

/**
 * @author ITyan on 09.04.2015.
 */
public class XORCrypt {
    public static void main(String[] args) {

        //text encryption
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to encrypt: ");
        String text = in.nextLine();

        //encryption key
        char key = '0';

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

    /**
     * The method is applied XOR to the text
     *
     * @param text text encryption
     * @param key  encryption key
     * @return String with the encrypted text
     */
    public static String crypt(String text, char key) {
        char[] textToCharArray = text.toCharArray();
        for (int i = 0; i < textToCharArray.length; i++) {
            textToCharArray[i] ^= key;
        }

        return String.copyValueOf(textToCharArray);
    }

}
