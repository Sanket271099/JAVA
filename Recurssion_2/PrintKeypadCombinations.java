package Recurssion_2;
//Print Keypad Combinations Code
//Send Feedback
//Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
//Note : The order of strings are not important. Just print different strings in new lines.
//Input Format :
//Integer n
//Output Format :
//All possible strings in different lines
//Constraints :
//1 <= n <= 10^6
//Sample Input:
//23
//Sample Output:
//ad
//ae
//af
//bd
//be
//bf
//cd
//ce
//cf
public class PrintKeypadCombinations {
	public static char[] helper(int n) {
		if(n<=1||n>10) {
			System.exit(0);
		}
		if(n==2) {
			char  ans[]= {'a','b','c'};
			return ans;
		}
		if(n==3) {
			char ans[]= {'d','e','f'};
			return ans;
		}
		if(n==4) {
			char ans[]= {'g','h','i'};
			return ans;
		}
		if(n==5) {
			char ans[]= {'j','k','l'};
			return ans;
		}
		if(n==6) {
			char ans[]= {'m','n','o'};
			return ans;
		}
		if(n==7) {
		char ans[]= {'p','q','r','s'};
			return ans;
		}
		if(n==8) {
        char ans[]= {'t','u','v'};	
        return ans;
		}
		else {
			char ans[]= {'w','x','y','z'};
			return ans;
		}
	}
	private static void PrintKeypad(int n,String output) {
		if(n==0) {
			System.out.println(output);
			return;
		}
		int lastnum=n%10;
		char smallans[]=helper(lastnum);
		int remain=n/10;
		for(int i=0;i<smallans.length;i++) {
		PrintKeypad(remain, smallans[i]+output);
		}
	}
		
	public static void PrintKeypad(int n) {
		PrintKeypad(n,"");
	}
public static void main(String[] args) {
	PrintKeypad(99);
}
}
