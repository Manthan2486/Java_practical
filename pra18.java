class CAR1{
    int topseed;
    String name;
    CAR1(int s, String n){
        this.topseed = s;
        this.name = n;
    }
    public String toString() {
        return "Car Name Is " + name + " ,And The Top Speed Is " + topseed;

    }
}
public class pra18 {
    public static void main(String[] args) {
    CAR1 c1=new CAR1(220, "Fortuner");
    CAR1 c2=new CAR1(250,"Cemry");
    CAR1 c3=new CAR1(350,"BMW M5");
    CAR1 c4=new CAR1(220,"XL6"); 
    CAR1 c5=new CAR1(180,"Alto");
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
    System.out.println(c4.toString());
    System.out.println(c5.toString());
    }
}
