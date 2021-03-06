package lesson2_homeTask;

import java.util.Scanner;

/*
1. Программа char -> int

Считывает из консоли символ который вы вводите вручную (в консоль).
Переобразовывает символ в int
Выводит числовое значение символа

2. Программа int -> char

Тоже самое только int -> char
*/

public class ConsoleDataTypesPractice {

    public static void main(String[] args) {
        // char -> int program
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the symbol: ");

        char c = sc.next().charAt(0);
        int i1 = c;

        System.out.println(i1);

        // int -> char program

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = reader.nextInt();
        char c2 = (char) number;

        System.out.println("Your char symbol is: " + c2);

    }
}