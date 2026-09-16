package day5;

public class Student {

    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;

    }

    public void displayDetails() {
        System.out.printf("| %-12s | %-12d | %-12d |%n", name, rollNumber, marks);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Khushi", 1, 95);
        Student s2 = new Student("Jon Snow", 2, 85);
        Student s3 = new Student("Ygritte", 3, 90);

        System.out.printf("%10s%n","Student Details");
        System.out.println("---------------------------------------------");

        System.out.printf("| %-12s | %-12s | %-12s |%n", "Name", "Roll No.", "Marks");
        System.out.println("---------------------------------------------");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
