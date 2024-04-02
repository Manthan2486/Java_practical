class vehicle_i{
    public void run() {
        System.out.println("Vehicle is running");
    }
}
class car_i extends vehicle_i{
    public void run() {
        System.out.println("Car is running");
    }
}

public class pra17 {
    public static void main(String[] args) {
        car_i c = new car_i();
        vehicle_i v = new vehicle_i();
        v.run();
        c.run();
    }
}