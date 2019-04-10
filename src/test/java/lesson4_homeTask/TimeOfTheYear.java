package lesson4_homeTask;

import java.util.Scanner;

public class TimeOfTheYear {
    public static void main(String[] args) {
        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";
        String fall = "Fall";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of the month in the Year: ");
            int inputedNumber = sc.nextInt();
            if (inputedNumber == 12 || inputedNumber == 1 || inputedNumber == 2 ) {
                System.out.println("It's " + winter + " now");
            }
            else if (inputedNumber == 3 || inputedNumber == 4 || inputedNumber == 5) {
                System.out.println("It's " + spring + " now");
            }
            else if (inputedNumber == 6 || inputedNumber == 7 || inputedNumber == 8) {
                System.out.println("It's " + summer + " now");
            }
            else if (inputedNumber == 9 || inputedNumber == 10 || inputedNumber == 11) {
                System.out.println("It's " + fall + " now");
            } else
                System.out.println("I don't know such month");
        }
    }

