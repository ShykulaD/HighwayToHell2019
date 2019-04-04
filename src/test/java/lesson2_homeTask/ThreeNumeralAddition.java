package lesson2_homeTask;

public class ThreeNumeralAddition {

    public static void main(String[] args) {
        int n = 243;
        int firstNumber = n / 100; // 2
        int lastNumber = n % 10; // 3
        int integerForSecondNumber = n / 10; // 24
        int secondNumber = integerForSecondNumber % 10; // 4
        int finalNumber = firstNumber + secondNumber + lastNumber; //
        System.out.println("Sum of three digits " +n +" is "+ finalNumber);
    }

}