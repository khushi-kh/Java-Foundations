package day4;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {7, 7};

        if (arr == null) {
            System.out.println("Null Array");
        } else if (arr.length < 2) {
            System.out.println("No second largest value");
        } else {

            int largest = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            boolean hasSecond = false;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > largest) {
                    if (largest != Integer.MIN_VALUE || i > 0) {
                        second = largest;
                        hasSecond = true;
                    }
                    largest = arr[i];
                } else if (arr[i] < largest && arr[i] > second) {
                    second = arr[i];
                    hasSecond = true;
                }
            }

            if (hasSecond) {
                System.out.println("Second largest distinct element of the array is " + second);
            } else {
                System.out.println("No second largest value found");
            }
        }
    }
}
