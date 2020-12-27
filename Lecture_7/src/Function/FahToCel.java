package Function;
import java.util.Scanner;
public class FahToCel {
	public static void printFahrenheitTable(int start, int end, int step) {
        for(int i=start;i<=end;i=i+step)
        {
            int Fah=(int)((5/9.0)*(i-32));
            
               System.out.println(i+" "+Fah);
        }
        
}
	
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        printFahrenheitTable(S,E,W);
        
    }
}
