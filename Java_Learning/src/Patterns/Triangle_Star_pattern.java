package Patterns;
import java.util.Scanner;
public class Triangle_Star_pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {int c=1;
         while(c<=i)
         {
             System.out.print("*");
                 c++;
         }
         System.out.println();
         i++;
        }

		
	}


}
