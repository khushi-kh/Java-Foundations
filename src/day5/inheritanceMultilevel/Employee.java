package day5.inheritanceMultilevel;

public class Employee extends Person{

    private final int id;

    public Employee(String name, int id) {

        super(name);

        if (id < 1) {
            throw new IllegalArgumentException("Id must be positive");
        }
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Id: " + this.id);
    }
}
