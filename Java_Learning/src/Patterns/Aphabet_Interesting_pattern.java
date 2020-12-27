package Patterns;
import java.util.Scanner;
public class Aphabet_Interesting_pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int d=1;
        int k=n;
        while(i<=n)
        {
            d=65+k-1;
            int count=1;
            while(count<=i)
            {char ap=(char)d;
                System.out.print(ap);
                count++;
             d++;
             
            }
        
        System.out.println();
            i++;
            k--;
        }
        
	}

}
