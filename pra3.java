import java.util.Scanner;

public class pra3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter Value: ");
        int a=in.nextInt();
        int temp=0;
        int n=0;
        while (a>0) {
            n=a%10;
            temp=temp*10+n;
            a=a/10;
        }
        System.out.print("\nReverse Of Given Digits: ");
        System.out.println(temp);

    }
}