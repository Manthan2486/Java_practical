import java.util.Scanner;

public class pra2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value Of A: ");
        int a = sc.nextInt();
        System.out.println("Enter Value Of B: ");
        int b = sc.nextInt();
        System.out.println("Enter Value Of C: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" Is Greater");
        }
        else if(b>a && b>c){
            System.out.println(b+" Is Greater");
        }
        else{
            System.out.println(c+" Is Greater");
        }
    }
}
