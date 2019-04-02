package lesson2_homeTask;


import java.util.Scanner;

public class ConsoleDataTypesPractice {

    public static void main(String[] args) {
        // Программа char -> int
        System.out.println("Input any numbers ");
        Scanner scan = new Scanner(System.in);
        char c = scan.findInLine(".").charAt(0);

        int i1 = c;
        System.out.println(i1);


        // Программа int -> char
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Input any integer ");
        int i2 = scan2.nextInt();
        char c2 = (char) i2;

        System.out.println(c2);
    }
}
