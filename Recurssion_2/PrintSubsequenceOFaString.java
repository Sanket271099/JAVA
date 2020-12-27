package Recurssion_2;

public class PrintSubsequenceOFaString {
	
	private static void PrintSubsequence(String input,String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		PrintSubsequence(input.substring(1),output);
		PrintSubsequence(input.substring(1), output+input.charAt(0));
	}
	public static void PrintSubsequence(String input) {
		PrintSubsequence(input, " ");
	}
public static void main(String[] args) {
	PrintSubsequence("xyz");
}
}
