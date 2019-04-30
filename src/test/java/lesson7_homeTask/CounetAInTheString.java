package lesson7_homeTask;

/*
Написать программу которая выведет кол-во символов “a” и список индексов(позиция) символа
в строке - “aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxvxcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs a a sdfsdf sdf”

Пример:
СТРОКА: “azzza”
РЕЗУЛЬТАТ: Кол-во символов “a” - 2, индексы символа “a” в строке - [0, 4];
*/

public class CounetAInTheString {


    public static void main(String[] args) {

        int aAmount = 0; // sum of "a" in String

        String stringWithA = "azzza";
        // char arr[] = stringWithA.toCharArray(); // convert the String object to array of char

        for (int i = 0; i < stringWithA.length(); i++) {

            // stringWithA.indexOf(1);
            char a2 = 'a';

            if (stringWithA.charAt(i) == a2) {
                aAmount++;
            }
        }

        System.out.println(aAmount);

    }


}