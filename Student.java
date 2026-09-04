

public class Student {
    String name;
    int age;
    double cgpa;
    boolean isEnrolled;

    //constructor
    Student(String a,int b,double c ){
        this.name=a;
        this.age=b;
        this.cgpa=c;

    }

    void study(){
        System.out.println(this.name+" is studying");
    }

}
//this.name → object's name
//a      → constructor parameter

