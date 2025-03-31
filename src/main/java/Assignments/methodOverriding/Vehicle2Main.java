package Assignments.methodOverriding;

public class Vehicle2Main {
    public static void main(String[] args) {
        Vehicle2 car = new Car1();
        Vehicle2 bike = new Bike1();
        car.start();
        bike.start();
        car.stop();
        bike.stop();
    }
}
class Vehicle2 {
    void start() { System.out.println("Vehicle is starting..."); }
    void stop() { System.out.println("Vehicle is stopping..."); }
}

class Car1 extends Vehicle2 {
    @Override
    void start() { System.out.println("Car is starting..."); }
    @Override
    void stop() { System.out.println("Car is stopping..."); }
}

class Bike1 extends Vehicle2 {
    @Override
    void start() { System.out.println("Bike is starting..."); }
    @Override
    void stop() { System.out.println("Bike is stopping..."); }
}
