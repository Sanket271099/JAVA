package Patterns;
import java.util.Scanner;
public class Diamond_Star {
	public static int intput()
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		return n;
	}
	public static void diamondOfStars(int n) {
		
        int half=n/2+1;{
        for(int i=1;i<=half;i++)
        {for(int j=1;j<=half-i;j++)
        {
            System.out.print(" ");
        }for(int j=1;j<=2*i-1;j++)
            {System.out.print("*");
        }
        System.out.println();
        }
        int of=n-half;
        for(int i=of;i>=1;i--)
        {
        	for(int j=1;j<=half-i;j++) 
        {
        	System.out.print(" ");
        }
        for(int k=1;k<=i*2-1;k++)
        {
        	System.out.print("*");
        }
        	System.out.println();
        
        

        }

}
}
	public static void main(String args[])
	{
		int k=intput();
		diamondOfStars(k);
	}

}
