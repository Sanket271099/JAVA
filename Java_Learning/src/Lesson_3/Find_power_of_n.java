package Lesson_3;
import java.util.Scanner;
public class Find_power_of_n {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int i=1;
        int d=1;
        while(i<=n)
        { 
                d=d*x;
            i=i+1;
         }
        System.out.println(d);
        

	}
}
