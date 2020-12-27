package Recurrsion;
//Check Palindrome (recursive)
//Send Feedback
//Check whether a given String S is a palindrome using recursion. Return true or false.
//Input Format :
//String S
//Output Format :
//'true' or 'false'
//Constraints :
//0 <= |S| <= 1000
//where |S| represents length of string S.
//Sample Input 1 :
//racecar
//Sample Output 1:
//true
//Sample Input 2 :
//ninja
//Sample Output 2:
//false
public class palindrome_Recursivly {
	public static boolean palindrome(String input){
		int start=0;
		int end=input.length()-1;
		return helper(input,start,end);
	}
	private static boolean helper(String input,int start,int end) {
	if(input.charAt(start)==input.charAt(end)) {
		if(start==end||start>end) {
			return true;
		}
		start++;
		end--;
	}else {
		return false;
	}
boolean t=helper(input,start,end);
if(t==false) {
	return false;
}else {
return  true;
	}
}
	


public static void main(String[] args) {
	System.out.println(palindrome("ninja"));
}
}
