package day5.employeeHierarchy;

public class Employee {

    private final String name;
    private int salary;


    Employee(String name, int salary) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if (!isValidSalary(salary)) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.name = name;
        this.salary = salary;
    }


    public boolean isValidSalary(int salary) {
        return salary >= 0;
    }


    public void setSalary(int salary) {

        if (!isValidSalary(salary)) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.salary = salary;

    }


    public int getSalary() {
        return salary;
    }


    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}
