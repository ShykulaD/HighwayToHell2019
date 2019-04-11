package lesson6;

public class lesson6_homeTask {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,6,6,6,7,8,9,0,1111};
        int maxNumber = arr[0];
        int minNumber = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }


        for (int i = arr.length-1; i < arr.length ; i--) {
            if (arr[i] > minNumber) {
                minNumber = arr[i];
            }
        }

        System.out.println("Max number " + maxNumber);
    }
}
