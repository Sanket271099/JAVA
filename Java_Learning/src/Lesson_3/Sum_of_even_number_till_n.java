package Lesson_3;
import java.util.Scanner;
public class Sum_of_even_number_till_n {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0;
        int i=1;
       while(i<=num)
       {
           if(i%2==0)
           {
               sum=sum+i;
              
           }
           i=i+1;
       }
        System.out.print(sum);
	}

}
