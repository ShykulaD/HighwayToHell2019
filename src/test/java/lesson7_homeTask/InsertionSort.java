package lesson7_homeTask;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String args[]) {
        int[] array = {9, 7, 5, 3, 11, 8, 6, 4, 2, 10};

        int tmp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }

}
