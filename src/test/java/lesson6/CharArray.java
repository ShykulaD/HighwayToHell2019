package lesson6;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] charArray = new char[255];

        for (int i=0; i<charArray.length; i++){
            charArray[i] = (char) i;
        }

        System.out.println("Char array: " + Arrays.
                toString(charArray));
    }
}
