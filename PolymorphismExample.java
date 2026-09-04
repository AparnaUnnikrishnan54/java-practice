class Animal2 {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog2 extends Animal2 {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat2 extends Animal2 {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {

        Animal2 a1 = new Dog2();
        Animal2 a2 = new Cat2();

        a1.sound();
        a2.sound();
    }
}

// Dog barks
// Cat meows

//Polymorphism means one reference or interface can represent different forms of objects and produce different behavior.

//here runtime polymorphism