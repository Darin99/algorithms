package sortingAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        insertionSort(array);
        printArray(array);


    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentNumber) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = currentNumber;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}