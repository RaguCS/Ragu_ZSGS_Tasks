package Assignments.inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);
        car.displayInfo();

        Bike bike = new Bike("Yamaha", 120, true);
        bike.displayInfo();

        Truck truck = new Truck("Volvo", 100, 10);
        truck.displayInfo();
    }
}
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle Constructor Called");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
        System.out.println("Car Constructor Called");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
        System.out.println("Bike Constructor Called");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
        System.out.println("Truck Constructor Called");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
