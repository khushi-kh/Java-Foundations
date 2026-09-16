package day5;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void eat() {
        System.out.println(name + " is eating.");
    }


    public static void main(String[] args) {

        Dog d = new Dog("Kaalu");
        Cat c = new Cat("Peelu");

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}


class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() +" is barking");
    }
}


class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(getName() +" is meowing");
    }
}
