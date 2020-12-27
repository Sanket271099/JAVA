package Recurrsion;
//Geometric Sum
//Send Feedback
//Given k, find the geometric sum i.e.
//1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
//using recursion.
//Input format :
//Integer k
//Output format :
//Geometric sum
//Constraints :
//0 <= k <= 1000
//Sample Input 1 :
//3
//Sample Output 1 :
//1.875
//Sample Input 2 :
//4
//Sample Output 2 :
//1.93750
public class geometric_sum {
	public static double geomatric_sum(int k) {
		if( k==0) {
			return 1;
		}
		double sum=(double)(1.0/Math.pow(2, k)+geomatric_sum(k-1));
		return sum;
	}
public static void main(String[] args) {
	double k=geomatric_sum(3);
	System.out.println(k);
}
}
