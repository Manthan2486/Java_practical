import java.util.Scanner;

class Student {
    public String name;
    public int rollno;
    public String div;
    
    Student(String n, int r) {
        name = n;
        rollno = r;
    }
    
    Student(String n, int r, String d) {
        name = n;
        rollno = r;
        div = d;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Division: " + div);
    }   
}

public class pra12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Rollno: ");
        int rollno = sc.nextInt();
        System.out.print("Enter Division: ");
        String div = sc.next();
        Student s1 = new Student(name, rollno);
        Student s2 = new Student(name, rollno, div);
        s1.display();
        s2.display();
    }
}
