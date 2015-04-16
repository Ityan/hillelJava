package lesson_3.ImprovedArray;

import java.util.Arrays;

/**
 * @author ITyan 14.04.2015.
 */
public class ImprovedArray {
    private String[] text = new String[10];
    private int countElement = 0;

    /**
     * Adds a string to an array
     *
     * @param value included string
     */
    public void add(String value) {
        if (text.length == countElement + 1) {
            text = Arrays.copyOf(text, text.length * 2);
        }
        text[countElement] = value;
        countElement++;
    }

    /**
     * Returns an array element
     *
     * @param index array index element
     * @return the item at index
     */
    public String get(int index) {
        if (index > countElement) {
            throw new RuntimeException("Incorrect index of array: " + index);
        } else {
            return text[index];
        }
    }

    /**
     * @return the number of completed elements
     */
    public int size() {
        return countElement;
    }

    public boolean equals(Object other) {
        if (other instanceof ImprovedArray) {
            ImprovedArray otherArray = (ImprovedArray) other;
            if (this.text.length != otherArray.text.length) {
                return false;
            }
            for (int i = 0; i < text.length; i++) {
                if (!this.text[i].equals(otherArray.text[i])) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < size(); i++) {
            result += "[" + get(i) + "]";
        }
        result += "]";
        return result;
    }
}
