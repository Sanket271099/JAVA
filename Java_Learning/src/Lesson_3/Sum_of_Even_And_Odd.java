package Lesson_3;
import java.util.Scanner;
public class Sum_of_Even_And_Odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d;
		int sumeven=0;
		int sum_odd=0;
while(n!=0)
{
	d=n%10;
	if(d%2==0)
	{
		sumeven=sumeven+d;
		
	}
	else
	{
		sum_odd=sum_odd+d;
	}
	n=n/10;
	
}
System.out.println(sumeven+" "+sum_odd);
		

	}
}
