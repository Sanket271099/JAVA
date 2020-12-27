package Patterns;
import java.util.Scanner;
public class Code_char_pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int a;
       while(i<=n)
       { a=64+i;
           int count=1;
           while(count<=i)
           {char c=(char)a;
               System.out.print(c);
               count++;
            a++;
           }
        System.out.println();
        i++;
       }

		
	}

}
