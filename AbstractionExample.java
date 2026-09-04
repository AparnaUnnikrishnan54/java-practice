abstract class Vehicle { //An abstract class is a class that is meant to be inherited by other classes.

    // Abstract method
    abstract void start();    //no body , only method declaration. The child classes decide the actual implementation.

    // Normal method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    @Override
    void start() {  //Car must provide an implementation for the abstract start() method.
        System.out.println("Car starts with a key");
    }
}

public class AbstractionExample {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.stop();
    }
}

//Car starts with a key
// Vehicle stopped


//Abstraction is the process of hiding implementation details and showing only essential functionality.