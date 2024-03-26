class Car {
    public void shows() {
        System.out.println("I Like Cars..");
    }
}

class Bike extends Car {
    @Override
    public void shows() {
        System.out.println("I Like Bikes To!");
    }
}
public class pra17 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.shows();

        bike.shows();
    }
}
