import java.util.Scanner;

class Rectangle {
    private double height;
    private double width;
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    public double calculateArea() {
        return height * width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getWidth() {
        return width;
    }
}

public class pra7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());
        
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
