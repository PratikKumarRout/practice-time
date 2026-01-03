// challenge 2
public class Hello {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 889;
        myCar.doors = 4;
        myCar.showSpeed();
        System.out.println(myCar.doors);

        myCar.move();
        
    }
}

class Vehicle {
    int speed;

    void showSpeed() {
        System.out.println(speed);
    }

    void move() {
        System.out.println("Moving.....");
    }
}

class Car extends Vehicle {
    int doors;

    void move() {
        System.out.println("Driving on 4 wheels.....");
    }

}