package Patterns;
import java.util.Scanner;
public class pattern_1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{int c=1;
		int k=i;
			while(c<=i)
			{
				System.out.print(k);
				k++;
				c++;
			}
			System.out.println();
			i++;
		}
		
	}
}
