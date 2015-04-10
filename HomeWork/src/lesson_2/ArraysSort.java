package lesson_2;


import java.util.Scanner;

/**
 * @author ITyan on 09.04.2015.
 */
public class ArraysSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Insert size of array: ");
        int size = in.nextInt();

        double[] array1 = createdRandomArray(size);
        System.out.println("Original array:");
        for (double i : array1) {
            System.out.print("[" + i + "]" + " ");
        }

        bubbleSort(array1);
        System.out.println("\n" +
                "Sorted array:");
        for (double i : array1) {
            System.out.print("[" + i + "]" + " ");
        }
    }

    /**
     * Creates an array with random numbers
     *
     * @param arraySize size of array
     * @return array with random numbers
     */
    public static double[] createdRandomArray(int arraySize) {
        double[] array = new double[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100);
        }
        return array;
    }

    /**
     * Method bubble sort
     *
     * @param array array for a sorting
     */
    public static void bubbleSort(double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}