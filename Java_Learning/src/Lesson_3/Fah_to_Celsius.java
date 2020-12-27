package Lesson_3;
import java.util.Scanner;
public class Fah_to_Celsius {
public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        int new_cel=0;
        while(S<=E)
        {
            if( S<=E )
            { 
                System.out.print(S);
                new_cel=(int)((5/9.0)*(S-32));
                S=S+W;
                
            }
            System.out.println("\t"+new_cel);
        }
        return;
		
		
	}
}
