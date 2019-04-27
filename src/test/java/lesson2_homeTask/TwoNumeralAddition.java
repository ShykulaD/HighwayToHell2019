package lesson2_homeTask;

public class TwoNumeralAddition {

    public static void main(String[] args) {
        int n = 22; // natural number

        int b = n % 10; // 2
        int c = (n / 10) % 10; //2.2, but for int it's 2
        int resultN = b + c;
        System.out.println("Sum of two digits " + n + " is " + resultN);
    }
}
