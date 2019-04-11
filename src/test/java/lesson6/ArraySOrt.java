package lesson6;

import java.util.Arrays;

public class ArraySOrt {
    public static void main(String[] args) {
        int someArray[] = {1, 5, 7, 444, 2, 0};
        Arrays.sort(someArray);
        System.out.println("Sorted array:" + Arrays.toString(someArray)); // вывод на экран
    }

}
