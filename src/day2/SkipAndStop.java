// Print nos from 1 to 100 but skip nos divisible by 3 and stop when number is 50
package day2;

public class SkipAndStop {

    public static void main(String[] args) {

        for (int i=1; i <=100; i++) {
            if (i == 50) break;
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
