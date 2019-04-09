package lesson4_homeTask_and_work;

import java.util.Scanner;

public class SwitchCaseWeek {
    public static void main(String[] args) {
        String Monday = "Monday";
        String Tuesday = "Tuesday";
        String Wednesday = "Wednesday";
        String Thursday = "Thursday";
        String Friday = "Friday";
        String Sat = "Sat";
        String Sunday = "Sunday";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println(Monday); break;
            case 2:
                System.out.println(Tuesday); break;
            case 3:
                System.out.println(Wednesday); break;
            case 4:
                System.out.println(Thursday); break;
            case 5:
                System.out.println(Friday); break;
            case 6:
                System.out.println(Sat); break;
            case 7:
                System.out.println(Sunday); break;
            default:
                System.out.println("I don't know such day");
        }    }
}
