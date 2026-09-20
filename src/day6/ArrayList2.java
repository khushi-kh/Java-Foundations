package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(19);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(11);

        System.out.println(arrayList);

        System.out.print("Enter the number you want to insert: ");
        int num = sc.nextInt();

        System.out.print("Enter the index at which you want to insert: ");
        int idx = sc.nextInt();

        if (idx >= 0 && idx <= arrayList.size()) {
            arrayList.add(idx, num);
            System.out.println(arrayList);
        } else {
            System.out.printf("Operation Failed: Index value must be between 0 and %d (inclusive)", arrayList.size());
        }


        sc.close();
    }
}
