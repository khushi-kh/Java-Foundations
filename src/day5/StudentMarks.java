package day5;

public class StudentMarks {

    private int marks;

    public StudentMarks(int marks) {
        setMarks(marks);
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }

        this.marks = marks;
    }

    public int getMarks() {
        return this.marks;
    }

    public char getGrade() {

        if (marks >= 90) return 'A';
        if (marks >= 80) return 'B';
        if (marks >= 70) return 'C';
        if (marks >= 60) return 'D';
        if (marks >= 35) return 'E';

        return 'F';
    }

    public static void main(String[] args) {

        StudentMarks sm = new StudentMarks(60);

        //sm.setMarks(95);

        System.out.println(sm.getMarks());

        System.out.println(sm.getGrade());
    }

}
