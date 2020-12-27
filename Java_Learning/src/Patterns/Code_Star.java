package Patterns;
import java.util.Scanner;
public class Code_Star {
	public static void main(String[] args) {
       	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=1;
	while(i<=n)
	{int v=i;
	int l=1;
		int space=1;
		while(space<=n-i)//SPACE
		{
			System.out.print(" ");
			space=space+1;
			
		}
		int j=1;
		while(j<=v)//NUMBER
		{
			System.out.print("*");
			j=j+1;
			
			
		}
		while(l<i)
		{
			System.out.print("*");
			l=l+1;
		}
		while(space<=n-i)//SPACE
		{
			System.out.println(" ");
			space=space+1;
		}
		
		i=i+1;
		System.out.println("");
	
		
	

		
	}
    }


}
