package lesson7;

public class PalindromPract {

    public static void main(String[] args) {

        String palindrom1 = "Pali";
        String palindrom2 = "Искать такси";

        palindrom2.replace(" ", "");
        String[] ary = palindrom1.split("");
        String testString = "";
        for (int i = 0; i < ary.length; i++) {
            int k = -1;
            testString = palindrom1.substring(k);
            --k;
        }
    }
}
