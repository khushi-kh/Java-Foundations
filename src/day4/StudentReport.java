package day4;

public class StudentReport {

    public static void main(String[] args) {

        String name1 = "Jon Snow";
        int rollNo1 = 102;
        double marks1 = 87.56784;
        double percentage1 = 87.6849305;

        String name2 = "Ygritte";
        int rollNo2 = 103;
        double marks2 = 92.759;
        double percentage2 = 92.795;

        System.out.println("Student Report");
        System.out.println("------------------------------------------------");

        System.out.printf("%-15s %-12s %10s %13s%n",
                "Name", "Roll No.", "Marks", "Percentage");

        System.out.println("------------------------------------------------");

        System.out.printf("%-15s %-12d %10.2f %12.2f%%%n",
                name1, rollNo1, marks1, percentage1);

        System.out.printf("%-15s %-12d %10.2f %12.2f%%%n",
                name2, rollNo2, marks2, percentage2);
    }
}