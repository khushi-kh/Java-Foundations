package day5.employeeHierarchy;

public class Developer extends Employee{

    public Developer(String name, int salary) {
        super(name, salary);
    }

    public void attendMeeting() {
        System.out.println("In a call");
    }

    public void work() {
        System.out.println("Writing code");
    }
}


