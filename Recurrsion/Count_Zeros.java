package Recurrsion;
//Count Zeros
//Send Feedback
//Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
//Input Format :
//Integer N
//Output Format :
//Number of zeros in N
//Constraints :
//0 <= N <= 10^9
//Sample Input 1 :
//10204
//Sample Output 1 :
//2
//Sample Input 2 :
//708000
//Sample Output 2 :
//4
public class Count_Zeros {
	public static int count(int num) {
		return count(num,0);
	}
	
	private static int count(int num,int result) {
		if(num==0) {
			return result;
		}
		if(num%10==0) {
			result=result+1;
			num=num/10;
		}else {
			num=num/10;
		}
		return count(num,result);
	}
public static void main(String[] args) {
	int result=count(10200034);
System.out.println(result);
}
}
