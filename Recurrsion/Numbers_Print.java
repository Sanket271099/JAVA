package Recurrsion;

public class Numbers_Print {
public void print(int n) {
	if(n==1) {
		
		System.out.print(n+" s");
		return;
		
		
		
		
		
		
		
		
		
		
	}
	print(n-1);
	System.out.print(n+" ");
}
}
