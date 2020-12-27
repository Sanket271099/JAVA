package Recurssion_2;
//Staircase
//Send Feedback
//A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
//Input format :
//Integer N
//Output Format :
//Integer W
//Constraints :
//1 <= N <= 30
//Sample Input 1 :
//4
//Sample Output 1 :
//7
//Sample Input 2 :
//5
//Sample Output 2 :
//13
public class stairCase {
	public static int stair(int n) {
		if(n==1||n==0) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else 
		return stair(n-3)+stair(n-2)+stair(n-1);
	
		}
public static void main(String[] args) {
	System.out.println(stair(5));
}
}
