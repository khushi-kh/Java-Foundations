package day5.inheritanceMultilevel;

public class Manager extends Employee{

    private int salary;

    public Manager(String name, int id, int salary) {

        super(name, id);

        if (salary < 0) {
            throw new IllegalArgumentException("Salary can't be negative.");
        }

        this.salary = salary;
    }

    public int calculatePackage() {
        return 12 * salary;
    }
}
