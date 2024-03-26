import java.util.Scanner;

public class pra2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Value Of A: ");
        int a = in.nextInt();
        System.out.println("Enter Value Of B: ");
        int b = in.nextInt();
        System.out.println("Enter Value Of C: ");
        int c = in.nextInt();
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
