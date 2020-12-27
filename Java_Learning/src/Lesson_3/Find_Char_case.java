package Lesson_3;
import java.util.Scanner;
public class Find_Char_case {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char c=str.charAt(0);
        int num=(int)c;
        if(num>=65 && num<=90)//for Upper case
        {
            System.out.println("1");
            return;
        }
else if(num>=97 && num<= 122)//for Lower Case
{
    System.out.println("0");
    
    return;
        
}
        System.out.println("-1");
	}

}
