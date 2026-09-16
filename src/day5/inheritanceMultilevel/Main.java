package day5.inheritanceMultilevel;

public class Main {

    public static void main(String[] args) {

        Manager obj = new Manager("Khushi", 1, 500000);

        obj.greet();
        obj.displayDetails();
        System.out.println(obj.calculatePackage());
    }
}
