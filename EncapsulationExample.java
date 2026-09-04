class Student {

    private String name;  //private means:These variables cannot be directly accessed from outside the Student class.
    private int age;                 //This is the data hiding part of encapsulation.

    // Setter
    public void setName(String name) {  //A setter is used to set/change the value of a private variable.
        this.name = name;
    }

    // Getter
    public String getName() {  //A getter is used to get/read the value of a private variable.
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Anu");  //We use the setter methods to modify the private data.
        s.setAge(20);

        System.out.println(s.getName());  //We use the getter methods to access the private data
        System.out.println(s.getAge());
    }
}

//Encapsulation = Data hiding + controlled access

// What is encapsulation?
// Encapsulation is the process of binding data and methods together in a class and controlling access to the data.

// How do we achieve encapsulation in Java?
// By making variables private and providing public getters and setters.

// Why use private?
// To hide data and prevent direct access from outside the class.