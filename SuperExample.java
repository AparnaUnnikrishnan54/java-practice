class Animal {

    String name = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    String name = "Dog"; //Now there are two name variables:This is where super becomes useful.

    void display() {

        System.out.println(super.name);  // Access parent variable
        super.sound();                   // Call parent method
        System.out.println(name);        // Access child variable

    }
}

public class SuperExample {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();
    }
}

//super is a keyword used to refer to the immediate parent class

// It can be used to:

// Access parent variable
// Call parent method
// Call parent constructor


// Animal
// Animal makes a sound
// Dog