class Calculator {

    // 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Different data types
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(10.5, 20.5));
    }
}

//Method overloading is defining multiple methods with the same name but different parameter lists in the same class.

// Same method name + different parameters = Method Overloading
// Parameters can differ by:
// Number
// Data type
// Order

//Method overloading is called compile-time polymorphism because Java determines which add() method to call based on the arguments