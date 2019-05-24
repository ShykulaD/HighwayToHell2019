package lesson7_homeTask;

/*
Написать программу которая выведет кол-во символов “a” и список индексов(позиция) символа
в строке - “aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxvxcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs a a sdfsdf sdf”

Пример:
СТРОКА: “azzza”
РЕЗУЛЬТАТ: Кол-во символов “a” - 2, индексы символа “a” в строке - [0, 4];
*/

import java.util.ArrayList;
import java.util.List;

public class CounetAInTheString {


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        String stringWithA = "aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxv" +
                "xcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs a a sdfsdf sdfa";
        // String aString = "a";
        char aChar = 'a';
        int aAmount = 0; // sum of "a" in String

        for (int i = 0; i < stringWithA.length(); i++) {

            if (stringWithA.charAt(i) == aChar) {
                aAmount++;
                myList.add(i);
            }
        }

      // second variant of solution
      /*  for (int index = stringWithA.indexOf(aString);
             index >= 0;
             index = stringWithA.indexOf(aString, index + 1)) {
            myList.add(index);
        }
        */

        System.out.println("'a' character is " + aAmount + " times in string");
        System.out.println("The positions of elements in String are " + myList);

    }

}
