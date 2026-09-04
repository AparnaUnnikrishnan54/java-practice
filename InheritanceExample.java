class Animal {  //parent/superclass

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog inherits Animal
class Dog extends Animal {  

    void bark() {  //Because Dog extends Animal, Dog can use eat(). Dog also has its own method bark()
        System.out.println("Dog is barking");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Dog d = new Dog(); //Dog object

        d.eat();   // inherited method
        d.bark();  // Dog's own method
    }
}



// Dog : The type/class of the object.
// d : The reference variable.
// new : Creates a new object in memory.
// Dog() : Calls the constructor of Dog

// What is inheritance?
// Inheritance is an OOP mechanism where a child class acquires the properties and methods of a parent class.

//  keyword  used for inheritance in Java is extends

// main advantage of inheritance is Code reusability.