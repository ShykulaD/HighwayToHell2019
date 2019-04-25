package lesson4_homeTask;

public class SmallestNumberFrom4Int {
    public static void main(String[] args) {
        int i1 = 22;
        int i2 = 3;
        int i3 = 34;
        int i4 = 5;

        if (i1 < i2 && i1 < i3 && i1 < i4) {
            System.out.println("i1");
        } else if (i2 < i1 && i2 < i3 && i2 < i4) {
            System.out.println("i2");
        } else if (i3 < i1 && i3 < i2 && i3 < i4) {
            System.out.println("i3");
        } else {
            System.out.println("i4");
        }

    }
}
