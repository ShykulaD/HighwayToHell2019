package lesson7;

/*
Переобразовать примитивные типы в строку и обратно!
Сделать для int, double, long, boolean
*/

public class StringPract {

    public static void main(String[] args) {

        int i = 123;
        double d = 12.2;
        long l = 33423424;
        boolean b = true;

        String intToString = String.valueOf(i);
        String doubleToString = String.valueOf(d);;
        String longToString = String.valueOf(l);;
        String booleanToString = String.valueOf(b);;

        System.out.println(intToString);
        System.out.println(doubleToString);
        System.out.println(longToString);
        System.out.println(booleanToString);

    }
}
