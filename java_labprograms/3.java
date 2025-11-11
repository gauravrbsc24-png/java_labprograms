// ElectricCarDemo.java

// Base Class: Vehicle
class Vehicle {
    String brand;
    int year;

    // Constructor
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display info
    void displayInfo() {
        System.out.println("🚗 Vehicle Brand: " + brand);
        System.out.println("Manufacture Year: " + year);
    }
}

// Derived Class: Car
class Car extends Vehicle {
    String model;

    // Constructor
    Car(String brand, int year, String model) {
        super(brand, year); // calling Vehicle constructor
        this.model = model;
    }

    // Overriding method
    @Override
    void displayInfo() {
        super.displayInfo(); // calling parent displayInfo()
        System.out.println("Car Model: " + model);
    }
}

// Derived Class: ElectricCar
class ElectricCar extends Car {
    int batteryCapacity;

    // Constructor
    ElectricCar(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model); // calling Car constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding method
    @Override
    void displayInfo() {
        super.displayInfo(); // calling parent displayInfo()
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh ⚡");
        System.out.println("----------------------------------------");
    }
}

// Main Class
public class ElectricCarDemo {
    public static void main(String[] args) {
        // Creating objects
        Vehicle v1 = new Vehicle("Tata Motors", 2018);
        Car c1 = new Car("Hyundai", 2020, "i20");
        ElectricCar e1 = new ElectricCar("Tesla", 2024, "Model Y", 75);

        // Displaying details
        System.out.println("=== Vehicle Information ===");
        v1.displayInfo();

        System.out.println("\n=== Car Information ===");
        c1.displayInfo();

        System.out.println("\n=== Electric Car Information ===");
        e1.displayInfo();
    }
}
