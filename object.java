
class Car {

    String brand;
    String color;
}

public class object {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.color = "Red";

        System.out.println(car1.brand);
        System.out.println(car1.color);
    }
}