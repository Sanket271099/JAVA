package Recurssion_2;
//Remove Duplicates Recursively
//Send Feedback
//Given a string S, remove consecutive duplicates from it recursively.
//Input Format :
//String S
//Output Format :
//Output string
//Constraints :
//1 <= |S| <= 10^3
//where |S| represents the length of string
//Sample Input 1 :
//aabccba
//Sample Output 1 :
//abcba
//Sample Input 2 :
//xxxyyyzwwzzz
//Sample Output 2 :
//xyzwz
public class RemoveDuplicateRecurssive {
	public static String Remove(String str) {
if(str.length()==1) {
	return str;
}String ans="";
if(str.charAt(0)!=str.charAt(1)) {
	ans=str.charAt(0)+ans;
}else {
	ans=ans;
}
String smallAns=Remove(str.substring(1));
return ans+smallAns;
	}
	
public static void main(String[] args) {
System.out.println(Remove("ssssaaankkkeeettt"));
}
}
