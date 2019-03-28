package lesson2;

public class DataTypePractice {
    public static int i = 5;
    public static float fNumber = 123.2f;


    public static void main(String[] args) {
        char c = (char) i;
        System.out.println(c);

        char c2 = (char) fNumber;

        System.out.println(c2);

    }
}
