package Recurssion_assignment;
//Remove X
//Send Feedback
//Given a string, compute recursively a new string where all 'x' chars have been removed.
//Input format :
//String S
//Output format :
//Modified String
//Constraints :
//1 <= |S| <= 10^3
//where |S| represents the length of string S. 
//Sample Input 1 :
//xaxb
//Sample Output 1:
//ab
//Sample Input 2 :
//abc
//Sample Output 2:
//abc
//Sample Input 3 :
//xx
//Sample Output 3:
public class Remove_x {
	public static String removex(String str) {
	if(str.length()==0) {
		return str;
	}String s="";
	if(str.charAt(0)!='x') {
		s=s+str.charAt(0);
	}
	String smallans=removex(str.substring(1));
	s=s+smallans;
	return s;
	}
	public static void main(String[] args) {
		System.out.println(removex("sxxxxxxxxxxxxxxxxAxxxxxxxxxxxxxNxxxxxxxxxxxKxxxxxxxxxxxxxxExxxxxxxxxxxxxxxxxxxTxxxxxxxxxxxxxxxx"));
	}

}
