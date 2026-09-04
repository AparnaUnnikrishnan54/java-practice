interface Animal3 {

    void sound(); //is a method without a body
                  //interface is basically saying: Any class that implements me must have a sound() method
}

class Dog3 implements Animal3 {

    @Override
    public void sound() {   //When implementing an interface method, you normally need to make it public
        System.out.println("Dog barks");
    }
}

class Cat3 implements Animal3 {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Dog3 d = new Dog3();
        Cat3 c = new Cat3();

        d.sound();
        c.sound();
    }
}

//Dog barks
// Cat meows


//An interface is like a contract. It tells a class what methods it must provide, but generally not how to implement them