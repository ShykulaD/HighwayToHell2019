package lesson2_homeTask;

/*
Написать класс в котором будут примеры приведения типов:

int->char
float->char
float->char->int
*/

public class DataTypePractice {
    public static int i = 33;
    public static float fNumber = 123.2f;


    public static void main(String[] args) {
        // int->char
        char c = (char) i;
        System.out.println(c);

        // float->char
        char c2 = (char) fNumber;
        System.out.println(c2);

        // float->char->int

        int i2 = c2;
        System.out.println(i2);

    }
}