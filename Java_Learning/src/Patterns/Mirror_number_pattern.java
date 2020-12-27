package Patterns;
import java.util.Scanner;
public class Mirror_number_pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        { int num=1;
            int Space=1;
            while(Space<=n-i)//for space
            {
                System.out.print(" ");
                
                Space++;
            }
            int count=1;
            while( count<=i)
            {
                System.out.print(num);
                num++;
                count++;
            }
         i++;
         System.out.println();
        }
	
		
	}

}
