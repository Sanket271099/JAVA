package Patterns;
import java.util.Scanner;

public class Inverted_number_pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int r=n;
        while(i<=n)
        {int count =1;
            while(count<=r)
            {
                System.out.print(r);
                count++;
            }
         r=r-1;
         i=i+1;
         System.out.println();
         
        }
	

		
	}


}
