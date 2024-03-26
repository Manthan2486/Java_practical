import java.util.Scanner;

public class pra5 {
    public static void main(String[] args) 
    {
        System.out.print("Enter N Number:");
        Scanner scan = new Scanner(System.in);
    
        int N = scan.nextInt();
        int x = 2;
    
        for(int i = 0; i <= N; i++)
        {
            int count = 0;
    
            for(int j = 1; j <= x; j++)
                if(x%j == 0)
                    count++;
    
            if(count == 2)
                System.out.print(x + " ");
    
            x++;
        }
    }
}