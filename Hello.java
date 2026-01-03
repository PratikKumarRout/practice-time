// challenge 1
public class Hello {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        WashingMachine wash = new WashingMachine();
        wash.doWork();
        wash.turnOn();
        cat.makeSound();
        dog.makeSound();
    }
}

abstract class Appliance {
    void turnOn() {
        System.out.println("Powering on.....");
    }

    abstract void doWork();
}

class WashingMachine extends Appliance{
    @Override
    void doWork() {
        System.out.println("Washing clothes......");
    }
}

abstract class Animal {

    abstract void makeSound();

}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("meow !");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("woof!");
    }
}