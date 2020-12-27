package Patterns;
import java.util.Scanner;
public class Star_pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
    int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int space =1;
            while(space<=n-i)
            {
                System.out.print(" ");
                space=space+1;
            }
            int v=1;
            while(v<=i)
            {
                System.out.print("*");
                v=v+1;
            }
           int l=1;
            while(l<i)
            {
                System.out.print("*");
                l=l+1;
            }
            i=i+1;
            System.out.println("");
        }
	
	}
}
