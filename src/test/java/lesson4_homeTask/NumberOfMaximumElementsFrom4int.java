package lesson4_homeTask;

import java.util.ArrayList;
import java.util.List;

public class NumberOfMaximumElementsFrom4int {
        public static void main(String[] args) {
                int i1 = 22;
                int i2 = 3;
                int i3 = 22;
                int i4 = 5;
                int maxNumber = 0;
                int IdenticalNumbers = 0;

                List<Integer> intList = new ArrayList<Integer>();
                intList.add(i1);
                intList.add(i2);
                intList.add(i3);
                intList.add(i4);
                int intSize = intList.size();

                // With for loop find the max number in array
                for (int i = 0; i < intSize ; i++) {
                     if (intList.get(i) > maxNumber) {
                             maxNumber = intList.get(i);
                     }
                }

                // With for loop find how many times maximum number is in the array
                for (int k = 0; k < intSize ; k++) {
                        if (maxNumber == intList.get(k)) {
                                ++IdenticalNumbers;
                        }
                }

                System.out.println("Max number in the list is " + maxNumber);
                System.out.println("The largest number in the list occurs " + IdenticalNumbers + " times");
            }
        }