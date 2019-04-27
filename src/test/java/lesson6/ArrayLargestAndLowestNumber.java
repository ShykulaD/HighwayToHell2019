package lesson6;

public class ArrayLargestAndLowestNumber {

    public static void main(String[] args) {

        int[] arr = {2, 3, -1, 6, 6, 6, 7, 8, 9, 0, 1111};
        int maxNumber = arr[0];
        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < minNumber) {
                minNumber = arr[k];
            }
        }

        System.out.println("Max number " + maxNumber);
        System.out.println("Min number " + minNumber);

    }
}
