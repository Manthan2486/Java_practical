import java.util.Scanner;

class Shape {
    public float area(float r) {
        return (float) (Math.PI * r * r);
    }

    public float area(float l, float r) {
        return l * r;
    }

public class pra11 {
        public static void main(String[] args) {
            
            Scanner in=new Scanner(System.in);
            Shape shape = new Shape();
            System.out.print("Enter Radius:");
            float Radius = in.nextFloat();
            float Area = shape.area(Radius);
            System.out.println("Area of circle with radius " + Radius + " Area: " + Area );
        
            System.out.print("Enter Length:");
            float rLength =in.nextFloat();
            System.out.print("Enter Width:");
            float rWidth = in.nextFloat();
            float rArea = shape.area(rLength, rWidth);
            System.out.println("Area of rectangle with length: " + rLength + ", width: " + rWidth + ", Area Of Rectangle: " + rArea);
        }
    }
    
}
