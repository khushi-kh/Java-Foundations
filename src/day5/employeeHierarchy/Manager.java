package day5.employeeHierarchy;

public class Manager extends Employee {

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void addEmployee() {
        System.out.println("Employee added");
    }


    public void createMeeting() {
        System.out.println("Meeting created");
    }
}
