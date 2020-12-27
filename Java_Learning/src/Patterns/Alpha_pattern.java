package Patterns;
import java.util.Scanner;
public class Alpha_pattern {
	public static void main(String[] args) {
		   
		 int at=65;
				Scanner s=new Scanner(System.in);
			        int n=s.nextInt();
			        int i=1;
			        while(i<=n)
			        {   
			        char p=(char)at;
			            int c=1;
			            while(c<=i)
			            {
			                System.out.print(p);
			               
			                c++;
			            }
			         System.out.println();
			         i++;
		                 at++;
			        }

				
			}


}
