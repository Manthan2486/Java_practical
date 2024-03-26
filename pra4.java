import java.util.Scanner;

public class pra4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a[][]=new int [3][3];
        int b[][]=new int [3][3];
        int r[][]= new int[3][3];
        int i=0;
        int f=0;
        for(i=0;i<=2;i++){
            for(f=0;f<=2;f++){
                System.out.println("Enter Value for first martix : ");
                a[i][f]=sc.nextInt();
            }
            
        }

        System.out.println("First Martix : ");
        for(i=0;i<=2;i++){
            for(f=0;f<=2;f++){
                System.out.print(" "+a[i][f]);
            }
            System.out.println();
        }

        for(i=0;i<=2;i++){
            for(f=0;f<=2;f++){
                System.out.println("Enter Value for second martix : ");
                b[i][f]=sc.nextInt();
            }
            
        }

        System.out.println("Second Martix : ");
        for(i=0;i<=2;i++){
            for(f=0;f<=2;f++){
                System.out.print(" "+b[i][f]);
            }
            System.out.println();
        }

        for (i = 0; i < 3; i++) {
            for (f = 0; f < 3; f++) {
                r[i][f] = a[i][f] + b[i][f];
            }
        }
        
        System.out.println("Resultant Matrix after Addition:");
        for (i = 0; i < 3; i++) {
            for (f = 0; f < 3; f++) {
                System.out.print(r[i][f] + " ");
            }
            System.out.println();
        }
        
    }
}