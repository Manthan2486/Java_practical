interface a1{
    void m1();
}

interface a2{
    void m2();
}
class test implements a1, a2{
    public void m1(){
        System.out.println("interface a1");
    }
    public void m2(){
        System.out.println("interface a2");
    }
}
public class pra19 {
    public static void main(String[] args) {
        test obj=new test();
        obj.m1();
        obj.m2();
    }
}