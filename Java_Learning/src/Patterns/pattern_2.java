package Patterns;
import java.util.Scanner;
public class pattern_2 {

	public static void main(String[] args) {
	
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        
        while(i<=n)
        { int col=i;
            int space=1;
         while(space<=n-i)
         {
             System.out.print(" ");
             space=space+1;
         }
         int j=1;
         while(j<=i)
         {
             System.out.print(col);
             j=j+1;
             col=col+1;
         }
         System.out.println("");
         i=i+1;
            
        }
		
	}

}
