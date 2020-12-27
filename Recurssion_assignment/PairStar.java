package Recurssion_assignment;
//Pair star
//Send Feedback
//Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
//Input format :
//String S
//Output format :
//Modified string
//Constraints :
//0 <= |S| <= 1000
//where |S| represents length of string S.
//Sample Input 1 :
//hello
//Sample Output 1:
//hel*lo
//Sample Input 2 :
//aaaa
//Sample Output 2 :
//a*a*a*a
public class PairStar {
	public static String pair(String str) {
	 	   if(str.length()==1) {
	 		   return str;
	 	   }String s="";
	 	   if(str.charAt(0)==str.charAt(1)) {
	 		   s=str.charAt(0)+"*";
	 	   }else {
	 		   s=str.charAt(0)+s;
	 	   }
	 	   String smallans=pair(str.substring(1));
	 	  s=s+smallans;
	 	  return s;
	}      
public static void main(String[] args) {
	String s=pair("aasankettss");
System.out.println(s);
}
}
