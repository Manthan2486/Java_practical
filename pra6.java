import java.util.Scanner;
class Student {
    int Enrollment;
    String Name;
    void display(){
        System.out.println("Student Enrollment Is: " + Enrollment);
        System.out.println("Student Name Is: " + Name);
    }
}
public class pra6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println("Enter Student 1 Enrollment: ");
        s1.Enrollment = sc.nextInt();
        System.out.println("Enter Student 1 Name: ");
        s1.Name = sc.next();
        System.out.println("Enter Student 2 Enrollment: ");
        s2.Enrollment = sc.nextInt();
        System.out.println("Enter Student 2 Name: ");
        s2.Name = sc.next();
        System.out.println("Enter Student 3 Enrollment: ");
        s3.Enrollment = sc.nextInt();
        System.out.println("Enter Student 3 Name: ");
        s3.Name = sc.next();
        System.out.println(" \n Details Of Student Is: ");
        s1.display();
        s2.display();
        s3.display();
    }
} 