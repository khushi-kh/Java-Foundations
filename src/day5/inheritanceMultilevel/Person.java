package day5.inheritanceMultilevel;

public class Person {

    private final String name;


    Person(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void greet() {
        System.out.println("Hello, " + this.name);
    }
}
