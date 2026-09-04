
class Animal1 { //parent class

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {   

    // Overriding parent method
    @Override
    void sound() {  //Dog1 inherits from Animal1.So Dog1 gets the sound() method from its parent.
        System.out.println("Dog barks");  //But Dog wants its own version of sound().
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {

        Dog1 d = new Dog1();

        d.sound();
    }
}

//What is method overriding?
//Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

// Same method name + same parameters + inheritance = Overriding

// It is runtime polymorphism.