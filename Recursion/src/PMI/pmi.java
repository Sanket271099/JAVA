package PMI;

public class pmi {

public static int sum(int n) {
	if(n==1){
		return 1;
	}
	return n+sum(n-1 );
}
public static void main(String args[]) {
	int n=2;
	int natural_no= sum(n);
	System.out.println(natural_no);
	
}
}
