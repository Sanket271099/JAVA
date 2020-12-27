package Patterns;
import java.util.Scanner;
public class Square_pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {int c=1;
            while(c<=n)
            {
                System.out.print(n);
                c++;
            }
         System.out.println();
         i++;
        }
		

		
	}

}
