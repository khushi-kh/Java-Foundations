package day5;

public class Employee {

    private final String name;
    private final int id;
    private int salary;

    public Employee(String name) {
        this(name, 0, 0);
    }

    public Employee(String name, int id) {
        this(name, id, 0);
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.printf("Name: %s, ID: %d, Salary: %d %n", name, id, salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Emily", 1002);
        Employee e3 = new Employee("Tara", 3452, 50000000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
