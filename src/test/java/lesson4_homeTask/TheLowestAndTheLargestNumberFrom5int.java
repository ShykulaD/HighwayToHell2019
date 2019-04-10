package lesson4_homeTask;

import java.util.ArrayList;
import java.util.List;

public class TheLowestAndTheLargestNumberFrom5int {

    public static void main(String[] args) {
        int i1 = 22;
        int i2 = 3;
        int i3 = 444;
        int i4 = 5;
        int i5 = 23;

        int maxNumber = 0;
        int minNumber = 2147483647; //starting number for min number loop

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(i1);
        intList.add(i2);
        intList.add(i3);
        intList.add(i4);
        intList.add(i5);
        int intSize = intList.size();

        // With for loop find the max number in array
        for (int i = 0; i < intSize ; i++) {
            if (intList.get(i) > maxNumber) {
                maxNumber = intList.get(i);
            }
        }

        // With for loop find the min number in array
        for (int k = 0; k < intSize ; k++) {
            if (minNumber > intList.get(k)) {
                minNumber = intList.get(k);
            }
        }

        System.out.println("Max number in the list is " + maxNumber);
        System.out.println("Min number in the list is " + minNumber);

        }
    }

