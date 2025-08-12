
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

public class Single {
    public static void main(String[] args) {
        
        Car obj = new Car();
    }
}