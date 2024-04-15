abstract class Shape1 {
    abstract double area();
}

class Triangle extends Shape1 {
    private double base;
    private double height;

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape1 {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape1 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class pra20 {
    public static void main(String[] args) {
        Shape1 triangle = new Triangle(5, 8);
        System.out.println("Area of Triangle: " + triangle.area());

        Shape1 rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Shape1 circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.area());
    }

}
