package Lesson_2;
import java.util.Scanner;
public class Average_marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String str=s.next();
        char c=str.charAt(0);
        int t1=s.nextInt();
        int t2=s.nextInt();
        int t3=s.nextInt();
        
        int r=(t1+t2+t3)/3;
        
        System.out.println(c);
        System.out.println(r);
	
	}

}
