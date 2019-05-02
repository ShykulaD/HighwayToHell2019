package lessonTest;

public class TestExample456 {

    public static void main(String[] args) {
        String str = "a";

        if (str.length() >= 2 ) {
            System.out.println(str.substring(1, str.length() - 1));
        } else {
            System.out.println(str);
        }

    }
}
