package factorial;

public class factorial {
public static int fact(int n) {
	if(n==0) {
		return 1;
	}
	int Smallerans=fact(n-1);
	return n*Smallerans;
}
public static void main (String args[]){
	int n=19;
	int ans =fact(n);
	System.out.println(ans);
}
}
