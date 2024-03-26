class finalex{
    final int C = 10;

    final void displayConstant() {
        System.out.println("Constant value: " + C);
    }
}
public class pra10 {
    public static void main(String[] args) {
        finalex obj = new finalex();
        
        obj.displayConstant();
    }
}
