class staticex{
    static int count = 0;

    static void incrementCount() {
        count++;
        System.out.println("Count: " + count);
    }

    
}
public class pra9 {
    public static void main(String[] args) {
        staticex.incrementCount();

        staticex obj = new staticex();
        obj.incrementCount();
        obj.incrementCount();
    }
}
