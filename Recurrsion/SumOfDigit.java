package Recurrsion;
//Sum of digits (recursive)
//Send Feedback
//Write a recursive function that returns the sum of the digits of a given integer.
//Input format :
//Integer N
//Output format :
//Sum of digits of N
//Constraints :
//0 <= N <= 10^9
//Sample Input 1 :
//12345
//Sample Output 1 :
//15
//Sample Input 2 :
//9
//Sample Output 2 :
//9
public class SumOfDigit {
	public static int sum(int num) {
		if(num<10) {
			return num;
		}
		int result=num%10;
		result=result+sum(num/10);
		return result;
	}
public static void main(String[] args) {
	System.out.println(sum(1234));
}
}
