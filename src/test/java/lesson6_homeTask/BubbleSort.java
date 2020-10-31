package lesson6_homeTask;

public class BubbleSort {

    public static void main(String[] args) {

        boolean swapFlag = true;
        int tempInt;
        int[] arr = {1, 33, 44, 2, 455, 99999999, 333, 4555, 666, 44, 555, 888899, 9999, 88, 777, 7777, 444, 232};
        while (swapFlag) {
            swapFlag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    tempInt = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempInt;
                    swapFlag = true;
                }
            }
        }
        for (int item : arr)
            System.out.println(item + " ");
        System.out.println();
    }
}
