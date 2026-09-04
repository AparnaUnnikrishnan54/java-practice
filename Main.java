
public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Anu",20,8.7);
        Student s2=new Student("John",21,7.9);

        System.out.println(s1.name);
        System.out.println(s2.name);

        s1.study();
    }
}
