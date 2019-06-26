package test_package;

import java.util.ArrayList;

/**
 * Created by Shykulad on 26/06/2019.
 */
public class test1 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");


        for (String str1 : list) {
            System.out.println(str1);
        }
    }
}
