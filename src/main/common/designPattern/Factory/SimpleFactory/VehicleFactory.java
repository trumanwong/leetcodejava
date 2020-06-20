package designPattern.Factory.SimpleFactory;

class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle");
    }
}

class Bike extends Vehicle {
    public Bike() {
        System.out.println("Bike");
    }
}

class Car extends Vehicle {
    public Car() {
        System.out.println("Car");
    }
}

class Truck extends Vehicle {
    public Truck() {
        System.out.println("Truck");
    }
}

public class VehicleFactory {
    public enum VehicleType {
        Bike, Car, Truck;
    }

    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Bike)) {
            return new Bike();
        }
        if (type.equals(VehicleType.Car)) {
            return new Car();
        }
        if (type.equals(VehicleType.Truck)) {
            return new Truck();
        }
        return null;
    }
}
