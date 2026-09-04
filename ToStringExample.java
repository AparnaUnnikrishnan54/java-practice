class Student1 {

    String name;
    int age;
    double cgpa;

    Student1(String name, int age, double cgpa) { //constructor initializes the object's data
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {    //returns a String representation of the object
        return "Name: " + name +
               ", Age: " + age +
               ", CGPA: " + cgpa;
    }
}

public class ToStringExample {

    public static void main(String[] args) {

        Student1 s = new Student1("Anu", 20, 8.7);

        System.out.println(s);
    }
}

//toString() is used to return a String representation of an object.

//Why @Override?
//toString() is already defined in Java's Object class.Every Java class ultimately inherits from Object.
//So when we write our own toString(): use @Override


//Name: Anu, Age: 20, CGPA: 8.7
