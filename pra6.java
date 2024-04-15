import java.util.Scanner;

class Student {
    int Enrollment;
    String Name;

    void display() {
        System.out.println("Student Enrollment Is: " + Enrollment);
        System.out.println("Student Name Is: " + Name);
    }
}

public class pra6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        System.out.println("Enter Student 1 Enrollment: ");
        stu1.Enrollment = sc.nextInt();
        System.out.println("Enter Student 1 Name: ");
        stu1.Name = sc.next();
        System.out.println("Enter Student 2 Enrollment: ");
        stu2.Enrollment = sc.nextInt();
        System.out.println("Enter Student 2 Name: ");
        stu2.Name = sc.next();
        System.out.println("Enter Student 3 Enrollment: ");
        stu3.Enrollment = sc.nextInt();
        System.out.println("Enter Student 3 Name: ");
        stu3.Name = sc.next();
        System.out.println(" \n Details Of Student Is: ");
        stu1.display();
        stu2.display();
        stu3.display();
    }
}