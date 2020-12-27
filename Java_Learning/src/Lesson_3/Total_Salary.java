package Lesson_3;
import java.util.Scanner;
public class Total_Salary {
	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
		     int n=s.nextInt();
		   String str=s.next();
		       char c=str.charAt(0);
		       int cn=(int)c;
		      double hra=0;
		       hra=n/10.0*2;
		      double da=(n/10.0*5);
		       double Sal=0;
		       double pf=(n/10.0*1.1);
		       if(cn==65)
		       {
		           Sal=hra+da+1700-pf+n;
		       }
		       else if(cn==66) 
		       {
		           Sal=hra+da+1500-pf+n;
		       }
		       else if(cn>66)
		       {
		           Sal=hra+da+1300-pf+n;
		       }
		       long salary=Math.round(Sal);
		        System.out.println(salary);
			}

}
