package lesson4;

public class SwitchExample {
    public static void main(String[] args) {
        String name = "Jack";
        switch (name) {
            case "Jack":
                System.out.println("Jack"); break;
            case "new":
                System.out.println("new"); break;
                default:
                    System.out.println("Final");
        }
    }
}
