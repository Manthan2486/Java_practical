class MyClass {
    static int count = 0;

    int number;

    public MyClass(int number) {
        this.number = number;
        count++;
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }

    void displayNumber() {
        System.out.println("Number: " + number);
    }
}

public class pra8{
    
        public static void main(String[] args) {
            MyClass obj1 = new MyClass(10);
            MyClass obj2 = new MyClass(20);
            MyClass obj3 = new MyClass(30);
    
            MyClass.displayCount();
    
            obj1.displayNumber();
            obj2.displayNumber();
            obj3.displayNumber();
        }
   
    
}