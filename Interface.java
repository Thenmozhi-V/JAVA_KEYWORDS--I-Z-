interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
