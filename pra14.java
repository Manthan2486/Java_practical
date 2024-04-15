class car{
    void crun() {
        System.out.println("Car is running");
    }
} 
class bike extends car{
    void brun() {
        System.out.println("Bike is running");
    }
}
public class pra14 {
    public static void main(String[] args) {
        bike obj = new bike();
        obj.brun();
        obj.crun();
    }   
}