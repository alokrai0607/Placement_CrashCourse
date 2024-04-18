package Day01Assignment;


interface Vehicle {
    void drive();
}

abstract class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving the car");
    }

    abstract void fuelType();
}

class ElectricCar extends Car {
    @Override
    void fuelType() {
        System.out.println("Electric car runs on electricity");
    }
}

class GasCar extends Car {
    @Override
    void fuelType() {
        System.out.println("Gas car runs on gasoline");
    }
}

public class abstraction {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.drive();
        electricCar.fuelType();

        GasCar gasCar = new GasCar();
        gasCar.drive();
        gasCar.fuelType();
    }
}
