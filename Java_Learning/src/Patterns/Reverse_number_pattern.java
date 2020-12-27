package Patterns;
import java.util.Scanner;
public class Reverse_number_pattern {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
     
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        { int c=1;
         int k=i;
            while(c<i)
            {
                System.out.print(k);
                c++;
                k--;
            }
         System.out.print("1");
         System.out.println();
         i++;
        }
		
	}
}
