package lesson6;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,33,44,2,455,99999999,333,4555,666,44,555,888899,9999,88,777,7777,444,232};
//      int [] newArr = new int[20];

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            for (int k = 1; k < arr.length;k++) {
                System.out.println(arr[k]);
            }
        }
    }
}

