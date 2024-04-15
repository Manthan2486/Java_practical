final class FinalClass {
    private int value;

    public FinalClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class pra21 extends FinalClass {
    public static void main(String args[]) {
        FinalClass finalObj = new FinalClass(10);
        System.out.println("Value: " + finalObj.getValue());
    }
}