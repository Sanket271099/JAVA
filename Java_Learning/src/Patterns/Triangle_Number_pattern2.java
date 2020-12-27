package Patterns;
import java.util.Scanner;
public class Triangle_Number_pattern2 {
	public static void main(String[] args) {
      	Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int i=1;
       
       int d;
     
   
       while(i<=n)
       {    int k=1;
    	   int count=1;
       int space=1;
       d=i;
       int g=1;
    
    	   while(space<=n-i) {
    		   System.out.print(" ");
    		  space++; 
    		  }
    	   while(count<=i)
    	   {
    		   System.out.print(d);
    		   d=d+1;
    		  
    		   count++;
    		
    	
    		
    	   
    	   }
    	  
    while(g<i)
    {
    	System.out.print(d-2);
    	g++;
    	d--;
    	
    }
    	 System.out.println();
    	   i=i+1;
    	 
    	 
       }
		
        
	}

}
