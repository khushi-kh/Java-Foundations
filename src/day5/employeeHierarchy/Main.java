package day5.employeeHierarchy;

public class Main {

    public static void main(String[] args) {

        Manager m = new Manager("Michael Scott", 50000);
        Developer d = new Developer("Jim Halpert", 25000);

        m.setSalary(100000);

        d.setSalary(75000);

        System.out.println("Manager Details");

        m.displayDetails();
        m.addEmployee();
        m.createMeeting();

        System.out.println();

        System.out.println("Developer Details");

        d.displayDetails();
        d.work();
        d.attendMeeting();
    }
}
